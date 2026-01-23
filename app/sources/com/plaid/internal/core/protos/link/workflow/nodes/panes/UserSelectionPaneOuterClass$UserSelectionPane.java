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
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Disclaimer;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class UserSelectionPaneOuterClass$UserSelectionPane extends GeneratedMessageLite<UserSelectionPaneOuterClass$UserSelectionPane, C6868a> implements MessageLiteOrBuilder {
    private static final UserSelectionPaneOuterClass$UserSelectionPane DEFAULT_INSTANCE;
    private static volatile Parser<UserSelectionPaneOuterClass$UserSelectionPane> PARSER;

    public static final class Actions extends GeneratedMessageLite<Actions, C6858b> implements MessageLiteOrBuilder {
        private static final Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 2;
        private static volatile Parser<Actions> PARSER = null;
        public static final int SECONDARY_BUTTON_TAP_FIELD_NUMBER = 3;
        public static final int SUBMIT_FIELD_NUMBER = 1;
        public static final int TAP_END_OF_SELECTION_LIST_FIELD_NUMBER = 4;
        private int actionCase_ = 0;
        private Object action_;

        public static final class ExitAction extends GeneratedMessageLite<ExitAction, C6851a> implements MessageLiteOrBuilder {
            private static final ExitAction DEFAULT_INSTANCE;
            private static volatile Parser<ExitAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane$Actions$ExitAction$a */
            public static final class C6851a extends GeneratedMessageLite.Builder<ExitAction, C6851a> implements MessageLiteOrBuilder {
                public C6851a() {
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

            public static C6851a newBuilder() {
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
                switch (C6946x0.f2618a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ExitAction();
                    case 2:
                        return new C6851a();
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

            public static C6851a newBuilder(ExitAction exitAction) {
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

        public static final class SecondaryButtonTapAction extends GeneratedMessageLite<SecondaryButtonTapAction, C6852a> implements MessageLiteOrBuilder {
            private static final SecondaryButtonTapAction DEFAULT_INSTANCE;
            private static volatile Parser<SecondaryButtonTapAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane$Actions$SecondaryButtonTapAction$a */
            public static final class C6852a extends GeneratedMessageLite.Builder<SecondaryButtonTapAction, C6852a> implements MessageLiteOrBuilder {
                public C6852a() {
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

            public static C6852a newBuilder() {
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
                switch (C6946x0.f2618a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SecondaryButtonTapAction();
                    case 2:
                        return new C6852a();
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

            public static C6852a newBuilder(SecondaryButtonTapAction secondaryButtonTapAction) {
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

        public static final class SubmitAction extends GeneratedMessageLite<SubmitAction, C6854a> implements MessageLiteOrBuilder {
            private static final SubmitAction DEFAULT_INSTANCE;
            private static volatile Parser<SubmitAction> PARSER = null;
            public static final int RESPONSES_FIELD_NUMBER = 1;
            private Internal.ProtobufList<Response> responses_ = GeneratedMessageLite.emptyProtobufList();

            public static final class Response extends GeneratedMessageLite<Response, C6853a> implements InterfaceC6855b {
                private static final Response DEFAULT_INSTANCE;
                private static volatile Parser<Response> PARSER = null;
                public static final int RESPONSE_IDS_FIELD_NUMBER = 1;
                public static final int SELECTION_ID_FIELD_NUMBER = 2;
                private String selectionId_ = "";
                private Internal.ProtobufList<String> responseIds_ = GeneratedMessageLite.emptyProtobufList();

                /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane$Actions$SubmitAction$Response$a */
                public static final class C6853a extends GeneratedMessageLite.Builder<Response, C6853a> implements InterfaceC6855b {
                    public C6853a() {
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

                private void addAllResponseIds(Iterable<String> iterable) {
                    ensureResponseIdsIsMutable();
                    AbstractMessageLite.addAll((Iterable) iterable, (List) this.responseIds_);
                }

                private void addResponseIds(String str) {
                    str.getClass();
                    ensureResponseIdsIsMutable();
                    this.responseIds_.add(str);
                }

                private void addResponseIdsBytes(ByteString byteString) throws IllegalArgumentException {
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    ensureResponseIdsIsMutable();
                    this.responseIds_.add(byteString.toStringUtf8());
                }

                private void clearResponseIds() {
                    this.responseIds_ = GeneratedMessageLite.emptyProtobufList();
                }

                private void clearSelectionId() {
                    this.selectionId_ = getDefaultInstance().getSelectionId();
                }

                private void ensureResponseIdsIsMutable() {
                    Internal.ProtobufList<String> protobufList = this.responseIds_;
                    if (protobufList.isModifiable()) {
                        return;
                    }
                    this.responseIds_ = GeneratedMessageLite.mutableCopy(protobufList);
                }

                public static Response getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static C6853a newBuilder() {
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

                private void setResponseIds(int i, String str) {
                    str.getClass();
                    ensureResponseIdsIsMutable();
                    this.responseIds_.set(i, str);
                }

                private void setSelectionId(String str) {
                    str.getClass();
                    this.selectionId_ = str;
                }

                private void setSelectionIdBytes(ByteString byteString) throws IllegalArgumentException {
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    this.selectionId_ = byteString.toStringUtf8();
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    Parser defaultInstanceBasedParser;
                    switch (C6946x0.f2618a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new Response();
                        case 2:
                            return new C6853a();
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002Ȉ", new Object[]{"responseIds_", "selectionId_"});
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

                public String getResponseIds(int i) {
                    return this.responseIds_.get(i);
                }

                public ByteString getResponseIdsBytes(int i) {
                    return ByteString.copyFromUtf8(this.responseIds_.get(i));
                }

                public int getResponseIdsCount() {
                    return this.responseIds_.size();
                }

                public List<String> getResponseIdsList() {
                    return this.responseIds_;
                }

                public String getSelectionId() {
                    return this.selectionId_;
                }

                public ByteString getSelectionIdBytes() {
                    return ByteString.copyFromUtf8(this.selectionId_);
                }

                public static C6853a newBuilder(Response response) {
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

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane$Actions$SubmitAction$a */
            public static final class C6854a extends GeneratedMessageLite.Builder<SubmitAction, C6854a> implements MessageLiteOrBuilder {
                public C6854a() {
                    super(SubmitAction.DEFAULT_INSTANCE);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane$Actions$SubmitAction$b */
            public interface InterfaceC6855b extends MessageLiteOrBuilder {
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

            public static C6854a newBuilder() {
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
                switch (C6946x0.f2618a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SubmitAction();
                    case 2:
                        return new C6854a();
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

            public InterfaceC6855b getResponsesOrBuilder(int i) {
                return this.responses_.get(i);
            }

            public List<? extends InterfaceC6855b> getResponsesOrBuilderList() {
                return this.responses_;
            }

            public static C6854a newBuilder(SubmitAction submitAction) {
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

        public static final class TapEndOfSelectionListAction extends GeneratedMessageLite<TapEndOfSelectionListAction, C6856a> implements MessageLiteOrBuilder {
            private static final TapEndOfSelectionListAction DEFAULT_INSTANCE;
            private static volatile Parser<TapEndOfSelectionListAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane$Actions$TapEndOfSelectionListAction$a */
            public static final class C6856a extends GeneratedMessageLite.Builder<TapEndOfSelectionListAction, C6856a> implements MessageLiteOrBuilder {
                public C6856a() {
                    super(TapEndOfSelectionListAction.DEFAULT_INSTANCE);
                }
            }

            static {
                TapEndOfSelectionListAction tapEndOfSelectionListAction = new TapEndOfSelectionListAction();
                DEFAULT_INSTANCE = tapEndOfSelectionListAction;
                GeneratedMessageLite.registerDefaultInstance(TapEndOfSelectionListAction.class, tapEndOfSelectionListAction);
            }

            private TapEndOfSelectionListAction() {
            }

            public static TapEndOfSelectionListAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6856a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static TapEndOfSelectionListAction parseDelimitedFrom(InputStream inputStream) {
                return (TapEndOfSelectionListAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TapEndOfSelectionListAction parseFrom(ByteBuffer byteBuffer) {
                return (TapEndOfSelectionListAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<TapEndOfSelectionListAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6946x0.f2618a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new TapEndOfSelectionListAction();
                    case 2:
                        return new C6856a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<TapEndOfSelectionListAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (TapEndOfSelectionListAction.class) {
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

            public static C6856a newBuilder(TapEndOfSelectionListAction tapEndOfSelectionListAction) {
                return DEFAULT_INSTANCE.createBuilder(tapEndOfSelectionListAction);
            }

            public static TapEndOfSelectionListAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TapEndOfSelectionListAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static TapEndOfSelectionListAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (TapEndOfSelectionListAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static TapEndOfSelectionListAction parseFrom(ByteString byteString) {
                return (TapEndOfSelectionListAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static TapEndOfSelectionListAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (TapEndOfSelectionListAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static TapEndOfSelectionListAction parseFrom(byte[] bArr) {
                return (TapEndOfSelectionListAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static TapEndOfSelectionListAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (TapEndOfSelectionListAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static TapEndOfSelectionListAction parseFrom(InputStream inputStream) {
                return (TapEndOfSelectionListAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TapEndOfSelectionListAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TapEndOfSelectionListAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static TapEndOfSelectionListAction parseFrom(CodedInputStream codedInputStream) {
                return (TapEndOfSelectionListAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static TapEndOfSelectionListAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TapEndOfSelectionListAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane$Actions$a */
        public enum EnumC6857a {
            SUBMIT(1),
            SECONDARY_BUTTON_TAP(3),
            EXIT(2),
            TAP_END_OF_SELECTION_LIST(4),
            ACTION_NOT_SET(0);


            /* renamed from: a */
            public final int f2492a;

            EnumC6857a(int i) {
                this.f2492a = i;
            }

            public static EnumC6857a forNumber(int i) {
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
                if (i != 4) {
                    return null;
                }
                return TAP_END_OF_SELECTION_LIST;
            }

            public int getNumber() {
                return this.f2492a;
            }

            @Deprecated
            public static EnumC6857a valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane$Actions$b */
        public static final class C6858b extends GeneratedMessageLite.Builder<Actions, C6858b> implements MessageLiteOrBuilder {
            public C6858b() {
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

        private void clearSecondaryButtonTap() {
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

        private void clearTapEndOfSelectionList() {
            if (this.actionCase_ == 4) {
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
                this.action_ = ExitAction.newBuilder((ExitAction) this.action_).mergeFrom((ExitAction.C6851a) exitAction).buildPartial();
            }
            this.actionCase_ = 2;
        }

        private void mergeSecondaryButtonTap(SecondaryButtonTapAction secondaryButtonTapAction) {
            secondaryButtonTapAction.getClass();
            if (this.actionCase_ != 3 || this.action_ == SecondaryButtonTapAction.getDefaultInstance()) {
                this.action_ = secondaryButtonTapAction;
            } else {
                this.action_ = SecondaryButtonTapAction.newBuilder((SecondaryButtonTapAction) this.action_).mergeFrom((SecondaryButtonTapAction.C6852a) secondaryButtonTapAction).buildPartial();
            }
            this.actionCase_ = 3;
        }

        private void mergeSubmit(SubmitAction submitAction) {
            submitAction.getClass();
            if (this.actionCase_ != 1 || this.action_ == SubmitAction.getDefaultInstance()) {
                this.action_ = submitAction;
            } else {
                this.action_ = SubmitAction.newBuilder((SubmitAction) this.action_).mergeFrom((SubmitAction.C6854a) submitAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        private void mergeTapEndOfSelectionList(TapEndOfSelectionListAction tapEndOfSelectionListAction) {
            tapEndOfSelectionListAction.getClass();
            if (this.actionCase_ != 4 || this.action_ == TapEndOfSelectionListAction.getDefaultInstance()) {
                this.action_ = tapEndOfSelectionListAction;
            } else {
                this.action_ = TapEndOfSelectionListAction.newBuilder((TapEndOfSelectionListAction) this.action_).mergeFrom((TapEndOfSelectionListAction.C6856a) tapEndOfSelectionListAction).buildPartial();
            }
            this.actionCase_ = 4;
        }

        public static C6858b newBuilder() {
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

        private void setSecondaryButtonTap(SecondaryButtonTapAction secondaryButtonTapAction) {
            secondaryButtonTapAction.getClass();
            this.action_ = secondaryButtonTapAction;
            this.actionCase_ = 3;
        }

        private void setSubmit(SubmitAction submitAction) {
            submitAction.getClass();
            this.action_ = submitAction;
            this.actionCase_ = 1;
        }

        private void setTapEndOfSelectionList(TapEndOfSelectionListAction tapEndOfSelectionListAction) {
            tapEndOfSelectionListAction.getClass();
            this.action_ = tapEndOfSelectionListAction;
            this.actionCase_ = 4;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6946x0.f2618a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Actions();
                case 2:
                    return new C6858b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"action_", "actionCase_", SubmitAction.class, ExitAction.class, SecondaryButtonTapAction.class, TapEndOfSelectionListAction.class});
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

        public EnumC6857a getActionCase() {
            return EnumC6857a.forNumber(this.actionCase_);
        }

        public ExitAction getExit() {
            return this.actionCase_ == 2 ? (ExitAction) this.action_ : ExitAction.getDefaultInstance();
        }

        public SecondaryButtonTapAction getSecondaryButtonTap() {
            return this.actionCase_ == 3 ? (SecondaryButtonTapAction) this.action_ : SecondaryButtonTapAction.getDefaultInstance();
        }

        public SubmitAction getSubmit() {
            return this.actionCase_ == 1 ? (SubmitAction) this.action_ : SubmitAction.getDefaultInstance();
        }

        public TapEndOfSelectionListAction getTapEndOfSelectionList() {
            return this.actionCase_ == 4 ? (TapEndOfSelectionListAction) this.action_ : TapEndOfSelectionListAction.getDefaultInstance();
        }

        public boolean hasExit() {
            return this.actionCase_ == 2;
        }

        public boolean hasSecondaryButtonTap() {
            return this.actionCase_ == 3;
        }

        public boolean hasSubmit() {
            return this.actionCase_ == 1;
        }

        public boolean hasTapEndOfSelectionList() {
            return this.actionCase_ == 4;
        }

        public static C6858b newBuilder(Actions actions) {
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

    public static final class Rendering extends GeneratedMessageLite<Rendering, C6863a> implements MessageLiteOrBuilder {
        public static final int BUTTON_DISCLAIMER_TEXT_FIELD_NUMBER = 12;
        public static final int BUTTON_FIELD_NUMBER = 7;
        private static final Rendering DEFAULT_INSTANCE;
        public static final int DISCLAIMER_FIELD_NUMBER = 16;
        public static final int END_OF_SELECTION_FLEXIBLE_COMPONENTS_FIELD_NUMBER = 18;
        public static final int END_OF_SELECTION_LIST_BUTTON_FIELD_NUMBER = 15;
        public static final int EVENTS_FIELD_NUMBER = 9;
        public static final int HEADER_ASSET_FIELD_NUMBER = 4;
        public static final int HEADER_FIELD_NUMBER = 5;
        public static final int INSTITUTION_FIELD_NUMBER = 2;
        public static final int PANE_HEADER_FIELD_NUMBER = 13;
        private static volatile Parser<Rendering> PARSER = null;
        public static final int SECONDARY_BUTTON_FIELD_NUMBER = 8;
        public static final int SELECTIONS_FIELD_NUMBER = 6;
        public static final int SELECTION_TILE_STYLE_OVERRIDE_FIELD_NUMBER = 19;
        public static final int SELECT_ALL_TOGGLE_FIELD_NUMBER = 14;
        public static final int UNSELECT_CONFIRMATION_MODAL_FIELD_NUMBER = 11;
        private int bitField0_;
        private Common$AttributedLocalizedString buttonDisclaimerText_;
        private Common$ButtonContent button_;
        private Common$Disclaimer disclaimer_;
        private Common$ButtonContent endOfSelectionListButton_;
        private Events events_;
        private Common$RenderedAssetAppearance headerAsset_;
        private Common$LocalizedString header_;
        private Common$RenderedInstitution institution_;
        private Common$PaneHeader paneHeader_;
        private Common$ButtonContent secondaryButton_;
        private SelectAllToggle selectAllToggle_;
        private SelectionTileStyleOverride selectionTileStyleOverride_;
        private Common$Modal unselectConfirmationModal_;
        private Internal.ProtobufList<Selection> selections_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<Common$FlexibleComponent> endOfSelectionFlexibleComponents_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Events extends GeneratedMessageLite<Events, C6859a> implements MessageLiteOrBuilder {
            private static final Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            public static final int ON_SECONDARY_BUTTON_TAP_FIELD_NUMBER = 3;
            public static final int ON_SUBMIT_TAP_FIELD_NUMBER = 2;
            public static final int ON_TAP_END_OF_SELECTION_LIST_FIELD_NUMBER = 4;
            private static volatile Parser<Events> PARSER;
            private int bitField0_;
            private Internal.ProtobufList<Common$SDKEvent> onAppear_ = GeneratedMessageLite.emptyProtobufList();
            private Common$SDKEvent onSecondaryButtonTap_;
            private Common$SDKEvent onSubmitTap_;
            private Common$SDKEvent onTapEndOfSelectionList_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane$Rendering$Events$a */
            public static final class C6859a extends GeneratedMessageLite.Builder<Events, C6859a> implements MessageLiteOrBuilder {
                public C6859a() {
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

            private void clearOnSecondaryButtonTap() {
                this.onSecondaryButtonTap_ = null;
                this.bitField0_ &= -3;
            }

            private void clearOnSubmitTap() {
                this.onSubmitTap_ = null;
                this.bitField0_ &= -2;
            }

            private void clearOnTapEndOfSelectionList() {
                this.onTapEndOfSelectionList_ = null;
                this.bitField0_ &= -5;
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

            private void mergeOnSubmitTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onSubmitTap_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == Common$SDKEvent.getDefaultInstance()) {
                    this.onSubmitTap_ = common$SDKEvent;
                } else {
                    this.onSubmitTap_ = Common$SDKEvent.newBuilder(this.onSubmitTap_).mergeFrom((Common$SDKEvent.C6479a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            private void mergeOnTapEndOfSelectionList(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                Common$SDKEvent common$SDKEvent2 = this.onTapEndOfSelectionList_;
                if (common$SDKEvent2 == null || common$SDKEvent2 == Common$SDKEvent.getDefaultInstance()) {
                    this.onTapEndOfSelectionList_ = common$SDKEvent;
                } else {
                    this.onTapEndOfSelectionList_ = Common$SDKEvent.newBuilder(this.onTapEndOfSelectionList_).mergeFrom((Common$SDKEvent.C6479a) common$SDKEvent).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            public static C6859a newBuilder() {
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

            private void setOnSecondaryButtonTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onSecondaryButtonTap_ = common$SDKEvent;
                this.bitField0_ |= 2;
            }

            private void setOnSubmitTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onSubmitTap_ = common$SDKEvent;
                this.bitField0_ |= 1;
            }

            private void setOnTapEndOfSelectionList(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                this.onTapEndOfSelectionList_ = common$SDKEvent;
                this.bitField0_ |= 4;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6946x0.f2618a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Events();
                    case 2:
                        return new C6859a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"bitField0_", "onAppear_", Common$SDKEvent.class, "onSubmitTap_", "onSecondaryButtonTap_", "onTapEndOfSelectionList_"});
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

            public Common$SDKEvent getOnSecondaryButtonTap() {
                Common$SDKEvent common$SDKEvent = this.onSecondaryButtonTap_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public Common$SDKEvent getOnSubmitTap() {
                Common$SDKEvent common$SDKEvent = this.onSubmitTap_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public Common$SDKEvent getOnTapEndOfSelectionList() {
                Common$SDKEvent common$SDKEvent = this.onTapEndOfSelectionList_;
                return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
            }

            public boolean hasOnSecondaryButtonTap() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasOnSubmitTap() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasOnTapEndOfSelectionList() {
                return (this.bitField0_ & 4) != 0;
            }

            public static C6859a newBuilder(Events events) {
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

        public static final class Selection extends GeneratedMessageLite<Selection, C6860a> implements InterfaceC6864b {
            public static final int ATTRIBUTED_PROMPT_FIELD_NUMBER = 5;
            public static final int BEHAVIOR_FIELD_NUMBER = 3;
            private static final Selection DEFAULT_INSTANCE;
            public static final int ID_FIELD_NUMBER = 4;
            private static volatile Parser<Selection> PARSER = null;
            public static final int PROMPT_FIELD_NUMBER = 1;
            public static final int RESPONSES_FIELD_NUMBER = 2;
            public static final int RESPONSE_RENDERING_MODE_FIELD_NUMBER = 17;
            private Common$AttributedLocalizedString attributedPrompt_;
            private int behavior_;
            private int bitField0_;
            private Common$LocalizedString prompt_;
            private int responseRenderingMode_;
            private String id_ = "";
            private Internal.ProtobufList<Common$SelectionListItem> responses_ = GeneratedMessageLite.emptyProtobufList();

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane$Rendering$Selection$a */
            public static final class C6860a extends GeneratedMessageLite.Builder<Selection, C6860a> implements InterfaceC6864b {
                public C6860a() {
                    super(Selection.DEFAULT_INSTANCE);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane$Rendering$Selection$b */
            public enum EnumC6861b implements Internal.EnumLite {
                RESPONSE_RENDERING_MODE_UNKNOWN(0),
                RESPONSE_RENDERING_MODE_THREADS_5_LIST_ITEM(1),
                RESPONSE_RENDERING_MODE_THREADS_5_LIST(2),
                UNRECOGNIZED(-1);

                public static final int RESPONSE_RENDERING_MODE_THREADS_5_LIST_ITEM_VALUE = 1;
                public static final int RESPONSE_RENDERING_MODE_THREADS_5_LIST_VALUE = 2;
                public static final int RESPONSE_RENDERING_MODE_UNKNOWN_VALUE = 0;

                /* renamed from: b */
                public static final a f2493b = new a();

                /* renamed from: a */
                public final int f2495a;

                /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane$Rendering$Selection$b$a */
                public class a implements Internal.EnumLiteMap<EnumC6861b> {
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public final Internal.EnumLite findValueByNumber(int i) {
                        return EnumC6861b.forNumber(i);
                    }
                }

                /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane$Rendering$Selection$b$b */
                public static final class b implements Internal.EnumVerifier {

                    /* renamed from: a */
                    public static final b f2496a = new b();

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public final boolean isInRange(int i) {
                        return EnumC6861b.forNumber(i) != null;
                    }
                }

                EnumC6861b(int i) {
                    this.f2495a = i;
                }

                public static EnumC6861b forNumber(int i) {
                    if (i == 0) {
                        return RESPONSE_RENDERING_MODE_UNKNOWN;
                    }
                    if (i == 1) {
                        return RESPONSE_RENDERING_MODE_THREADS_5_LIST_ITEM;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return RESPONSE_RENDERING_MODE_THREADS_5_LIST;
                }

                public static Internal.EnumLiteMap<EnumC6861b> internalGetValueMap() {
                    return f2493b;
                }

                public static Internal.EnumVerifier internalGetVerifier() {
                    return b.f2496a;
                }

                @Override // com.google.protobuf.Internal.EnumLite
                public final int getNumber() {
                    if (this != UNRECOGNIZED) {
                        return this.f2495a;
                    }
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }

                @Deprecated
                public static EnumC6861b valueOf(int i) {
                    return forNumber(i);
                }
            }

            static {
                Selection selection = new Selection();
                DEFAULT_INSTANCE = selection;
                GeneratedMessageLite.registerDefaultInstance(Selection.class, selection);
            }

            private Selection() {
            }

            private void addAllResponses(Iterable<? extends Common$SelectionListItem> iterable) {
                ensureResponsesIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.responses_);
            }

            private void addResponses(Common$SelectionListItem common$SelectionListItem) {
                common$SelectionListItem.getClass();
                ensureResponsesIsMutable();
                this.responses_.add(common$SelectionListItem);
            }

            private void clearAttributedPrompt() {
                this.attributedPrompt_ = null;
                this.bitField0_ &= -3;
            }

            private void clearBehavior() {
                this.behavior_ = 0;
            }

            private void clearId() {
                this.id_ = getDefaultInstance().getId();
            }

            private void clearPrompt() {
                this.prompt_ = null;
                this.bitField0_ &= -2;
            }

            private void clearResponseRenderingMode() {
                this.responseRenderingMode_ = 0;
            }

            private void clearResponses() {
                this.responses_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void ensureResponsesIsMutable() {
                Internal.ProtobufList<Common$SelectionListItem> protobufList = this.responses_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.responses_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static Selection getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeAttributedPrompt(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.attributedPrompt_;
                if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                    this.attributedPrompt_ = common$AttributedLocalizedString;
                } else {
                    this.attributedPrompt_ = Common$AttributedLocalizedString.newBuilder(this.attributedPrompt_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergePrompt(Common$LocalizedString common$LocalizedString) {
                common$LocalizedString.getClass();
                Common$LocalizedString common$LocalizedString2 = this.prompt_;
                if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
                    this.prompt_ = common$LocalizedString;
                } else {
                    this.prompt_ = Common$LocalizedString.newBuilder(this.prompt_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6860a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Selection parseDelimitedFrom(InputStream inputStream) {
                return (Selection) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Selection parseFrom(ByteBuffer byteBuffer) {
                return (Selection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Selection> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeResponses(int i) {
                ensureResponsesIsMutable();
                this.responses_.remove(i);
            }

            private void setAttributedPrompt(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                this.attributedPrompt_ = common$AttributedLocalizedString;
                this.bitField0_ |= 2;
            }

            private void setBehavior(EnumC6693O enumC6693O) {
                this.behavior_ = enumC6693O.getNumber();
            }

            private void setBehaviorValue(int i) {
                this.behavior_ = i;
            }

            private void setId(String str) {
                str.getClass();
                this.id_ = str;
            }

            private void setIdBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.id_ = byteString.toStringUtf8();
            }

            private void setPrompt(Common$LocalizedString common$LocalizedString) {
                common$LocalizedString.getClass();
                this.prompt_ = common$LocalizedString;
                this.bitField0_ |= 1;
            }

            private void setResponseRenderingMode(EnumC6861b enumC6861b) {
                this.responseRenderingMode_ = enumC6861b.getNumber();
            }

            private void setResponseRenderingModeValue(int i) {
                this.responseRenderingMode_ = i;
            }

            private void setResponses(int i, Common$SelectionListItem common$SelectionListItem) {
                common$SelectionListItem.getClass();
                ensureResponsesIsMutable();
                this.responses_.set(i, common$SelectionListItem);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6946x0.f2618a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Selection();
                    case 2:
                        return new C6860a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0011\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003\f\u0004Ȉ\u0005ဉ\u0001\u0011\f", new Object[]{"bitField0_", "prompt_", "responses_", Common$SelectionListItem.class, "behavior_", "id_", "attributedPrompt_", "responseRenderingMode_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Selection> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Selection.class) {
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

            public Common$AttributedLocalizedString getAttributedPrompt() {
                Common$AttributedLocalizedString common$AttributedLocalizedString = this.attributedPrompt_;
                return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
            }

            public EnumC6693O getBehavior() {
                EnumC6693O enumC6693OForNumber = EnumC6693O.forNumber(this.behavior_);
                return enumC6693OForNumber == null ? EnumC6693O.UNRECOGNIZED : enumC6693OForNumber;
            }

            public int getBehaviorValue() {
                return this.behavior_;
            }

            public String getId() {
                return this.id_;
            }

            public ByteString getIdBytes() {
                return ByteString.copyFromUtf8(this.id_);
            }

            public Common$LocalizedString getPrompt() {
                Common$LocalizedString common$LocalizedString = this.prompt_;
                return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
            }

            public EnumC6861b getResponseRenderingMode() {
                EnumC6861b enumC6861bForNumber = EnumC6861b.forNumber(this.responseRenderingMode_);
                return enumC6861bForNumber == null ? EnumC6861b.UNRECOGNIZED : enumC6861bForNumber;
            }

            public int getResponseRenderingModeValue() {
                return this.responseRenderingMode_;
            }

            public Common$SelectionListItem getResponses(int i) {
                return this.responses_.get(i);
            }

            public int getResponsesCount() {
                return this.responses_.size();
            }

            public List<Common$SelectionListItem> getResponsesList() {
                return this.responses_;
            }

            public InterfaceC6720P getResponsesOrBuilder(int i) {
                return this.responses_.get(i);
            }

            public List<? extends InterfaceC6720P> getResponsesOrBuilderList() {
                return this.responses_;
            }

            public boolean hasAttributedPrompt() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasPrompt() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C6860a newBuilder(Selection selection) {
                return DEFAULT_INSTANCE.createBuilder(selection);
            }

            public static Selection parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Selection) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Selection parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Selection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Selection parseFrom(ByteString byteString) {
                return (Selection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void addResponses(int i, Common$SelectionListItem common$SelectionListItem) {
                common$SelectionListItem.getClass();
                ensureResponsesIsMutable();
                this.responses_.add(i, common$SelectionListItem);
            }

            public static Selection parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Selection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Selection parseFrom(byte[] bArr) {
                return (Selection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Selection parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Selection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Selection parseFrom(InputStream inputStream) {
                return (Selection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Selection parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Selection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Selection parseFrom(CodedInputStream codedInputStream) {
                return (Selection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Selection parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Selection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SelectionTileStyleOverride extends GeneratedMessageLite<SelectionTileStyleOverride, C6862a> implements MessageLiteOrBuilder {
            private static final SelectionTileStyleOverride DEFAULT_INSTANCE;
            private static volatile Parser<SelectionTileStyleOverride> PARSER = null;
            public static final int TILE_STYLE_OVERRIDE_FIELD_NUMBER = 1;
            private int tileStyleOverride_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane$Rendering$SelectionTileStyleOverride$a */
            public static final class C6862a extends GeneratedMessageLite.Builder<SelectionTileStyleOverride, C6862a> implements MessageLiteOrBuilder {
                public C6862a() {
                    super(SelectionTileStyleOverride.DEFAULT_INSTANCE);
                }
            }

            static {
                SelectionTileStyleOverride selectionTileStyleOverride = new SelectionTileStyleOverride();
                DEFAULT_INSTANCE = selectionTileStyleOverride;
                GeneratedMessageLite.registerDefaultInstance(SelectionTileStyleOverride.class, selectionTileStyleOverride);
            }

            private SelectionTileStyleOverride() {
            }

            private void clearTileStyleOverride() {
                this.tileStyleOverride_ = 0;
            }

            public static SelectionTileStyleOverride getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6862a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static SelectionTileStyleOverride parseDelimitedFrom(InputStream inputStream) {
                return (SelectionTileStyleOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SelectionTileStyleOverride parseFrom(ByteBuffer byteBuffer) {
                return (SelectionTileStyleOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<SelectionTileStyleOverride> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setTileStyleOverride(EnumC6865c enumC6865c) {
                this.tileStyleOverride_ = enumC6865c.getNumber();
            }

            private void setTileStyleOverrideValue(int i) {
                this.tileStyleOverride_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6946x0.f2618a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SelectionTileStyleOverride();
                    case 2:
                        return new C6862a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"tileStyleOverride_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<SelectionTileStyleOverride> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (SelectionTileStyleOverride.class) {
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

            public EnumC6865c getTileStyleOverride() {
                EnumC6865c enumC6865cForNumber = EnumC6865c.forNumber(this.tileStyleOverride_);
                return enumC6865cForNumber == null ? EnumC6865c.UNRECOGNIZED : enumC6865cForNumber;
            }

            public int getTileStyleOverrideValue() {
                return this.tileStyleOverride_;
            }

            public static C6862a newBuilder(SelectionTileStyleOverride selectionTileStyleOverride) {
                return DEFAULT_INSTANCE.createBuilder(selectionTileStyleOverride);
            }

            public static SelectionTileStyleOverride parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SelectionTileStyleOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SelectionTileStyleOverride parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (SelectionTileStyleOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static SelectionTileStyleOverride parseFrom(ByteString byteString) {
                return (SelectionTileStyleOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static SelectionTileStyleOverride parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (SelectionTileStyleOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static SelectionTileStyleOverride parseFrom(byte[] bArr) {
                return (SelectionTileStyleOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static SelectionTileStyleOverride parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (SelectionTileStyleOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static SelectionTileStyleOverride parseFrom(InputStream inputStream) {
                return (SelectionTileStyleOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SelectionTileStyleOverride parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SelectionTileStyleOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SelectionTileStyleOverride parseFrom(CodedInputStream codedInputStream) {
                return (SelectionTileStyleOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static SelectionTileStyleOverride parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SelectionTileStyleOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane$Rendering$a */
        public static final class C6863a extends GeneratedMessageLite.Builder<Rendering, C6863a> implements MessageLiteOrBuilder {
            public C6863a() {
                super(Rendering.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane$Rendering$b */
        public interface InterfaceC6864b extends MessageLiteOrBuilder {
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane$Rendering$c */
        public enum EnumC6865c implements Internal.EnumLite {
            TILE_STYLE_UNKNOWN(0),
            TILE_STYLE_VARIATION_1(1),
            UNRECOGNIZED(-1);

            public static final int TILE_STYLE_UNKNOWN_VALUE = 0;
            public static final int TILE_STYLE_VARIATION_1_VALUE = 1;

            /* renamed from: b */
            public static final a f2497b = new a();

            /* renamed from: a */
            public final int f2499a;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane$Rendering$c$a */
            public class a implements Internal.EnumLiteMap<EnumC6865c> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final Internal.EnumLite findValueByNumber(int i) {
                    return EnumC6865c.forNumber(i);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane$Rendering$c$b */
            public static final class b implements Internal.EnumVerifier {

                /* renamed from: a */
                public static final b f2500a = new b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return EnumC6865c.forNumber(i) != null;
                }
            }

            EnumC6865c(int i) {
                this.f2499a = i;
            }

            public static EnumC6865c forNumber(int i) {
                if (i == 0) {
                    return TILE_STYLE_UNKNOWN;
                }
                if (i != 1) {
                    return null;
                }
                return TILE_STYLE_VARIATION_1;
            }

            public static Internal.EnumLiteMap<EnumC6865c> internalGetValueMap() {
                return f2497b;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return b.f2500a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f2499a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static EnumC6865c valueOf(int i) {
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

        private void addAllEndOfSelectionFlexibleComponents(Iterable<? extends Common$FlexibleComponent> iterable) {
            ensureEndOfSelectionFlexibleComponentsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.endOfSelectionFlexibleComponents_);
        }

        private void addAllSelections(Iterable<? extends Selection> iterable) {
            ensureSelectionsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.selections_);
        }

        private void addEndOfSelectionFlexibleComponents(Common$FlexibleComponent common$FlexibleComponent) {
            common$FlexibleComponent.getClass();
            ensureEndOfSelectionFlexibleComponentsIsMutable();
            this.endOfSelectionFlexibleComponents_.add(common$FlexibleComponent);
        }

        private void addSelections(Selection selection) {
            selection.getClass();
            ensureSelectionsIsMutable();
            this.selections_.add(selection);
        }

        private void clearButton() {
            this.button_ = null;
            this.bitField0_ &= -65;
        }

        private void clearButtonDisclaimerText() {
            this.buttonDisclaimerText_ = null;
            this.bitField0_ &= -33;
        }

        private void clearDisclaimer() {
            this.disclaimer_ = null;
            this.bitField0_ &= -4097;
        }

        private void clearEndOfSelectionFlexibleComponents() {
            this.endOfSelectionFlexibleComponents_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearEndOfSelectionListButton() {
            this.endOfSelectionListButton_ = null;
            this.bitField0_ &= -257;
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -1025;
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

        private void clearPaneHeader() {
            this.paneHeader_ = null;
            this.bitField0_ &= -3;
        }

        private void clearSecondaryButton() {
            this.secondaryButton_ = null;
            this.bitField0_ &= -129;
        }

        private void clearSelectAllToggle() {
            this.selectAllToggle_ = null;
            this.bitField0_ &= -17;
        }

        private void clearSelectionTileStyleOverride() {
            this.selectionTileStyleOverride_ = null;
            this.bitField0_ &= -513;
        }

        private void clearSelections() {
            this.selections_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearUnselectConfirmationModal() {
            this.unselectConfirmationModal_ = null;
            this.bitField0_ &= -2049;
        }

        private void ensureEndOfSelectionFlexibleComponentsIsMutable() {
            Internal.ProtobufList<Common$FlexibleComponent> protobufList = this.endOfSelectionFlexibleComponents_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.endOfSelectionFlexibleComponents_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureSelectionsIsMutable() {
            Internal.ProtobufList<Selection> protobufList = this.selections_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.selections_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static Rendering getDefaultInstance() {
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
            this.bitField0_ |= 64;
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

        private void mergeDisclaimer(Common$Disclaimer common$Disclaimer) {
            common$Disclaimer.getClass();
            Common$Disclaimer common$Disclaimer2 = this.disclaimer_;
            if (common$Disclaimer2 == null || common$Disclaimer2 == Common$Disclaimer.getDefaultInstance()) {
                this.disclaimer_ = common$Disclaimer;
            } else {
                this.disclaimer_ = Common$Disclaimer.newBuilder(this.disclaimer_).mergeFrom((Common$Disclaimer.C6416a) common$Disclaimer).buildPartial();
            }
            this.bitField0_ |= 4096;
        }

        private void mergeEndOfSelectionListButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            Common$ButtonContent common$ButtonContent2 = this.endOfSelectionListButton_;
            if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                this.endOfSelectionListButton_ = common$ButtonContent;
            } else {
                this.endOfSelectionListButton_ = Common$ButtonContent.newBuilder(this.endOfSelectionListButton_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
            }
            this.bitField0_ |= 256;
        }

        private void mergeEvents(Events events) {
            events.getClass();
            Events events2 = this.events_;
            if (events2 == null || events2 == Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = Events.newBuilder(this.events_).mergeFrom((Events.C6859a) events).buildPartial();
            }
            this.bitField0_ |= 1024;
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
            this.bitField0_ |= 128;
        }

        private void mergeSelectAllToggle(SelectAllToggle selectAllToggle) {
            selectAllToggle.getClass();
            SelectAllToggle selectAllToggle2 = this.selectAllToggle_;
            if (selectAllToggle2 == null || selectAllToggle2 == SelectAllToggle.getDefaultInstance()) {
                this.selectAllToggle_ = selectAllToggle;
            } else {
                this.selectAllToggle_ = SelectAllToggle.newBuilder(this.selectAllToggle_).mergeFrom((SelectAllToggle.C6866a) selectAllToggle).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        private void mergeSelectionTileStyleOverride(SelectionTileStyleOverride selectionTileStyleOverride) {
            selectionTileStyleOverride.getClass();
            SelectionTileStyleOverride selectionTileStyleOverride2 = this.selectionTileStyleOverride_;
            if (selectionTileStyleOverride2 == null || selectionTileStyleOverride2 == SelectionTileStyleOverride.getDefaultInstance()) {
                this.selectionTileStyleOverride_ = selectionTileStyleOverride;
            } else {
                this.selectionTileStyleOverride_ = SelectionTileStyleOverride.newBuilder(this.selectionTileStyleOverride_).mergeFrom((SelectionTileStyleOverride.C6862a) selectionTileStyleOverride).buildPartial();
            }
            this.bitField0_ |= 512;
        }

        private void mergeUnselectConfirmationModal(Common$Modal common$Modal) {
            common$Modal.getClass();
            Common$Modal common$Modal2 = this.unselectConfirmationModal_;
            if (common$Modal2 == null || common$Modal2 == Common$Modal.getDefaultInstance()) {
                this.unselectConfirmationModal_ = common$Modal;
            } else {
                this.unselectConfirmationModal_ = Common$Modal.newBuilder(this.unselectConfirmationModal_).mergeFrom((Common$Modal.C6446a) common$Modal).buildPartial();
            }
            this.bitField0_ |= 2048;
        }

        public static C6863a newBuilder() {
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

        private void removeEndOfSelectionFlexibleComponents(int i) {
            ensureEndOfSelectionFlexibleComponentsIsMutable();
            this.endOfSelectionFlexibleComponents_.remove(i);
        }

        private void removeSelections(int i) {
            ensureSelectionsIsMutable();
            this.selections_.remove(i);
        }

        private void setButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.button_ = common$ButtonContent;
            this.bitField0_ |= 64;
        }

        private void setButtonDisclaimerText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.buttonDisclaimerText_ = common$AttributedLocalizedString;
            this.bitField0_ |= 32;
        }

        private void setDisclaimer(Common$Disclaimer common$Disclaimer) {
            common$Disclaimer.getClass();
            this.disclaimer_ = common$Disclaimer;
            this.bitField0_ |= 4096;
        }

        private void setEndOfSelectionFlexibleComponents(int i, Common$FlexibleComponent common$FlexibleComponent) {
            common$FlexibleComponent.getClass();
            ensureEndOfSelectionFlexibleComponentsIsMutable();
            this.endOfSelectionFlexibleComponents_.set(i, common$FlexibleComponent);
        }

        private void setEndOfSelectionListButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.endOfSelectionListButton_ = common$ButtonContent;
            this.bitField0_ |= 256;
        }

        private void setEvents(Events events) {
            events.getClass();
            this.events_ = events;
            this.bitField0_ |= 1024;
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

        private void setPaneHeader(Common$PaneHeader common$PaneHeader) {
            common$PaneHeader.getClass();
            this.paneHeader_ = common$PaneHeader;
            this.bitField0_ |= 2;
        }

        private void setSecondaryButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.secondaryButton_ = common$ButtonContent;
            this.bitField0_ |= 128;
        }

        private void setSelectAllToggle(SelectAllToggle selectAllToggle) {
            selectAllToggle.getClass();
            this.selectAllToggle_ = selectAllToggle;
            this.bitField0_ |= 16;
        }

        private void setSelectionTileStyleOverride(SelectionTileStyleOverride selectionTileStyleOverride) {
            selectionTileStyleOverride.getClass();
            this.selectionTileStyleOverride_ = selectionTileStyleOverride;
            this.bitField0_ |= 512;
        }

        private void setSelections(int i, Selection selection) {
            selection.getClass();
            ensureSelectionsIsMutable();
            this.selections_.set(i, selection);
        }

        private void setUnselectConfirmationModal(Common$Modal common$Modal) {
            common$Modal.getClass();
            this.unselectConfirmationModal_ = common$Modal;
            this.bitField0_ |= 2048;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6946x0.f2618a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Rendering();
                case 2:
                    return new C6863a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0001\u0002\u0013\u000f\u0000\u0002\u0000\u0002ဉ\u0000\u0004ဉ\u0002\u0005ဉ\u0003\u0006\u001b\u0007ဉ\u0006\bဉ\u0007\tဉ\n\u000bဉ\u000b\fဉ\u0005\rဉ\u0001\u000eဉ\u0004\u000fဉ\b\u0010ဉ\f\u0012\u001b\u0013ဉ\t", new Object[]{"bitField0_", "institution_", "headerAsset_", "header_", "selections_", Selection.class, "button_", "secondaryButton_", "events_", "unselectConfirmationModal_", "buttonDisclaimerText_", "paneHeader_", "selectAllToggle_", "endOfSelectionListButton_", "disclaimer_", "endOfSelectionFlexibleComponents_", Common$FlexibleComponent.class, "selectionTileStyleOverride_"});
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

        public Common$ButtonContent getButton() {
            Common$ButtonContent common$ButtonContent = this.button_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public Common$AttributedLocalizedString getButtonDisclaimerText() {
            Common$AttributedLocalizedString common$AttributedLocalizedString = this.buttonDisclaimerText_;
            return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public Common$Disclaimer getDisclaimer() {
            Common$Disclaimer common$Disclaimer = this.disclaimer_;
            return common$Disclaimer == null ? Common$Disclaimer.getDefaultInstance() : common$Disclaimer;
        }

        public Common$FlexibleComponent getEndOfSelectionFlexibleComponents(int i) {
            return this.endOfSelectionFlexibleComponents_.get(i);
        }

        public int getEndOfSelectionFlexibleComponentsCount() {
            return this.endOfSelectionFlexibleComponents_.size();
        }

        public List<Common$FlexibleComponent> getEndOfSelectionFlexibleComponentsList() {
            return this.endOfSelectionFlexibleComponents_;
        }

        public InterfaceC6943w getEndOfSelectionFlexibleComponentsOrBuilder(int i) {
            return this.endOfSelectionFlexibleComponents_.get(i);
        }

        public List<? extends InterfaceC6943w> getEndOfSelectionFlexibleComponentsOrBuilderList() {
            return this.endOfSelectionFlexibleComponents_;
        }

        public Common$ButtonContent getEndOfSelectionListButton() {
            Common$ButtonContent common$ButtonContent = this.endOfSelectionListButton_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
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

        public SelectAllToggle getSelectAllToggle() {
            SelectAllToggle selectAllToggle = this.selectAllToggle_;
            return selectAllToggle == null ? SelectAllToggle.getDefaultInstance() : selectAllToggle;
        }

        public SelectionTileStyleOverride getSelectionTileStyleOverride() {
            SelectionTileStyleOverride selectionTileStyleOverride = this.selectionTileStyleOverride_;
            return selectionTileStyleOverride == null ? SelectionTileStyleOverride.getDefaultInstance() : selectionTileStyleOverride;
        }

        public Selection getSelections(int i) {
            return this.selections_.get(i);
        }

        public int getSelectionsCount() {
            return this.selections_.size();
        }

        public List<Selection> getSelectionsList() {
            return this.selections_;
        }

        public InterfaceC6864b getSelectionsOrBuilder(int i) {
            return this.selections_.get(i);
        }

        public List<? extends InterfaceC6864b> getSelectionsOrBuilderList() {
            return this.selections_;
        }

        public Common$Modal getUnselectConfirmationModal() {
            Common$Modal common$Modal = this.unselectConfirmationModal_;
            return common$Modal == null ? Common$Modal.getDefaultInstance() : common$Modal;
        }

        public boolean hasButton() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasButtonDisclaimerText() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasDisclaimer() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasEndOfSelectionListButton() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasEvents() {
            return (this.bitField0_ & 1024) != 0;
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
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasSelectAllToggle() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasSelectionTileStyleOverride() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasUnselectConfirmationModal() {
            return (this.bitField0_ & 2048) != 0;
        }

        public static C6863a newBuilder(Rendering rendering) {
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

        private void addEndOfSelectionFlexibleComponents(int i, Common$FlexibleComponent common$FlexibleComponent) {
            common$FlexibleComponent.getClass();
            ensureEndOfSelectionFlexibleComponentsIsMutable();
            this.endOfSelectionFlexibleComponents_.add(i, common$FlexibleComponent);
        }

        private void addSelections(int i, Selection selection) {
            selection.getClass();
            ensureSelectionsIsMutable();
            this.selections_.add(i, selection);
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

    public static final class SelectAllToggle extends GeneratedMessageLite<SelectAllToggle, C6866a> implements MessageLiteOrBuilder {
        private static final SelectAllToggle DEFAULT_INSTANCE;
        public static final int IS_VISIBLE_FIELD_NUMBER = 3;
        private static volatile Parser<SelectAllToggle> PARSER = null;
        public static final int PRESELECTED_FIELD_NUMBER = 4;
        public static final int SUBTITLE_FIELD_NUMBER = 2;
        public static final int TITLE_FIELD_NUMBER = 1;
        private int bitField0_;
        private boolean isVisible_;
        private boolean preselected_;
        private SelectAllToggleSubtitle subtitle_;
        private Common$AttributedLocalizedString title_;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane$SelectAllToggle$a */
        public static final class C6866a extends GeneratedMessageLite.Builder<SelectAllToggle, C6866a> implements MessageLiteOrBuilder {
            public C6866a() {
                super(SelectAllToggle.DEFAULT_INSTANCE);
            }
        }

        static {
            SelectAllToggle selectAllToggle = new SelectAllToggle();
            DEFAULT_INSTANCE = selectAllToggle;
            GeneratedMessageLite.registerDefaultInstance(SelectAllToggle.class, selectAllToggle);
        }

        private SelectAllToggle() {
        }

        private void clearIsVisible() {
            this.isVisible_ = false;
        }

        private void clearPreselected() {
            this.preselected_ = false;
        }

        private void clearSubtitle() {
            this.subtitle_ = null;
            this.bitField0_ &= -3;
        }

        private void clearTitle() {
            this.title_ = null;
            this.bitField0_ &= -2;
        }

        public static SelectAllToggle getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeSubtitle(SelectAllToggleSubtitle selectAllToggleSubtitle) {
            selectAllToggleSubtitle.getClass();
            SelectAllToggleSubtitle selectAllToggleSubtitle2 = this.subtitle_;
            if (selectAllToggleSubtitle2 == null || selectAllToggleSubtitle2 == SelectAllToggleSubtitle.getDefaultInstance()) {
                this.subtitle_ = selectAllToggleSubtitle;
            } else {
                this.subtitle_ = SelectAllToggleSubtitle.newBuilder(this.subtitle_).mergeFrom((SelectAllToggleSubtitle.C6867a) selectAllToggleSubtitle).buildPartial();
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

        public static C6866a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SelectAllToggle parseDelimitedFrom(InputStream inputStream) {
            return (SelectAllToggle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SelectAllToggle parseFrom(ByteBuffer byteBuffer) {
            return (SelectAllToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SelectAllToggle> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setIsVisible(boolean z) {
            this.isVisible_ = z;
        }

        private void setPreselected(boolean z) {
            this.preselected_ = z;
        }

        private void setSubtitle(SelectAllToggleSubtitle selectAllToggleSubtitle) {
            selectAllToggleSubtitle.getClass();
            this.subtitle_ = selectAllToggleSubtitle;
            this.bitField0_ |= 2;
        }

        private void setTitle(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.title_ = common$AttributedLocalizedString;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6946x0.f2618a[methodToInvoke.ordinal()]) {
                case 1:
                    return new SelectAllToggle();
                case 2:
                    return new C6866a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u0007\u0004\u0007", new Object[]{"bitField0_", "title_", "subtitle_", "isVisible_", "preselected_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SelectAllToggle> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (SelectAllToggle.class) {
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

        public boolean getIsVisible() {
            return this.isVisible_;
        }

        public boolean getPreselected() {
            return this.preselected_;
        }

        public SelectAllToggleSubtitle getSubtitle() {
            SelectAllToggleSubtitle selectAllToggleSubtitle = this.subtitle_;
            return selectAllToggleSubtitle == null ? SelectAllToggleSubtitle.getDefaultInstance() : selectAllToggleSubtitle;
        }

        public Common$AttributedLocalizedString getTitle() {
            Common$AttributedLocalizedString common$AttributedLocalizedString = this.title_;
            return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public boolean hasSubtitle() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasTitle() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C6866a newBuilder(SelectAllToggle selectAllToggle) {
            return DEFAULT_INSTANCE.createBuilder(selectAllToggle);
        }

        public static SelectAllToggle parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SelectAllToggle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SelectAllToggle parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (SelectAllToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SelectAllToggle parseFrom(ByteString byteString) {
            return (SelectAllToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SelectAllToggle parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SelectAllToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SelectAllToggle parseFrom(byte[] bArr) {
            return (SelectAllToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SelectAllToggle parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SelectAllToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SelectAllToggle parseFrom(InputStream inputStream) {
            return (SelectAllToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SelectAllToggle parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SelectAllToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SelectAllToggle parseFrom(CodedInputStream codedInputStream) {
            return (SelectAllToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SelectAllToggle parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SelectAllToggle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SelectAllToggleSubtitle extends GeneratedMessageLite<SelectAllToggleSubtitle, C6867a> implements MessageLiteOrBuilder {
        public static final int CONTENT_MULTIPLE_SELECTED_FIELD_NUMBER = 3;
        public static final int CONTENT_ONE_SELECTED_FIELD_NUMBER = 2;
        public static final int CONTENT_ZERO_SELECTED_FIELD_NUMBER = 1;
        private static final SelectAllToggleSubtitle DEFAULT_INSTANCE;
        private static volatile Parser<SelectAllToggleSubtitle> PARSER;
        private int bitField0_;
        private Common$AttributedLocalizedString contentMultipleSelected_;
        private Common$AttributedLocalizedString contentOneSelected_;
        private Common$AttributedLocalizedString contentZeroSelected_;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane$SelectAllToggleSubtitle$a */
        public static final class C6867a extends GeneratedMessageLite.Builder<SelectAllToggleSubtitle, C6867a> implements MessageLiteOrBuilder {
            public C6867a() {
                super(SelectAllToggleSubtitle.DEFAULT_INSTANCE);
            }
        }

        static {
            SelectAllToggleSubtitle selectAllToggleSubtitle = new SelectAllToggleSubtitle();
            DEFAULT_INSTANCE = selectAllToggleSubtitle;
            GeneratedMessageLite.registerDefaultInstance(SelectAllToggleSubtitle.class, selectAllToggleSubtitle);
        }

        private SelectAllToggleSubtitle() {
        }

        private void clearContentMultipleSelected() {
            this.contentMultipleSelected_ = null;
            this.bitField0_ &= -5;
        }

        private void clearContentOneSelected() {
            this.contentOneSelected_ = null;
            this.bitField0_ &= -3;
        }

        private void clearContentZeroSelected() {
            this.contentZeroSelected_ = null;
            this.bitField0_ &= -2;
        }

        public static SelectAllToggleSubtitle getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeContentMultipleSelected(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.contentMultipleSelected_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                this.contentMultipleSelected_ = common$AttributedLocalizedString;
            } else {
                this.contentMultipleSelected_ = Common$AttributedLocalizedString.newBuilder(this.contentMultipleSelected_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        private void mergeContentOneSelected(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.contentOneSelected_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                this.contentOneSelected_ = common$AttributedLocalizedString;
            } else {
                this.contentOneSelected_ = Common$AttributedLocalizedString.newBuilder(this.contentOneSelected_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergeContentZeroSelected(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.contentZeroSelected_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                this.contentZeroSelected_ = common$AttributedLocalizedString;
            } else {
                this.contentZeroSelected_ = Common$AttributedLocalizedString.newBuilder(this.contentZeroSelected_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static C6867a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SelectAllToggleSubtitle parseDelimitedFrom(InputStream inputStream) {
            return (SelectAllToggleSubtitle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SelectAllToggleSubtitle parseFrom(ByteBuffer byteBuffer) {
            return (SelectAllToggleSubtitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SelectAllToggleSubtitle> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setContentMultipleSelected(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.contentMultipleSelected_ = common$AttributedLocalizedString;
            this.bitField0_ |= 4;
        }

        private void setContentOneSelected(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.contentOneSelected_ = common$AttributedLocalizedString;
            this.bitField0_ |= 2;
        }

        private void setContentZeroSelected(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.contentZeroSelected_ = common$AttributedLocalizedString;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6946x0.f2618a[methodToInvoke.ordinal()]) {
                case 1:
                    return new SelectAllToggleSubtitle();
                case 2:
                    return new C6867a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "contentZeroSelected_", "contentOneSelected_", "contentMultipleSelected_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SelectAllToggleSubtitle> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (SelectAllToggleSubtitle.class) {
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

        public Common$AttributedLocalizedString getContentMultipleSelected() {
            Common$AttributedLocalizedString common$AttributedLocalizedString = this.contentMultipleSelected_;
            return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public Common$AttributedLocalizedString getContentOneSelected() {
            Common$AttributedLocalizedString common$AttributedLocalizedString = this.contentOneSelected_;
            return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public Common$AttributedLocalizedString getContentZeroSelected() {
            Common$AttributedLocalizedString common$AttributedLocalizedString = this.contentZeroSelected_;
            return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public boolean hasContentMultipleSelected() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasContentOneSelected() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasContentZeroSelected() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C6867a newBuilder(SelectAllToggleSubtitle selectAllToggleSubtitle) {
            return DEFAULT_INSTANCE.createBuilder(selectAllToggleSubtitle);
        }

        public static SelectAllToggleSubtitle parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SelectAllToggleSubtitle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SelectAllToggleSubtitle parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (SelectAllToggleSubtitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SelectAllToggleSubtitle parseFrom(ByteString byteString) {
            return (SelectAllToggleSubtitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SelectAllToggleSubtitle parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SelectAllToggleSubtitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SelectAllToggleSubtitle parseFrom(byte[] bArr) {
            return (SelectAllToggleSubtitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SelectAllToggleSubtitle parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SelectAllToggleSubtitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SelectAllToggleSubtitle parseFrom(InputStream inputStream) {
            return (SelectAllToggleSubtitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SelectAllToggleSubtitle parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SelectAllToggleSubtitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SelectAllToggleSubtitle parseFrom(CodedInputStream codedInputStream) {
            return (SelectAllToggleSubtitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SelectAllToggleSubtitle parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SelectAllToggleSubtitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane$a */
    public static final class C6868a extends GeneratedMessageLite.Builder<UserSelectionPaneOuterClass$UserSelectionPane, C6868a> implements MessageLiteOrBuilder {
        public C6868a() {
            super(UserSelectionPaneOuterClass$UserSelectionPane.DEFAULT_INSTANCE);
        }
    }

    static {
        UserSelectionPaneOuterClass$UserSelectionPane userSelectionPaneOuterClass$UserSelectionPane = new UserSelectionPaneOuterClass$UserSelectionPane();
        DEFAULT_INSTANCE = userSelectionPaneOuterClass$UserSelectionPane;
        GeneratedMessageLite.registerDefaultInstance(UserSelectionPaneOuterClass$UserSelectionPane.class, userSelectionPaneOuterClass$UserSelectionPane);
    }

    private UserSelectionPaneOuterClass$UserSelectionPane() {
    }

    public static UserSelectionPaneOuterClass$UserSelectionPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6868a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UserSelectionPaneOuterClass$UserSelectionPane parseDelimitedFrom(InputStream inputStream) {
        return (UserSelectionPaneOuterClass$UserSelectionPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserSelectionPaneOuterClass$UserSelectionPane parseFrom(ByteBuffer byteBuffer) {
        return (UserSelectionPaneOuterClass$UserSelectionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UserSelectionPaneOuterClass$UserSelectionPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6946x0.f2618a[methodToInvoke.ordinal()]) {
            case 1:
                return new UserSelectionPaneOuterClass$UserSelectionPane();
            case 2:
                return new C6868a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UserSelectionPaneOuterClass$UserSelectionPane> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (UserSelectionPaneOuterClass$UserSelectionPane.class) {
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

    public static C6868a newBuilder(UserSelectionPaneOuterClass$UserSelectionPane userSelectionPaneOuterClass$UserSelectionPane) {
        return DEFAULT_INSTANCE.createBuilder(userSelectionPaneOuterClass$UserSelectionPane);
    }

    public static UserSelectionPaneOuterClass$UserSelectionPane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (UserSelectionPaneOuterClass$UserSelectionPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserSelectionPaneOuterClass$UserSelectionPane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (UserSelectionPaneOuterClass$UserSelectionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UserSelectionPaneOuterClass$UserSelectionPane parseFrom(ByteString byteString) {
        return (UserSelectionPaneOuterClass$UserSelectionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UserSelectionPaneOuterClass$UserSelectionPane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (UserSelectionPaneOuterClass$UserSelectionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UserSelectionPaneOuterClass$UserSelectionPane parseFrom(byte[] bArr) {
        return (UserSelectionPaneOuterClass$UserSelectionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UserSelectionPaneOuterClass$UserSelectionPane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (UserSelectionPaneOuterClass$UserSelectionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UserSelectionPaneOuterClass$UserSelectionPane parseFrom(InputStream inputStream) {
        return (UserSelectionPaneOuterClass$UserSelectionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserSelectionPaneOuterClass$UserSelectionPane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (UserSelectionPaneOuterClass$UserSelectionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserSelectionPaneOuterClass$UserSelectionPane parseFrom(CodedInputStream codedInputStream) {
        return (UserSelectionPaneOuterClass$UserSelectionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UserSelectionPaneOuterClass$UserSelectionPane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (UserSelectionPaneOuterClass$UserSelectionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
