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
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoLoginOpenOptions;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RedirectOptions;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class OauthPane$OAuthPane extends GeneratedMessageLite<OauthPane$OAuthPane, C6709a> implements MessageLiteOrBuilder {
    private static final OauthPane$OAuthPane DEFAULT_INSTANCE;
    private static volatile Parser<OauthPane$OAuthPane> PARSER;

    public static final class Actions extends GeneratedMessageLite<Actions, C6698b> implements MessageLiteOrBuilder {
        private static final Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 2;
        private static volatile Parser<Actions> PARSER = null;
        public static final int SECONDARY_BUTTON_TAP_FIELD_NUMBER = 3;
        public static final int SUBMIT_FIELD_NUMBER = 1;
        private int actionCase_ = 0;
        private Object action_;

        public static final class ExitAction extends GeneratedMessageLite<ExitAction, C6694a> implements MessageLiteOrBuilder {
            private static final ExitAction DEFAULT_INSTANCE;
            private static volatile Parser<ExitAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane$Actions$ExitAction$a */
            public static final class C6694a extends GeneratedMessageLite.Builder<ExitAction, C6694a> implements MessageLiteOrBuilder {
                public C6694a() {
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

            public static C6694a newBuilder() {
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
                switch (C6920k0.f2564a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ExitAction();
                    case 2:
                        return new C6694a();
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

            public static C6694a newBuilder(ExitAction exitAction) {
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

        public static final class SecondaryButtonTapAction extends GeneratedMessageLite<SecondaryButtonTapAction, C6695a> implements MessageLiteOrBuilder {
            private static final SecondaryButtonTapAction DEFAULT_INSTANCE;
            private static volatile Parser<SecondaryButtonTapAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane$Actions$SecondaryButtonTapAction$a */
            public static final class C6695a extends GeneratedMessageLite.Builder<SecondaryButtonTapAction, C6695a> implements MessageLiteOrBuilder {
                public C6695a() {
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

            public static C6695a newBuilder() {
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
                switch (C6920k0.f2564a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SecondaryButtonTapAction();
                    case 2:
                        return new C6695a();
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

            public static C6695a newBuilder(SecondaryButtonTapAction secondaryButtonTapAction) {
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

        public static final class SubmitAction extends GeneratedMessageLite<SubmitAction, C6696a> implements MessageLiteOrBuilder {
            private static final SubmitAction DEFAULT_INSTANCE;
            public static final int OAUTH_STATE_ID_FIELD_NUMBER = 2;
            public static final int OAUTH_SUBMISSION_METHOD_FIELD_NUMBER = 3;
            private static volatile Parser<SubmitAction> PARSER = null;
            public static final int RESPONSE_REDIRECT_URI_FIELD_NUMBER = 1;
            private int oauthSubmissionMethod_;
            private String responseRedirectUri_ = "";
            private String oauthStateId_ = "";

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane$Actions$SubmitAction$a */
            public static final class C6696a extends GeneratedMessageLite.Builder<SubmitAction, C6696a> implements MessageLiteOrBuilder {
                public C6696a() {
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

            private void clearOauthStateId() {
                this.oauthStateId_ = getDefaultInstance().getOauthStateId();
            }

            private void clearOauthSubmissionMethod() {
                this.oauthSubmissionMethod_ = 0;
            }

            private void clearResponseRedirectUri() {
                this.responseRedirectUri_ = getDefaultInstance().getResponseRedirectUri();
            }

            public static SubmitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6696a newBuilder() {
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

            private void setOauthStateId(String str) {
                str.getClass();
                this.oauthStateId_ = str;
            }

            private void setOauthStateIdBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.oauthStateId_ = byteString.toStringUtf8();
            }

            private void setOauthSubmissionMethod(EnumC6598F enumC6598F) {
                this.oauthSubmissionMethod_ = enumC6598F.getNumber();
            }

            private void setOauthSubmissionMethodValue(int i) {
                this.oauthSubmissionMethod_ = i;
            }

            private void setResponseRedirectUri(String str) {
                str.getClass();
                this.responseRedirectUri_ = str;
            }

            private void setResponseRedirectUriBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.responseRedirectUri_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6920k0.f2564a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SubmitAction();
                    case 2:
                        return new C6696a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f", new Object[]{"responseRedirectUri_", "oauthStateId_", "oauthSubmissionMethod_"});
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

            public String getOauthStateId() {
                return this.oauthStateId_;
            }

            public ByteString getOauthStateIdBytes() {
                return ByteString.copyFromUtf8(this.oauthStateId_);
            }

            public EnumC6598F getOauthSubmissionMethod() {
                EnumC6598F enumC6598FForNumber = EnumC6598F.forNumber(this.oauthSubmissionMethod_);
                return enumC6598FForNumber == null ? EnumC6598F.UNRECOGNIZED : enumC6598FForNumber;
            }

            public int getOauthSubmissionMethodValue() {
                return this.oauthSubmissionMethod_;
            }

            public String getResponseRedirectUri() {
                return this.responseRedirectUri_;
            }

            public ByteString getResponseRedirectUriBytes() {
                return ByteString.copyFromUtf8(this.responseRedirectUri_);
            }

            public static C6696a newBuilder(SubmitAction submitAction) {
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

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane$Actions$a */
        public enum EnumC6697a {
            SUBMIT(1),
            EXIT(2),
            SECONDARY_BUTTON_TAP(3),
            ACTION_NOT_SET(0);


            /* renamed from: a */
            public final int f2407a;

            EnumC6697a(int i) {
                this.f2407a = i;
            }

            public static EnumC6697a forNumber(int i) {
                if (i == 0) {
                    return ACTION_NOT_SET;
                }
                if (i == 1) {
                    return SUBMIT;
                }
                if (i == 2) {
                    return EXIT;
                }
                if (i != 3) {
                    return null;
                }
                return SECONDARY_BUTTON_TAP;
            }

            public int getNumber() {
                return this.f2407a;
            }

            @Deprecated
            public static EnumC6697a valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane$Actions$b */
        public static final class C6698b extends GeneratedMessageLite.Builder<Actions, C6698b> implements MessageLiteOrBuilder {
            public C6698b() {
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

        public static Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeExit(ExitAction exitAction) {
            exitAction.getClass();
            if (this.actionCase_ != 2 || this.action_ == ExitAction.getDefaultInstance()) {
                this.action_ = exitAction;
            } else {
                this.action_ = ExitAction.newBuilder((ExitAction) this.action_).mergeFrom((ExitAction.C6694a) exitAction).buildPartial();
            }
            this.actionCase_ = 2;
        }

        private void mergeSecondaryButtonTap(SecondaryButtonTapAction secondaryButtonTapAction) {
            secondaryButtonTapAction.getClass();
            if (this.actionCase_ != 3 || this.action_ == SecondaryButtonTapAction.getDefaultInstance()) {
                this.action_ = secondaryButtonTapAction;
            } else {
                this.action_ = SecondaryButtonTapAction.newBuilder((SecondaryButtonTapAction) this.action_).mergeFrom((SecondaryButtonTapAction.C6695a) secondaryButtonTapAction).buildPartial();
            }
            this.actionCase_ = 3;
        }

        private void mergeSubmit(SubmitAction submitAction) {
            submitAction.getClass();
            if (this.actionCase_ != 1 || this.action_ == SubmitAction.getDefaultInstance()) {
                this.action_ = submitAction;
            } else {
                this.action_ = SubmitAction.newBuilder((SubmitAction) this.action_).mergeFrom((SubmitAction.C6696a) submitAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        public static C6698b newBuilder() {
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6920k0.f2564a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Actions();
                case 2:
                    return new C6698b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"action_", "actionCase_", SubmitAction.class, ExitAction.class, SecondaryButtonTapAction.class});
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

        public EnumC6697a getActionCase() {
            return EnumC6697a.forNumber(this.actionCase_);
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

        public boolean hasExit() {
            return this.actionCase_ == 2;
        }

        public boolean hasSecondaryButtonTap() {
            return this.actionCase_ == 3;
        }

        public boolean hasSubmit() {
            return this.actionCase_ == 1;
        }

        public static C6698b newBuilder(Actions actions) {
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

    public static final class Rendering extends GeneratedMessageLite<Rendering, C6706a> implements MessageLiteOrBuilder {
        public static final int AFTER_FIELD_NUMBER = 5;
        public static final int AFTER_FLEXIBLE_FIELD_NUMBER = 20;
        public static final int AUTO_LOGIN_OPEN_FIELD_NUMBER = 17;
        public static final int BACKGROUND_DISPLAY_MODE_FIELD_NUMBER = 24;
        public static final int BEFORE_FIELD_NUMBER = 3;
        public static final int BEFORE_FLEXIBLE_FIELD_NUMBER = 18;
        public static final int CONFIGURED_WITH_REDIRECT_URI_FIELD_NUMBER = 8;
        private static final Rendering DEFAULT_INSTANCE;
        public static final int DURING_FIELD_NUMBER = 4;
        public static final int DURING_FLEXIBLE_FIELD_NUMBER = 19;
        public static final int EVENTS_FIELD_NUMBER = 6;
        public static final int HIDE_FAIRY_BITS_FIELD_NUMBER = 22;
        public static final int INSTITUTION_FIELD_NUMBER = 7;
        public static final int LOGIN_URI_FIELD_NUMBER = 1;
        public static final int OAUTH_STATE_ID_FIELD_NUMBER = 2;
        public static final int OAUTH_UI_EXPERIENCE_FIELD_NUMBER = 14;
        public static final int OUT_OF_PROCESS_IOS_POPUP_FIELD_NUMBER = 16;
        public static final int PANE_HEADER_FIELD_NUMBER = 9;
        private static volatile Parser<Rendering> PARSER = null;
        public static final int POLLING_FIELD_NUMBER = 12;
        public static final int POLL_FOR_LOGIN_URI_FIELD_NUMBER = 23;
        public static final int POPUP_FIELD_NUMBER = 10;
        public static final int REDIRECT_FIELD_NUMBER = 11;
        public static final int SHOULD_AWAIT_OAUTH_LOGGING_FIELD_NUMBER = 13;
        private ContentFlexible afterFlexible_;
        private Content after_;
        private Common$AutoLoginOpenOptions autoLoginOpen_;
        private int backgroundDisplayMode_;
        private ContentFlexible beforeFlexible_;
        private Content before_;
        private int bitField0_;
        private boolean configuredWithRedirectUri_;
        private ContentFlexible duringFlexible_;
        private Content during_;
        private Events events_;
        private boolean hideFairyBits_;
        private Common$RenderedInstitution institution_;
        private Object loginUriOptions_;
        private int oauthUiExperience_;
        private Object openMethod_;
        private Common$PaneHeader paneHeader_;
        private Common$PollingOptions polling_;
        private boolean shouldAwaitOauthLogging_;
        private int loginUriOptionsCase_ = 0;
        private int openMethodCase_ = 0;
        private String oauthStateId_ = "";

        public static final class Content extends GeneratedMessageLite<Content, C6700a> implements MessageLiteOrBuilder {
            public static final int BUTTON_DISCLAIMER_TEXT_FIELD_NUMBER = 10;
            public static final int BUTTON_FIELD_NUMBER = 4;
            private static final Content DEFAULT_INSTANCE;
            public static final int DETAIL_ORDERED_LIST_FIELD_NUMBER = 6;
            public static final int DETAIL_TEXT_FIELD_NUMBER = 5;
            public static final int HEADER_FIELD_NUMBER = 2;
            private static volatile Parser<Content> PARSER = null;
            public static final int SECONDARY_BUTTON_FIELD_NUMBER = 7;
            private int bitField0_;
            private Common$AttributedLocalizedString buttonDisclaimerText_;
            private Common$ButtonContent button_;
            private int detailCase_ = 0;
            private Object detail_;
            private Common$LocalizedString header_;
            private Common$ButtonContent secondaryButton_;

            public static final class OrderedList extends GeneratedMessageLite<OrderedList, C6699a> implements MessageLiteOrBuilder {
                private static final OrderedList DEFAULT_INSTANCE;
                public static final int ITEMS_FIELD_NUMBER = 1;
                private static volatile Parser<OrderedList> PARSER;
                private Internal.ProtobufList<Common$LocalizedString> items_ = GeneratedMessageLite.emptyProtobufList();

                /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane$Rendering$Content$OrderedList$a */
                public static final class C6699a extends GeneratedMessageLite.Builder<OrderedList, C6699a> implements MessageLiteOrBuilder {
                    public C6699a() {
                        super(OrderedList.DEFAULT_INSTANCE);
                    }
                }

                static {
                    OrderedList orderedList = new OrderedList();
                    DEFAULT_INSTANCE = orderedList;
                    GeneratedMessageLite.registerDefaultInstance(OrderedList.class, orderedList);
                }

                private OrderedList() {
                }

                private void addAllItems(Iterable<? extends Common$LocalizedString> iterable) {
                    ensureItemsIsMutable();
                    AbstractMessageLite.addAll((Iterable) iterable, (List) this.items_);
                }

                private void addItems(Common$LocalizedString common$LocalizedString) {
                    common$LocalizedString.getClass();
                    ensureItemsIsMutable();
                    this.items_.add(common$LocalizedString);
                }

                private void clearItems() {
                    this.items_ = GeneratedMessageLite.emptyProtobufList();
                }

                private void ensureItemsIsMutable() {
                    Internal.ProtobufList<Common$LocalizedString> protobufList = this.items_;
                    if (protobufList.isModifiable()) {
                        return;
                    }
                    this.items_ = GeneratedMessageLite.mutableCopy(protobufList);
                }

                public static OrderedList getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static C6699a newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static OrderedList parseDelimitedFrom(InputStream inputStream) {
                    return (OrderedList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static OrderedList parseFrom(ByteBuffer byteBuffer) {
                    return (OrderedList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static Parser<OrderedList> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                private void removeItems(int i) {
                    ensureItemsIsMutable();
                    this.items_.remove(i);
                }

                private void setItems(int i, Common$LocalizedString common$LocalizedString) {
                    common$LocalizedString.getClass();
                    ensureItemsIsMutable();
                    this.items_.set(i, common$LocalizedString);
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    Parser defaultInstanceBasedParser;
                    switch (C6920k0.f2564a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new OrderedList();
                        case 2:
                            return new C6699a();
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"items_", Common$LocalizedString.class});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            Parser<OrderedList> parser = PARSER;
                            if (parser != null) {
                                return parser;
                            }
                            synchronized (OrderedList.class) {
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

                public Common$LocalizedString getItems(int i) {
                    return this.items_.get(i);
                }

                public int getItemsCount() {
                    return this.items_.size();
                }

                public List<Common$LocalizedString> getItemsList() {
                    return this.items_;
                }

                public InterfaceC6360C getItemsOrBuilder(int i) {
                    return this.items_.get(i);
                }

                public List<? extends InterfaceC6360C> getItemsOrBuilderList() {
                    return this.items_;
                }

                public static C6699a newBuilder(OrderedList orderedList) {
                    return DEFAULT_INSTANCE.createBuilder(orderedList);
                }

                public static OrderedList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (OrderedList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static OrderedList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                    return (OrderedList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static OrderedList parseFrom(ByteString byteString) {
                    return (OrderedList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                private void addItems(int i, Common$LocalizedString common$LocalizedString) {
                    common$LocalizedString.getClass();
                    ensureItemsIsMutable();
                    this.items_.add(i, common$LocalizedString);
                }

                public static OrderedList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                    return (OrderedList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static OrderedList parseFrom(byte[] bArr) {
                    return (OrderedList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static OrderedList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                    return (OrderedList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static OrderedList parseFrom(InputStream inputStream) {
                    return (OrderedList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static OrderedList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (OrderedList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static OrderedList parseFrom(CodedInputStream codedInputStream) {
                    return (OrderedList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static OrderedList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (OrderedList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane$Rendering$Content$a */
            public static final class C6700a extends GeneratedMessageLite.Builder<Content, C6700a> implements MessageLiteOrBuilder {
                public C6700a() {
                    super(Content.DEFAULT_INSTANCE);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane$Rendering$Content$b */
            public enum EnumC6701b {
                DETAIL_TEXT(5),
                DETAIL_ORDERED_LIST(6),
                DETAIL_NOT_SET(0);


                /* renamed from: a */
                public final int f2409a;

                EnumC6701b(int i) {
                    this.f2409a = i;
                }

                public static EnumC6701b forNumber(int i) {
                    if (i == 0) {
                        return DETAIL_NOT_SET;
                    }
                    if (i == 5) {
                        return DETAIL_TEXT;
                    }
                    if (i != 6) {
                        return null;
                    }
                    return DETAIL_ORDERED_LIST;
                }

                public int getNumber() {
                    return this.f2409a;
                }

                @Deprecated
                public static EnumC6701b valueOf(int i) {
                    return forNumber(i);
                }
            }

            static {
                Content content = new Content();
                DEFAULT_INSTANCE = content;
                GeneratedMessageLite.registerDefaultInstance(Content.class, content);
            }

            private Content() {
            }

            private void clearButton() {
                this.button_ = null;
                this.bitField0_ &= -3;
            }

            private void clearButtonDisclaimerText() {
                this.buttonDisclaimerText_ = null;
                this.bitField0_ &= -9;
            }

            private void clearDetail() {
                this.detailCase_ = 0;
                this.detail_ = null;
            }

            private void clearDetailOrderedList() {
                if (this.detailCase_ == 6) {
                    this.detailCase_ = 0;
                    this.detail_ = null;
                }
            }

            private void clearDetailText() {
                if (this.detailCase_ == 5) {
                    this.detailCase_ = 0;
                    this.detail_ = null;
                }
            }

            private void clearHeader() {
                this.header_ = null;
                this.bitField0_ &= -2;
            }

            private void clearSecondaryButton() {
                this.secondaryButton_ = null;
                this.bitField0_ &= -5;
            }

            public static Content getDefaultInstance() {
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
                this.bitField0_ |= 2;
            }

            private void mergeButtonDisclaimerText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.buttonDisclaimerText_;
                if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                    this.buttonDisclaimerText_ = common$AttributedLocalizedString;
                } else {
                    this.buttonDisclaimerText_ = Common$AttributedLocalizedString.newBuilder(this.buttonDisclaimerText_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            private void mergeDetailOrderedList(OrderedList orderedList) {
                orderedList.getClass();
                if (this.detailCase_ != 6 || this.detail_ == OrderedList.getDefaultInstance()) {
                    this.detail_ = orderedList;
                } else {
                    this.detail_ = OrderedList.newBuilder((OrderedList) this.detail_).mergeFrom((OrderedList.C6699a) orderedList).buildPartial();
                }
                this.detailCase_ = 6;
            }

            private void mergeDetailText(Common$LocalizedString common$LocalizedString) {
                common$LocalizedString.getClass();
                if (this.detailCase_ != 5 || this.detail_ == Common$LocalizedString.getDefaultInstance()) {
                    this.detail_ = common$LocalizedString;
                } else {
                    this.detail_ = Common$LocalizedString.newBuilder((Common$LocalizedString) this.detail_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
                }
                this.detailCase_ = 5;
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

            public static C6700a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Content parseDelimitedFrom(InputStream inputStream) {
                return (Content) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Content parseFrom(ByteBuffer byteBuffer) {
                return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Content> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.button_ = common$ButtonContent;
                this.bitField0_ |= 2;
            }

            private void setButtonDisclaimerText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                this.buttonDisclaimerText_ = common$AttributedLocalizedString;
                this.bitField0_ |= 8;
            }

            private void setDetailOrderedList(OrderedList orderedList) {
                orderedList.getClass();
                this.detail_ = orderedList;
                this.detailCase_ = 6;
            }

            private void setDetailText(Common$LocalizedString common$LocalizedString) {
                common$LocalizedString.getClass();
                this.detail_ = common$LocalizedString;
                this.detailCase_ = 5;
            }

            private void setHeader(Common$LocalizedString common$LocalizedString) {
                common$LocalizedString.getClass();
                this.header_ = common$LocalizedString;
                this.bitField0_ |= 1;
            }

            private void setSecondaryButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.secondaryButton_ = common$ButtonContent;
                this.bitField0_ |= 4;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6920k0.f2564a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Content();
                    case 2:
                        return new C6700a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0002\n\u0006\u0000\u0000\u0000\u0002ဉ\u0000\u0004ဉ\u0001\u0005<\u0000\u0006<\u0000\u0007ဉ\u0002\nဉ\u0003", new Object[]{"detail_", "detailCase_", "bitField0_", "header_", "button_", Common$LocalizedString.class, OrderedList.class, "secondaryButton_", "buttonDisclaimerText_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Content> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Content.class) {
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

            public EnumC6701b getDetailCase() {
                return EnumC6701b.forNumber(this.detailCase_);
            }

            public OrderedList getDetailOrderedList() {
                return this.detailCase_ == 6 ? (OrderedList) this.detail_ : OrderedList.getDefaultInstance();
            }

            public Common$LocalizedString getDetailText() {
                return this.detailCase_ == 5 ? (Common$LocalizedString) this.detail_ : Common$LocalizedString.getDefaultInstance();
            }

            public Common$LocalizedString getHeader() {
                Common$LocalizedString common$LocalizedString = this.header_;
                return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
            }

            public Common$ButtonContent getSecondaryButton() {
                Common$ButtonContent common$ButtonContent = this.secondaryButton_;
                return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public boolean hasButton() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasButtonDisclaimerText() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasDetailOrderedList() {
                return this.detailCase_ == 6;
            }

            public boolean hasDetailText() {
                return this.detailCase_ == 5;
            }

            public boolean hasHeader() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasSecondaryButton() {
                return (this.bitField0_ & 4) != 0;
            }

            public static C6700a newBuilder(Content content) {
                return DEFAULT_INSTANCE.createBuilder(content);
            }

            public static Content parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Content) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Content parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Content parseFrom(ByteString byteString) {
                return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Content parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Content parseFrom(byte[] bArr) {
                return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Content parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Content parseFrom(InputStream inputStream) {
                return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Content parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Content parseFrom(CodedInputStream codedInputStream) {
                return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Content parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ContentFlexible extends GeneratedMessageLite<ContentFlexible, C6703a> implements MessageLiteOrBuilder {
            public static final int BUTTON_DISCLAIMER_TEXT_FIELD_NUMBER = 3;
            public static final int BUTTON_FIELD_NUMBER = 2;
            private static final ContentFlexible DEFAULT_INSTANCE;
            public static final int PANE_BODY_FIELD_NUMBER = 1;
            private static volatile Parser<ContentFlexible> PARSER = null;
            public static final int SECONDARY_BUTTON_FIELD_NUMBER = 4;
            private int bitField0_;
            private Common$AttributedLocalizedString buttonDisclaimerText_;
            private Common$ButtonContent button_;
            private PaneBody paneBody_;
            private Common$ButtonContent secondaryButton_;

            public static final class PaneBody extends GeneratedMessageLite<PaneBody, C6702a> implements MessageLiteOrBuilder {
                public static final int COMPONENTS_FIELD_NUMBER = 1;
                private static final PaneBody DEFAULT_INSTANCE;
                private static volatile Parser<PaneBody> PARSER;
                private Internal.ProtobufList<Common$FlexibleComponent> components_ = GeneratedMessageLite.emptyProtobufList();

                /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane$Rendering$ContentFlexible$PaneBody$a */
                public static final class C6702a extends GeneratedMessageLite.Builder<PaneBody, C6702a> implements MessageLiteOrBuilder {
                    public C6702a() {
                        super(PaneBody.DEFAULT_INSTANCE);
                    }
                }

                static {
                    PaneBody paneBody = new PaneBody();
                    DEFAULT_INSTANCE = paneBody;
                    GeneratedMessageLite.registerDefaultInstance(PaneBody.class, paneBody);
                }

                private PaneBody() {
                }

                private void addAllComponents(Iterable<? extends Common$FlexibleComponent> iterable) {
                    ensureComponentsIsMutable();
                    AbstractMessageLite.addAll((Iterable) iterable, (List) this.components_);
                }

                private void addComponents(Common$FlexibleComponent common$FlexibleComponent) {
                    common$FlexibleComponent.getClass();
                    ensureComponentsIsMutable();
                    this.components_.add(common$FlexibleComponent);
                }

                private void clearComponents() {
                    this.components_ = GeneratedMessageLite.emptyProtobufList();
                }

                private void ensureComponentsIsMutable() {
                    Internal.ProtobufList<Common$FlexibleComponent> protobufList = this.components_;
                    if (protobufList.isModifiable()) {
                        return;
                    }
                    this.components_ = GeneratedMessageLite.mutableCopy(protobufList);
                }

                public static PaneBody getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static C6702a newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static PaneBody parseDelimitedFrom(InputStream inputStream) {
                    return (PaneBody) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static PaneBody parseFrom(ByteBuffer byteBuffer) {
                    return (PaneBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static Parser<PaneBody> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                private void removeComponents(int i) {
                    ensureComponentsIsMutable();
                    this.components_.remove(i);
                }

                private void setComponents(int i, Common$FlexibleComponent common$FlexibleComponent) {
                    common$FlexibleComponent.getClass();
                    ensureComponentsIsMutable();
                    this.components_.set(i, common$FlexibleComponent);
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    Parser defaultInstanceBasedParser;
                    switch (C6920k0.f2564a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new PaneBody();
                        case 2:
                            return new C6702a();
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"components_", Common$FlexibleComponent.class});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            Parser<PaneBody> parser = PARSER;
                            if (parser != null) {
                                return parser;
                            }
                            synchronized (PaneBody.class) {
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

                public Common$FlexibleComponent getComponents(int i) {
                    return this.components_.get(i);
                }

                public int getComponentsCount() {
                    return this.components_.size();
                }

                public List<Common$FlexibleComponent> getComponentsList() {
                    return this.components_;
                }

                public InterfaceC6943w getComponentsOrBuilder(int i) {
                    return this.components_.get(i);
                }

                public List<? extends InterfaceC6943w> getComponentsOrBuilderList() {
                    return this.components_;
                }

                public static C6702a newBuilder(PaneBody paneBody) {
                    return DEFAULT_INSTANCE.createBuilder(paneBody);
                }

                public static PaneBody parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (PaneBody) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static PaneBody parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                    return (PaneBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static PaneBody parseFrom(ByteString byteString) {
                    return (PaneBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                private void addComponents(int i, Common$FlexibleComponent common$FlexibleComponent) {
                    common$FlexibleComponent.getClass();
                    ensureComponentsIsMutable();
                    this.components_.add(i, common$FlexibleComponent);
                }

                public static PaneBody parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                    return (PaneBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static PaneBody parseFrom(byte[] bArr) {
                    return (PaneBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static PaneBody parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                    return (PaneBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static PaneBody parseFrom(InputStream inputStream) {
                    return (PaneBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static PaneBody parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (PaneBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static PaneBody parseFrom(CodedInputStream codedInputStream) {
                    return (PaneBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static PaneBody parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (PaneBody) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane$Rendering$ContentFlexible$a */
            public static final class C6703a extends GeneratedMessageLite.Builder<ContentFlexible, C6703a> implements MessageLiteOrBuilder {
                public C6703a() {
                    super(ContentFlexible.DEFAULT_INSTANCE);
                }
            }

            static {
                ContentFlexible contentFlexible = new ContentFlexible();
                DEFAULT_INSTANCE = contentFlexible;
                GeneratedMessageLite.registerDefaultInstance(ContentFlexible.class, contentFlexible);
            }

            private ContentFlexible() {
            }

            private void clearButton() {
                this.button_ = null;
                this.bitField0_ &= -3;
            }

            private void clearButtonDisclaimerText() {
                this.buttonDisclaimerText_ = null;
                this.bitField0_ &= -9;
            }

            private void clearPaneBody() {
                this.paneBody_ = null;
                this.bitField0_ &= -2;
            }

            private void clearSecondaryButton() {
                this.secondaryButton_ = null;
                this.bitField0_ &= -5;
            }

            public static ContentFlexible getDefaultInstance() {
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
                this.bitField0_ |= 2;
            }

            private void mergeButtonDisclaimerText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.buttonDisclaimerText_;
                if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                    this.buttonDisclaimerText_ = common$AttributedLocalizedString;
                } else {
                    this.buttonDisclaimerText_ = Common$AttributedLocalizedString.newBuilder(this.buttonDisclaimerText_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            private void mergePaneBody(PaneBody paneBody) {
                paneBody.getClass();
                PaneBody paneBody2 = this.paneBody_;
                if (paneBody2 == null || paneBody2 == PaneBody.getDefaultInstance()) {
                    this.paneBody_ = paneBody;
                } else {
                    this.paneBody_ = PaneBody.newBuilder(this.paneBody_).mergeFrom((PaneBody.C6702a) paneBody).buildPartial();
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
                this.bitField0_ |= 4;
            }

            public static C6703a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ContentFlexible parseDelimitedFrom(InputStream inputStream) {
                return (ContentFlexible) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ContentFlexible parseFrom(ByteBuffer byteBuffer) {
                return (ContentFlexible) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ContentFlexible> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.button_ = common$ButtonContent;
                this.bitField0_ |= 2;
            }

            private void setButtonDisclaimerText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                this.buttonDisclaimerText_ = common$AttributedLocalizedString;
                this.bitField0_ |= 8;
            }

            private void setPaneBody(PaneBody paneBody) {
                paneBody.getClass();
                this.paneBody_ = paneBody;
                this.bitField0_ |= 1;
            }

            private void setSecondaryButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.secondaryButton_ = common$ButtonContent;
                this.bitField0_ |= 4;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6920k0.f2564a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ContentFlexible();
                    case 2:
                        return new C6703a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0003\u0004ဉ\u0002", new Object[]{"bitField0_", "paneBody_", "button_", "buttonDisclaimerText_", "secondaryButton_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ContentFlexible> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (ContentFlexible.class) {
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

            public PaneBody getPaneBody() {
                PaneBody paneBody = this.paneBody_;
                return paneBody == null ? PaneBody.getDefaultInstance() : paneBody;
            }

            public Common$ButtonContent getSecondaryButton() {
                Common$ButtonContent common$ButtonContent = this.secondaryButton_;
                return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public boolean hasButton() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasButtonDisclaimerText() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasPaneBody() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasSecondaryButton() {
                return (this.bitField0_ & 4) != 0;
            }

            public static C6703a newBuilder(ContentFlexible contentFlexible) {
                return DEFAULT_INSTANCE.createBuilder(contentFlexible);
            }

            public static ContentFlexible parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ContentFlexible) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ContentFlexible parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ContentFlexible) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ContentFlexible parseFrom(ByteString byteString) {
                return (ContentFlexible) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ContentFlexible parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ContentFlexible) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ContentFlexible parseFrom(byte[] bArr) {
                return (ContentFlexible) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ContentFlexible parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ContentFlexible) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ContentFlexible parseFrom(InputStream inputStream) {
                return (ContentFlexible) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ContentFlexible parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ContentFlexible) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ContentFlexible parseFrom(CodedInputStream codedInputStream) {
                return (ContentFlexible) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ContentFlexible parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ContentFlexible) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Events extends GeneratedMessageLite<Events, C6704a> implements MessageLiteOrBuilder {
            private static final Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            public static final int ON_CLOSE_REDIRECT_FIELD_NUMBER = 3;
            public static final int ON_FAIL_REDIRECT_FIELD_NUMBER = 4;
            public static final int ON_REDIRECT_FIELD_NUMBER = 2;
            public static final int ON_SECONDARY_BUTTON_TAP_FIELD_NUMBER = 5;
            private static volatile Parser<Events> PARSER;
            private Internal.ProtobufList<Common$SDKEvent> onAppear_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.ProtobufList<Common$SDKEvent> onRedirect_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.ProtobufList<Common$SDKEvent> onSecondaryButtonTap_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.ProtobufList<Common$SDKEvent> onCloseRedirect_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.ProtobufList<Common$SDKEvent> onFailRedirect_ = GeneratedMessageLite.emptyProtobufList();

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane$Rendering$Events$a */
            public static final class C6704a extends GeneratedMessageLite.Builder<Events, C6704a> implements MessageLiteOrBuilder {
                public C6704a() {
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

            private void addAllOnCloseRedirect(Iterable<? extends Common$SDKEvent> iterable) {
                ensureOnCloseRedirectIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.onCloseRedirect_);
            }

            private void addAllOnFailRedirect(Iterable<? extends Common$SDKEvent> iterable) {
                ensureOnFailRedirectIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.onFailRedirect_);
            }

            private void addAllOnRedirect(Iterable<? extends Common$SDKEvent> iterable) {
                ensureOnRedirectIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.onRedirect_);
            }

            private void addAllOnSecondaryButtonTap(Iterable<? extends Common$SDKEvent> iterable) {
                ensureOnSecondaryButtonTapIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.onSecondaryButtonTap_);
            }

            private void addOnAppear(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnAppearIsMutable();
                this.onAppear_.add(common$SDKEvent);
            }

            private void addOnCloseRedirect(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnCloseRedirectIsMutable();
                this.onCloseRedirect_.add(common$SDKEvent);
            }

            private void addOnFailRedirect(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnFailRedirectIsMutable();
                this.onFailRedirect_.add(common$SDKEvent);
            }

            private void addOnRedirect(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnRedirectIsMutable();
                this.onRedirect_.add(common$SDKEvent);
            }

            private void addOnSecondaryButtonTap(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnSecondaryButtonTapIsMutable();
                this.onSecondaryButtonTap_.add(common$SDKEvent);
            }

            private void clearOnAppear() {
                this.onAppear_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearOnCloseRedirect() {
                this.onCloseRedirect_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearOnFailRedirect() {
                this.onFailRedirect_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearOnRedirect() {
                this.onRedirect_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearOnSecondaryButtonTap() {
                this.onSecondaryButtonTap_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void ensureOnAppearIsMutable() {
                Internal.ProtobufList<Common$SDKEvent> protobufList = this.onAppear_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onAppear_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureOnCloseRedirectIsMutable() {
                Internal.ProtobufList<Common$SDKEvent> protobufList = this.onCloseRedirect_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onCloseRedirect_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureOnFailRedirectIsMutable() {
                Internal.ProtobufList<Common$SDKEvent> protobufList = this.onFailRedirect_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onFailRedirect_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureOnRedirectIsMutable() {
                Internal.ProtobufList<Common$SDKEvent> protobufList = this.onRedirect_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onRedirect_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureOnSecondaryButtonTapIsMutable() {
                Internal.ProtobufList<Common$SDKEvent> protobufList = this.onSecondaryButtonTap_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onSecondaryButtonTap_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static Events getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6704a newBuilder() {
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

            private void removeOnCloseRedirect(int i) {
                ensureOnCloseRedirectIsMutable();
                this.onCloseRedirect_.remove(i);
            }

            private void removeOnFailRedirect(int i) {
                ensureOnFailRedirectIsMutable();
                this.onFailRedirect_.remove(i);
            }

            private void removeOnRedirect(int i) {
                ensureOnRedirectIsMutable();
                this.onRedirect_.remove(i);
            }

            private void removeOnSecondaryButtonTap(int i) {
                ensureOnSecondaryButtonTapIsMutable();
                this.onSecondaryButtonTap_.remove(i);
            }

            private void setOnAppear(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnAppearIsMutable();
                this.onAppear_.set(i, common$SDKEvent);
            }

            private void setOnCloseRedirect(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnCloseRedirectIsMutable();
                this.onCloseRedirect_.set(i, common$SDKEvent);
            }

            private void setOnFailRedirect(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnFailRedirectIsMutable();
                this.onFailRedirect_.set(i, common$SDKEvent);
            }

            private void setOnRedirect(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnRedirectIsMutable();
                this.onRedirect_.set(i, common$SDKEvent);
            }

            private void setOnSecondaryButtonTap(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnSecondaryButtonTapIsMutable();
                this.onSecondaryButtonTap_.set(i, common$SDKEvent);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6920k0.f2564a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Events();
                    case 2:
                        return new C6704a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0005\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b\u0005\u001b", new Object[]{"onAppear_", Common$SDKEvent.class, "onRedirect_", Common$SDKEvent.class, "onCloseRedirect_", Common$SDKEvent.class, "onFailRedirect_", Common$SDKEvent.class, "onSecondaryButtonTap_", Common$SDKEvent.class});
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

            public Common$SDKEvent getOnCloseRedirect(int i) {
                return this.onCloseRedirect_.get(i);
            }

            public int getOnCloseRedirectCount() {
                return this.onCloseRedirect_.size();
            }

            public List<Common$SDKEvent> getOnCloseRedirectList() {
                return this.onCloseRedirect_;
            }

            public InterfaceC6691M getOnCloseRedirectOrBuilder(int i) {
                return this.onCloseRedirect_.get(i);
            }

            public List<? extends InterfaceC6691M> getOnCloseRedirectOrBuilderList() {
                return this.onCloseRedirect_;
            }

            public Common$SDKEvent getOnFailRedirect(int i) {
                return this.onFailRedirect_.get(i);
            }

            public int getOnFailRedirectCount() {
                return this.onFailRedirect_.size();
            }

            public List<Common$SDKEvent> getOnFailRedirectList() {
                return this.onFailRedirect_;
            }

            public InterfaceC6691M getOnFailRedirectOrBuilder(int i) {
                return this.onFailRedirect_.get(i);
            }

            public List<? extends InterfaceC6691M> getOnFailRedirectOrBuilderList() {
                return this.onFailRedirect_;
            }

            public Common$SDKEvent getOnRedirect(int i) {
                return this.onRedirect_.get(i);
            }

            public int getOnRedirectCount() {
                return this.onRedirect_.size();
            }

            public List<Common$SDKEvent> getOnRedirectList() {
                return this.onRedirect_;
            }

            public InterfaceC6691M getOnRedirectOrBuilder(int i) {
                return this.onRedirect_.get(i);
            }

            public List<? extends InterfaceC6691M> getOnRedirectOrBuilderList() {
                return this.onRedirect_;
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

            public static C6704a newBuilder(Events events) {
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

            private void addOnCloseRedirect(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnCloseRedirectIsMutable();
                this.onCloseRedirect_.add(i, common$SDKEvent);
            }

            private void addOnFailRedirect(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnFailRedirectIsMutable();
                this.onFailRedirect_.add(i, common$SDKEvent);
            }

            private void addOnRedirect(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnRedirectIsMutable();
                this.onRedirect_.add(i, common$SDKEvent);
            }

            private void addOnSecondaryButtonTap(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnSecondaryButtonTapIsMutable();
                this.onSecondaryButtonTap_.add(i, common$SDKEvent);
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

        public static final class PollForLoginURI extends GeneratedMessageLite<PollForLoginURI, C6705a> implements MessageLiteOrBuilder {
            private static final PollForLoginURI DEFAULT_INSTANCE;
            private static volatile Parser<PollForLoginURI> PARSER = null;
            public static final int POLLING_KEY_FIELD_NUMBER = 1;
            private String pollingKey_ = "";

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane$Rendering$PollForLoginURI$a */
            public static final class C6705a extends GeneratedMessageLite.Builder<PollForLoginURI, C6705a> implements MessageLiteOrBuilder {
                public C6705a() {
                    super(PollForLoginURI.DEFAULT_INSTANCE);
                }
            }

            static {
                PollForLoginURI pollForLoginURI = new PollForLoginURI();
                DEFAULT_INSTANCE = pollForLoginURI;
                GeneratedMessageLite.registerDefaultInstance(PollForLoginURI.class, pollForLoginURI);
            }

            private PollForLoginURI() {
            }

            private void clearPollingKey() {
                this.pollingKey_ = getDefaultInstance().getPollingKey();
            }

            public static PollForLoginURI getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6705a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static PollForLoginURI parseDelimitedFrom(InputStream inputStream) {
                return (PollForLoginURI) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PollForLoginURI parseFrom(ByteBuffer byteBuffer) {
                return (PollForLoginURI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<PollForLoginURI> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setPollingKey(String str) {
                str.getClass();
                this.pollingKey_ = str;
            }

            private void setPollingKeyBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.pollingKey_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6920k0.f2564a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new PollForLoginURI();
                    case 2:
                        return new C6705a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"pollingKey_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<PollForLoginURI> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (PollForLoginURI.class) {
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

            public String getPollingKey() {
                return this.pollingKey_;
            }

            public ByteString getPollingKeyBytes() {
                return ByteString.copyFromUtf8(this.pollingKey_);
            }

            public static C6705a newBuilder(PollForLoginURI pollForLoginURI) {
                return DEFAULT_INSTANCE.createBuilder(pollForLoginURI);
            }

            public static PollForLoginURI parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PollForLoginURI) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PollForLoginURI parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (PollForLoginURI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static PollForLoginURI parseFrom(ByteString byteString) {
                return (PollForLoginURI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static PollForLoginURI parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (PollForLoginURI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static PollForLoginURI parseFrom(byte[] bArr) {
                return (PollForLoginURI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static PollForLoginURI parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (PollForLoginURI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static PollForLoginURI parseFrom(InputStream inputStream) {
                return (PollForLoginURI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PollForLoginURI parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PollForLoginURI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PollForLoginURI parseFrom(CodedInputStream codedInputStream) {
                return (PollForLoginURI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static PollForLoginURI parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PollForLoginURI) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane$Rendering$a */
        public static final class C6706a extends GeneratedMessageLite.Builder<Rendering, C6706a> implements MessageLiteOrBuilder {
            public C6706a() {
                super(Rendering.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane$Rendering$b */
        public enum EnumC6707b {
            LOGIN_URI(1),
            POLL_FOR_LOGIN_URI(23),
            LOGINURIOPTIONS_NOT_SET(0);


            /* renamed from: a */
            public final int f2411a;

            EnumC6707b(int i) {
                this.f2411a = i;
            }

            public static EnumC6707b forNumber(int i) {
                if (i == 0) {
                    return LOGINURIOPTIONS_NOT_SET;
                }
                if (i == 1) {
                    return LOGIN_URI;
                }
                if (i != 23) {
                    return null;
                }
                return POLL_FOR_LOGIN_URI;
            }

            public int getNumber() {
                return this.f2411a;
            }

            @Deprecated
            public static EnumC6707b valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane$Rendering$c */
        public enum EnumC6708c {
            POPUP(10),
            REDIRECT(11),
            OUT_OF_PROCESS_IOS_POPUP(16),
            OPENMETHOD_NOT_SET(0);


            /* renamed from: a */
            public final int f2413a;

            EnumC6708c(int i) {
                this.f2413a = i;
            }

            public static EnumC6708c forNumber(int i) {
                if (i == 0) {
                    return OPENMETHOD_NOT_SET;
                }
                if (i == 16) {
                    return OUT_OF_PROCESS_IOS_POPUP;
                }
                if (i == 10) {
                    return POPUP;
                }
                if (i != 11) {
                    return null;
                }
                return REDIRECT;
            }

            public int getNumber() {
                return this.f2413a;
            }

            @Deprecated
            public static EnumC6708c valueOf(int i) {
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

        private void clearAfter() {
            this.after_ = null;
            this.bitField0_ &= -257;
        }

        private void clearAfterFlexible() {
            this.afterFlexible_ = null;
            this.bitField0_ &= -513;
        }

        private void clearAutoLoginOpen() {
            this.autoLoginOpen_ = null;
            this.bitField0_ &= -3;
        }

        private void clearBackgroundDisplayMode() {
            this.backgroundDisplayMode_ = 0;
        }

        private void clearBefore() {
            this.before_ = null;
            this.bitField0_ &= -17;
        }

        private void clearBeforeFlexible() {
            this.beforeFlexible_ = null;
            this.bitField0_ &= -33;
        }

        private void clearConfiguredWithRedirectUri() {
            this.configuredWithRedirectUri_ = false;
        }

        private void clearDuring() {
            this.during_ = null;
            this.bitField0_ &= -65;
        }

        private void clearDuringFlexible() {
            this.duringFlexible_ = null;
            this.bitField0_ &= -129;
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -1025;
        }

        private void clearHideFairyBits() {
            this.hideFairyBits_ = false;
        }

        private void clearInstitution() {
            this.institution_ = null;
            this.bitField0_ &= -5;
        }

        private void clearLoginUri() {
            if (this.loginUriOptionsCase_ == 1) {
                this.loginUriOptionsCase_ = 0;
                this.loginUriOptions_ = null;
            }
        }

        private void clearLoginUriOptions() {
            this.loginUriOptionsCase_ = 0;
            this.loginUriOptions_ = null;
        }

        private void clearOauthStateId() {
            this.oauthStateId_ = getDefaultInstance().getOauthStateId();
        }

        private void clearOauthUiExperience() {
            this.oauthUiExperience_ = 0;
        }

        private void clearOpenMethod() {
            this.openMethodCase_ = 0;
            this.openMethod_ = null;
        }

        private void clearOutOfProcessIosPopup() {
            if (this.openMethodCase_ == 16) {
                this.openMethodCase_ = 0;
                this.openMethod_ = null;
            }
        }

        private void clearPaneHeader() {
            this.paneHeader_ = null;
            this.bitField0_ &= -9;
        }

        private void clearPollForLoginUri() {
            if (this.loginUriOptionsCase_ == 23) {
                this.loginUriOptionsCase_ = 0;
                this.loginUriOptions_ = null;
            }
        }

        private void clearPolling() {
            this.polling_ = null;
            this.bitField0_ &= -2;
        }

        private void clearPopup() {
            if (this.openMethodCase_ == 10) {
                this.openMethodCase_ = 0;
                this.openMethod_ = null;
            }
        }

        private void clearRedirect() {
            if (this.openMethodCase_ == 11) {
                this.openMethodCase_ = 0;
                this.openMethod_ = null;
            }
        }

        private void clearShouldAwaitOauthLogging() {
            this.shouldAwaitOauthLogging_ = false;
        }

        public static Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeAfter(Content content) {
            content.getClass();
            Content content2 = this.after_;
            if (content2 == null || content2 == Content.getDefaultInstance()) {
                this.after_ = content;
            } else {
                this.after_ = Content.newBuilder(this.after_).mergeFrom((Content.C6700a) content).buildPartial();
            }
            this.bitField0_ |= 256;
        }

        private void mergeAfterFlexible(ContentFlexible contentFlexible) {
            contentFlexible.getClass();
            ContentFlexible contentFlexible2 = this.afterFlexible_;
            if (contentFlexible2 == null || contentFlexible2 == ContentFlexible.getDefaultInstance()) {
                this.afterFlexible_ = contentFlexible;
            } else {
                this.afterFlexible_ = ContentFlexible.newBuilder(this.afterFlexible_).mergeFrom((ContentFlexible.C6703a) contentFlexible).buildPartial();
            }
            this.bitField0_ |= 512;
        }

        private void mergeAutoLoginOpen(Common$AutoLoginOpenOptions common$AutoLoginOpenOptions) {
            common$AutoLoginOpenOptions.getClass();
            Common$AutoLoginOpenOptions common$AutoLoginOpenOptions2 = this.autoLoginOpen_;
            if (common$AutoLoginOpenOptions2 == null || common$AutoLoginOpenOptions2 == Common$AutoLoginOpenOptions.getDefaultInstance()) {
                this.autoLoginOpen_ = common$AutoLoginOpenOptions;
            } else {
                this.autoLoginOpen_ = Common$AutoLoginOpenOptions.newBuilder(this.autoLoginOpen_).mergeFrom((Common$AutoLoginOpenOptions.C6394a) common$AutoLoginOpenOptions).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergeBefore(Content content) {
            content.getClass();
            Content content2 = this.before_;
            if (content2 == null || content2 == Content.getDefaultInstance()) {
                this.before_ = content;
            } else {
                this.before_ = Content.newBuilder(this.before_).mergeFrom((Content.C6700a) content).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        private void mergeBeforeFlexible(ContentFlexible contentFlexible) {
            contentFlexible.getClass();
            ContentFlexible contentFlexible2 = this.beforeFlexible_;
            if (contentFlexible2 == null || contentFlexible2 == ContentFlexible.getDefaultInstance()) {
                this.beforeFlexible_ = contentFlexible;
            } else {
                this.beforeFlexible_ = ContentFlexible.newBuilder(this.beforeFlexible_).mergeFrom((ContentFlexible.C6703a) contentFlexible).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        private void mergeDuring(Content content) {
            content.getClass();
            Content content2 = this.during_;
            if (content2 == null || content2 == Content.getDefaultInstance()) {
                this.during_ = content;
            } else {
                this.during_ = Content.newBuilder(this.during_).mergeFrom((Content.C6700a) content).buildPartial();
            }
            this.bitField0_ |= 64;
        }

        private void mergeDuringFlexible(ContentFlexible contentFlexible) {
            contentFlexible.getClass();
            ContentFlexible contentFlexible2 = this.duringFlexible_;
            if (contentFlexible2 == null || contentFlexible2 == ContentFlexible.getDefaultInstance()) {
                this.duringFlexible_ = contentFlexible;
            } else {
                this.duringFlexible_ = ContentFlexible.newBuilder(this.duringFlexible_).mergeFrom((ContentFlexible.C6703a) contentFlexible).buildPartial();
            }
            this.bitField0_ |= 128;
        }

        private void mergeEvents(Events events) {
            events.getClass();
            Events events2 = this.events_;
            if (events2 == null || events2 == Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = Events.newBuilder(this.events_).mergeFrom((Events.C6704a) events).buildPartial();
            }
            this.bitField0_ |= 1024;
        }

        private void mergeInstitution(Common$RenderedInstitution common$RenderedInstitution) {
            common$RenderedInstitution.getClass();
            Common$RenderedInstitution common$RenderedInstitution2 = this.institution_;
            if (common$RenderedInstitution2 == null || common$RenderedInstitution2 == Common$RenderedInstitution.getDefaultInstance()) {
                this.institution_ = common$RenderedInstitution;
            } else {
                this.institution_ = Common$RenderedInstitution.newBuilder(this.institution_).mergeFrom((Common$RenderedInstitution.C6476a) common$RenderedInstitution).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        private void mergeOutOfProcessIosPopup(Common$OutOfProcessIOSPopupOptions common$OutOfProcessIOSPopupOptions) {
            common$OutOfProcessIOSPopupOptions.getClass();
            if (this.openMethodCase_ != 16 || this.openMethod_ == Common$OutOfProcessIOSPopupOptions.getDefaultInstance()) {
                this.openMethod_ = common$OutOfProcessIOSPopupOptions;
            } else {
                this.openMethod_ = Common$OutOfProcessIOSPopupOptions.newBuilder((Common$OutOfProcessIOSPopupOptions) this.openMethod_).mergeFrom((Common$OutOfProcessIOSPopupOptions.C6452a) common$OutOfProcessIOSPopupOptions).buildPartial();
            }
            this.openMethodCase_ = 16;
        }

        private void mergePaneHeader(Common$PaneHeader common$PaneHeader) {
            common$PaneHeader.getClass();
            Common$PaneHeader common$PaneHeader2 = this.paneHeader_;
            if (common$PaneHeader2 == null || common$PaneHeader2 == Common$PaneHeader.getDefaultInstance()) {
                this.paneHeader_ = common$PaneHeader;
            } else {
                this.paneHeader_ = Common$PaneHeader.newBuilder(this.paneHeader_).mergeFrom((Common$PaneHeader.C6458a) common$PaneHeader).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        private void mergePollForLoginUri(PollForLoginURI pollForLoginURI) {
            pollForLoginURI.getClass();
            if (this.loginUriOptionsCase_ != 23 || this.loginUriOptions_ == PollForLoginURI.getDefaultInstance()) {
                this.loginUriOptions_ = pollForLoginURI;
            } else {
                this.loginUriOptions_ = PollForLoginURI.newBuilder((PollForLoginURI) this.loginUriOptions_).mergeFrom((PollForLoginURI.C6705a) pollForLoginURI).buildPartial();
            }
            this.loginUriOptionsCase_ = 23;
        }

        private void mergePolling(Common$PollingOptions common$PollingOptions) {
            common$PollingOptions.getClass();
            Common$PollingOptions common$PollingOptions2 = this.polling_;
            if (common$PollingOptions2 == null || common$PollingOptions2 == Common$PollingOptions.getDefaultInstance()) {
                this.polling_ = common$PollingOptions;
            } else {
                this.polling_ = Common$PollingOptions.newBuilder(this.polling_).mergeFrom((Common$PollingOptions.C6465a) common$PollingOptions).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergePopup(Common$PopupOptions common$PopupOptions) {
            common$PopupOptions.getClass();
            if (this.openMethodCase_ != 10 || this.openMethod_ == Common$PopupOptions.getDefaultInstance()) {
                this.openMethod_ = common$PopupOptions;
            } else {
                this.openMethod_ = Common$PopupOptions.newBuilder((Common$PopupOptions) this.openMethod_).mergeFrom((Common$PopupOptions.C6466a) common$PopupOptions).buildPartial();
            }
            this.openMethodCase_ = 10;
        }

        private void mergeRedirect(Common$RedirectOptions common$RedirectOptions) {
            common$RedirectOptions.getClass();
            if (this.openMethodCase_ != 11 || this.openMethod_ == Common$RedirectOptions.getDefaultInstance()) {
                this.openMethod_ = common$RedirectOptions;
            } else {
                this.openMethod_ = Common$RedirectOptions.newBuilder((Common$RedirectOptions) this.openMethod_).mergeFrom((Common$RedirectOptions.C6470a) common$RedirectOptions).buildPartial();
            }
            this.openMethodCase_ = 11;
        }

        public static C6706a newBuilder() {
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

        private void setAfter(Content content) {
            content.getClass();
            this.after_ = content;
            this.bitField0_ |= 256;
        }

        private void setAfterFlexible(ContentFlexible contentFlexible) {
            contentFlexible.getClass();
            this.afterFlexible_ = contentFlexible;
            this.bitField0_ |= 512;
        }

        private void setAutoLoginOpen(Common$AutoLoginOpenOptions common$AutoLoginOpenOptions) {
            common$AutoLoginOpenOptions.getClass();
            this.autoLoginOpen_ = common$AutoLoginOpenOptions;
            this.bitField0_ |= 2;
        }

        private void setBackgroundDisplayMode(EnumC6923m enumC6923m) {
            this.backgroundDisplayMode_ = enumC6923m.getNumber();
        }

        private void setBackgroundDisplayModeValue(int i) {
            this.backgroundDisplayMode_ = i;
        }

        private void setBefore(Content content) {
            content.getClass();
            this.before_ = content;
            this.bitField0_ |= 16;
        }

        private void setBeforeFlexible(ContentFlexible contentFlexible) {
            contentFlexible.getClass();
            this.beforeFlexible_ = contentFlexible;
            this.bitField0_ |= 32;
        }

        private void setConfiguredWithRedirectUri(boolean z) {
            this.configuredWithRedirectUri_ = z;
        }

        private void setDuring(Content content) {
            content.getClass();
            this.during_ = content;
            this.bitField0_ |= 64;
        }

        private void setDuringFlexible(ContentFlexible contentFlexible) {
            contentFlexible.getClass();
            this.duringFlexible_ = contentFlexible;
            this.bitField0_ |= 128;
        }

        private void setEvents(Events events) {
            events.getClass();
            this.events_ = events;
            this.bitField0_ |= 1024;
        }

        private void setHideFairyBits(boolean z) {
            this.hideFairyBits_ = z;
        }

        private void setInstitution(Common$RenderedInstitution common$RenderedInstitution) {
            common$RenderedInstitution.getClass();
            this.institution_ = common$RenderedInstitution;
            this.bitField0_ |= 4;
        }

        private void setLoginUri(String str) {
            str.getClass();
            this.loginUriOptionsCase_ = 1;
            this.loginUriOptions_ = str;
        }

        private void setLoginUriBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.loginUriOptions_ = byteString.toStringUtf8();
            this.loginUriOptionsCase_ = 1;
        }

        private void setOauthStateId(String str) {
            str.getClass();
            this.oauthStateId_ = str;
        }

        private void setOauthStateIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.oauthStateId_ = byteString.toStringUtf8();
        }

        private void setOauthUiExperience(EnumC6619G enumC6619G) {
            this.oauthUiExperience_ = enumC6619G.getNumber();
        }

        private void setOauthUiExperienceValue(int i) {
            this.oauthUiExperience_ = i;
        }

        private void setOutOfProcessIosPopup(Common$OutOfProcessIOSPopupOptions common$OutOfProcessIOSPopupOptions) {
            common$OutOfProcessIOSPopupOptions.getClass();
            this.openMethod_ = common$OutOfProcessIOSPopupOptions;
            this.openMethodCase_ = 16;
        }

        private void setPaneHeader(Common$PaneHeader common$PaneHeader) {
            common$PaneHeader.getClass();
            this.paneHeader_ = common$PaneHeader;
            this.bitField0_ |= 8;
        }

        private void setPollForLoginUri(PollForLoginURI pollForLoginURI) {
            pollForLoginURI.getClass();
            this.loginUriOptions_ = pollForLoginURI;
            this.loginUriOptionsCase_ = 23;
        }

        private void setPolling(Common$PollingOptions common$PollingOptions) {
            common$PollingOptions.getClass();
            this.polling_ = common$PollingOptions;
            this.bitField0_ |= 1;
        }

        private void setPopup(Common$PopupOptions common$PopupOptions) {
            common$PopupOptions.getClass();
            this.openMethod_ = common$PopupOptions;
            this.openMethodCase_ = 10;
        }

        private void setRedirect(Common$RedirectOptions common$RedirectOptions) {
            common$RedirectOptions.getClass();
            this.openMethod_ = common$RedirectOptions;
            this.openMethodCase_ = 11;
        }

        private void setShouldAwaitOauthLogging(boolean z) {
            this.shouldAwaitOauthLogging_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6920k0.f2564a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Rendering();
                case 2:
                    return new C6706a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0016\u0002\u0001\u0001\u0018\u0016\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȉ\u0003ဉ\u0004\u0004ဉ\u0006\u0005ဉ\b\u0006ဉ\n\u0007ဉ\u0002\b\u0007\tဉ\u0003\n<\u0001\u000b<\u0001\fဉ\u0000\r\u0007\u000e\f\u0010<\u0001\u0011ဉ\u0001\u0012ဉ\u0005\u0013ဉ\u0007\u0014ဉ\t\u0016\u0007\u0017<\u0000\u0018\f", new Object[]{"loginUriOptions_", "loginUriOptionsCase_", "openMethod_", "openMethodCase_", "bitField0_", "oauthStateId_", "before_", "during_", "after_", "events_", "institution_", "configuredWithRedirectUri_", "paneHeader_", Common$PopupOptions.class, Common$RedirectOptions.class, "polling_", "shouldAwaitOauthLogging_", "oauthUiExperience_", Common$OutOfProcessIOSPopupOptions.class, "autoLoginOpen_", "beforeFlexible_", "duringFlexible_", "afterFlexible_", "hideFairyBits_", PollForLoginURI.class, "backgroundDisplayMode_"});
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

        public Content getAfter() {
            Content content = this.after_;
            return content == null ? Content.getDefaultInstance() : content;
        }

        public ContentFlexible getAfterFlexible() {
            ContentFlexible contentFlexible = this.afterFlexible_;
            return contentFlexible == null ? ContentFlexible.getDefaultInstance() : contentFlexible;
        }

        public Common$AutoLoginOpenOptions getAutoLoginOpen() {
            Common$AutoLoginOpenOptions common$AutoLoginOpenOptions = this.autoLoginOpen_;
            return common$AutoLoginOpenOptions == null ? Common$AutoLoginOpenOptions.getDefaultInstance() : common$AutoLoginOpenOptions;
        }

        public EnumC6923m getBackgroundDisplayMode() {
            EnumC6923m enumC6923mForNumber = EnumC6923m.forNumber(this.backgroundDisplayMode_);
            return enumC6923mForNumber == null ? EnumC6923m.UNRECOGNIZED : enumC6923mForNumber;
        }

        public int getBackgroundDisplayModeValue() {
            return this.backgroundDisplayMode_;
        }

        public Content getBefore() {
            Content content = this.before_;
            return content == null ? Content.getDefaultInstance() : content;
        }

        public ContentFlexible getBeforeFlexible() {
            ContentFlexible contentFlexible = this.beforeFlexible_;
            return contentFlexible == null ? ContentFlexible.getDefaultInstance() : contentFlexible;
        }

        public boolean getConfiguredWithRedirectUri() {
            return this.configuredWithRedirectUri_;
        }

        public Content getDuring() {
            Content content = this.during_;
            return content == null ? Content.getDefaultInstance() : content;
        }

        public ContentFlexible getDuringFlexible() {
            ContentFlexible contentFlexible = this.duringFlexible_;
            return contentFlexible == null ? ContentFlexible.getDefaultInstance() : contentFlexible;
        }

        public Events getEvents() {
            Events events = this.events_;
            return events == null ? Events.getDefaultInstance() : events;
        }

        public boolean getHideFairyBits() {
            return this.hideFairyBits_;
        }

        public Common$RenderedInstitution getInstitution() {
            Common$RenderedInstitution common$RenderedInstitution = this.institution_;
            return common$RenderedInstitution == null ? Common$RenderedInstitution.getDefaultInstance() : common$RenderedInstitution;
        }

        public EnumC6707b getLoginUriOptionsCase() {
            return EnumC6707b.forNumber(this.loginUriOptionsCase_);
        }

        public String getOauthStateId() {
            return this.oauthStateId_;
        }

        public ByteString getOauthStateIdBytes() {
            return ByteString.copyFromUtf8(this.oauthStateId_);
        }

        public EnumC6619G getOauthUiExperience() {
            EnumC6619G enumC6619GForNumber = EnumC6619G.forNumber(this.oauthUiExperience_);
            return enumC6619GForNumber == null ? EnumC6619G.UNRECOGNIZED : enumC6619GForNumber;
        }

        public int getOauthUiExperienceValue() {
            return this.oauthUiExperience_;
        }

        public EnumC6708c getOpenMethodCase() {
            return EnumC6708c.forNumber(this.openMethodCase_);
        }

        public Common$OutOfProcessIOSPopupOptions getOutOfProcessIosPopup() {
            return this.openMethodCase_ == 16 ? (Common$OutOfProcessIOSPopupOptions) this.openMethod_ : Common$OutOfProcessIOSPopupOptions.getDefaultInstance();
        }

        public Common$PaneHeader getPaneHeader() {
            Common$PaneHeader common$PaneHeader = this.paneHeader_;
            return common$PaneHeader == null ? Common$PaneHeader.getDefaultInstance() : common$PaneHeader;
        }

        public PollForLoginURI getPollForLoginUri() {
            return this.loginUriOptionsCase_ == 23 ? (PollForLoginURI) this.loginUriOptions_ : PollForLoginURI.getDefaultInstance();
        }

        public Common$PollingOptions getPolling() {
            Common$PollingOptions common$PollingOptions = this.polling_;
            return common$PollingOptions == null ? Common$PollingOptions.getDefaultInstance() : common$PollingOptions;
        }

        public Common$PopupOptions getPopup() {
            return this.openMethodCase_ == 10 ? (Common$PopupOptions) this.openMethod_ : Common$PopupOptions.getDefaultInstance();
        }

        public Common$RedirectOptions getRedirect() {
            return this.openMethodCase_ == 11 ? (Common$RedirectOptions) this.openMethod_ : Common$RedirectOptions.getDefaultInstance();
        }

        public boolean getShouldAwaitOauthLogging() {
            return this.shouldAwaitOauthLogging_;
        }

        public boolean hasAfter() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasAfterFlexible() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasAutoLoginOpen() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasBefore() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasBeforeFlexible() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasDuring() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasDuringFlexible() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasEvents() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasInstitution() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasLoginUri() {
            return this.loginUriOptionsCase_ == 1;
        }

        public boolean hasOutOfProcessIosPopup() {
            return this.openMethodCase_ == 16;
        }

        public boolean hasPaneHeader() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasPollForLoginUri() {
            return this.loginUriOptionsCase_ == 23;
        }

        public boolean hasPolling() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasPopup() {
            return this.openMethodCase_ == 10;
        }

        public boolean hasRedirect() {
            return this.openMethodCase_ == 11;
        }

        public static C6706a newBuilder(Rendering rendering) {
            return DEFAULT_INSTANCE.createBuilder(rendering);
        }

        public static Rendering parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Rendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Rendering parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public String getLoginUri() {
            return this.loginUriOptionsCase_ == 1 ? (String) this.loginUriOptions_ : "";
        }

        public ByteString getLoginUriBytes() {
            return ByteString.copyFromUtf8(this.loginUriOptionsCase_ == 1 ? (String) this.loginUriOptions_ : "");
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

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane$a */
    public static final class C6709a extends GeneratedMessageLite.Builder<OauthPane$OAuthPane, C6709a> implements MessageLiteOrBuilder {
        public C6709a() {
            super(OauthPane$OAuthPane.DEFAULT_INSTANCE);
        }
    }

    static {
        OauthPane$OAuthPane oauthPane$OAuthPane = new OauthPane$OAuthPane();
        DEFAULT_INSTANCE = oauthPane$OAuthPane;
        GeneratedMessageLite.registerDefaultInstance(OauthPane$OAuthPane.class, oauthPane$OAuthPane);
    }

    private OauthPane$OAuthPane() {
    }

    public static OauthPane$OAuthPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6709a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OauthPane$OAuthPane parseDelimitedFrom(InputStream inputStream) {
        return (OauthPane$OAuthPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OauthPane$OAuthPane parseFrom(ByteBuffer byteBuffer) {
        return (OauthPane$OAuthPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OauthPane$OAuthPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6920k0.f2564a[methodToInvoke.ordinal()]) {
            case 1:
                return new OauthPane$OAuthPane();
            case 2:
                return new C6709a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OauthPane$OAuthPane> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (OauthPane$OAuthPane.class) {
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

    public static C6709a newBuilder(OauthPane$OAuthPane oauthPane$OAuthPane) {
        return DEFAULT_INSTANCE.createBuilder(oauthPane$OAuthPane);
    }

    public static OauthPane$OAuthPane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (OauthPane$OAuthPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OauthPane$OAuthPane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (OauthPane$OAuthPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OauthPane$OAuthPane parseFrom(ByteString byteString) {
        return (OauthPane$OAuthPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OauthPane$OAuthPane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (OauthPane$OAuthPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OauthPane$OAuthPane parseFrom(byte[] bArr) {
        return (OauthPane$OAuthPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OauthPane$OAuthPane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (OauthPane$OAuthPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OauthPane$OAuthPane parseFrom(InputStream inputStream) {
        return (OauthPane$OAuthPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OauthPane$OAuthPane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (OauthPane$OAuthPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OauthPane$OAuthPane parseFrom(CodedInputStream codedInputStream) {
        return (OauthPane$OAuthPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OauthPane$OAuthPane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (OauthPane$OAuthPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
