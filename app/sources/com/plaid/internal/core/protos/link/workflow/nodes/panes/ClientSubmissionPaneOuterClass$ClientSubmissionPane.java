package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes24.dex */
public final class ClientSubmissionPaneOuterClass$ClientSubmissionPane extends GeneratedMessageLite<ClientSubmissionPaneOuterClass$ClientSubmissionPane, C6382a> implements MessageLiteOrBuilder {
    private static final ClientSubmissionPaneOuterClass$ClientSubmissionPane DEFAULT_INSTANCE;
    private static volatile Parser<ClientSubmissionPaneOuterClass$ClientSubmissionPane> PARSER;

    public static final class Actions extends GeneratedMessageLite<Actions, C6377b> implements MessageLiteOrBuilder {
        private static final Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 2;
        private static volatile Parser<Actions> PARSER = null;
        public static final int SUBMIT_FIELD_NUMBER = 1;
        private int actionCase_ = 0;
        private Object action_;

        public static final class ExitAction extends GeneratedMessageLite<ExitAction, C6371a> implements MessageLiteOrBuilder {
            private static final ExitAction DEFAULT_INSTANCE;
            private static volatile Parser<ExitAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane$Actions$ExitAction$a */
            public static final class C6371a extends GeneratedMessageLite.Builder<ExitAction, C6371a> implements MessageLiteOrBuilder {
                public C6371a() {
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

            public static C6371a newBuilder() {
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
                switch (C6915i.f2560a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ExitAction();
                    case 2:
                        return new C6371a();
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

            public static C6371a newBuilder(ExitAction exitAction) {
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

        public static final class SubmitAction extends GeneratedMessageLite<SubmitAction, C6374a> implements MessageLiteOrBuilder {
            public static final int DATA_FIELD_NUMBER = 1;
            private static final SubmitAction DEFAULT_INSTANCE;
            private static volatile Parser<SubmitAction> PARSER;
            private Internal.ProtobufList<Data> data_ = GeneratedMessageLite.emptyProtobufList();

            public static final class Data extends GeneratedMessageLite<Data, C6372a> implements InterfaceC6375b {
                private static final Data DEFAULT_INSTANCE;
                public static final int FINGERPRINT_CALCULATED_FIELD_NUMBER = 2;
                private static volatile Parser<Data> PARSER = null;
                public static final int PHONE_NUMBER_FIELD_NUMBER = 1;
                private int valueCase_ = 0;
                private Object value_;

                /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane$Actions$SubmitAction$Data$a */
                public static final class C6372a extends GeneratedMessageLite.Builder<Data, C6372a> implements InterfaceC6375b {
                    public C6372a() {
                        super(Data.DEFAULT_INSTANCE);
                    }
                }

                /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane$Actions$SubmitAction$Data$b */
                public enum EnumC6373b {
                    PHONE_NUMBER(1),
                    FINGERPRINT_CALCULATED(2),
                    VALUE_NOT_SET(0);


                    /* renamed from: a */
                    public final int f2188a;

                    EnumC6373b(int i) {
                        this.f2188a = i;
                    }

                    public static EnumC6373b forNumber(int i) {
                        if (i == 0) {
                            return VALUE_NOT_SET;
                        }
                        if (i == 1) {
                            return PHONE_NUMBER;
                        }
                        if (i != 2) {
                            return null;
                        }
                        return FINGERPRINT_CALCULATED;
                    }

                    public int getNumber() {
                        return this.f2188a;
                    }

                    @Deprecated
                    public static EnumC6373b valueOf(int i) {
                        return forNumber(i);
                    }
                }

                static {
                    Data data = new Data();
                    DEFAULT_INSTANCE = data;
                    GeneratedMessageLite.registerDefaultInstance(Data.class, data);
                }

                private Data() {
                }

                private void clearFingerprintCalculated() {
                    if (this.valueCase_ == 2) {
                        this.valueCase_ = 0;
                        this.value_ = null;
                    }
                }

                private void clearPhoneNumber() {
                    if (this.valueCase_ == 1) {
                        this.valueCase_ = 0;
                        this.value_ = null;
                    }
                }

                private void clearValue() {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }

                public static Data getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static C6372a newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static Data parseDelimitedFrom(InputStream inputStream) {
                    return (Data) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static Data parseFrom(ByteBuffer byteBuffer) {
                    return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static Parser<Data> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                private void setFingerprintCalculated(boolean z) {
                    this.valueCase_ = 2;
                    this.value_ = Boolean.valueOf(z);
                }

                private void setPhoneNumber(String str) {
                    str.getClass();
                    this.valueCase_ = 1;
                    this.value_ = str;
                }

                private void setPhoneNumberBytes(ByteString byteString) throws IllegalArgumentException {
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    this.value_ = byteString.toStringUtf8();
                    this.valueCase_ = 1;
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    Parser defaultInstanceBasedParser;
                    switch (C6915i.f2560a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new Data();
                        case 2:
                            return new C6372a();
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȼ\u0000\u0002:\u0000", new Object[]{"value_", "valueCase_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            Parser<Data> parser = PARSER;
                            if (parser != null) {
                                return parser;
                            }
                            synchronized (Data.class) {
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

                public boolean getFingerprintCalculated() {
                    if (this.valueCase_ == 2) {
                        return ((Boolean) this.value_).booleanValue();
                    }
                    return false;
                }

                public EnumC6373b getValueCase() {
                    return EnumC6373b.forNumber(this.valueCase_);
                }

                public boolean hasFingerprintCalculated() {
                    return this.valueCase_ == 2;
                }

                public boolean hasPhoneNumber() {
                    return this.valueCase_ == 1;
                }

                public static C6372a newBuilder(Data data) {
                    return DEFAULT_INSTANCE.createBuilder(data);
                }

                public static Data parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (Data) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static Data parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                    return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public String getPhoneNumber() {
                    return this.valueCase_ == 1 ? (String) this.value_ : "";
                }

                public ByteString getPhoneNumberBytes() {
                    return ByteString.copyFromUtf8(this.valueCase_ == 1 ? (String) this.value_ : "");
                }

                public static Data parseFrom(ByteString byteString) {
                    return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                public static Data parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                    return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static Data parseFrom(byte[] bArr) {
                    return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static Data parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                    return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static Data parseFrom(InputStream inputStream) {
                    return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static Data parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static Data parseFrom(CodedInputStream codedInputStream) {
                    return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static Data parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane$Actions$SubmitAction$a */
            public static final class C6374a extends GeneratedMessageLite.Builder<SubmitAction, C6374a> implements MessageLiteOrBuilder {
                public C6374a() {
                    super(SubmitAction.DEFAULT_INSTANCE);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane$Actions$SubmitAction$b */
            public interface InterfaceC6375b extends MessageLiteOrBuilder {
            }

            static {
                SubmitAction submitAction = new SubmitAction();
                DEFAULT_INSTANCE = submitAction;
                GeneratedMessageLite.registerDefaultInstance(SubmitAction.class, submitAction);
            }

            private SubmitAction() {
            }

            private void addAllData(Iterable<? extends Data> iterable) {
                ensureDataIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.data_);
            }

            private void addData(Data data) {
                data.getClass();
                ensureDataIsMutable();
                this.data_.add(data);
            }

            private void clearData() {
                this.data_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void ensureDataIsMutable() {
                Internal.ProtobufList<Data> protobufList = this.data_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.data_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static SubmitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6374a newBuilder() {
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

            private void removeData(int i) {
                ensureDataIsMutable();
                this.data_.remove(i);
            }

            private void setData(int i, Data data) {
                data.getClass();
                ensureDataIsMutable();
                this.data_.set(i, data);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6915i.f2560a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SubmitAction();
                    case 2:
                        return new C6374a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"data_", Data.class});
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

            public Data getData(int i) {
                return this.data_.get(i);
            }

            public int getDataCount() {
                return this.data_.size();
            }

            public List<Data> getDataList() {
                return this.data_;
            }

            public InterfaceC6375b getDataOrBuilder(int i) {
                return this.data_.get(i);
            }

            public List<? extends InterfaceC6375b> getDataOrBuilderList() {
                return this.data_;
            }

            public static C6374a newBuilder(SubmitAction submitAction) {
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

            private void addData(int i, Data data) {
                data.getClass();
                ensureDataIsMutable();
                this.data_.add(i, data);
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

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane$Actions$a */
        public enum EnumC6376a {
            SUBMIT(1),
            EXIT(2),
            ACTION_NOT_SET(0);


            /* renamed from: a */
            public final int f2190a;

            EnumC6376a(int i) {
                this.f2190a = i;
            }

            public static EnumC6376a forNumber(int i) {
                if (i == 0) {
                    return ACTION_NOT_SET;
                }
                if (i == 1) {
                    return SUBMIT;
                }
                if (i != 2) {
                    return null;
                }
                return EXIT;
            }

            public int getNumber() {
                return this.f2190a;
            }

            @Deprecated
            public static EnumC6376a valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane$Actions$b */
        public static final class C6377b extends GeneratedMessageLite.Builder<Actions, C6377b> implements MessageLiteOrBuilder {
            public C6377b() {
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
                this.action_ = ExitAction.newBuilder((ExitAction) this.action_).mergeFrom((ExitAction.C6371a) exitAction).buildPartial();
            }
            this.actionCase_ = 2;
        }

        private void mergeSubmit(SubmitAction submitAction) {
            submitAction.getClass();
            if (this.actionCase_ != 1 || this.action_ == SubmitAction.getDefaultInstance()) {
                this.action_ = submitAction;
            } else {
                this.action_ = SubmitAction.newBuilder((SubmitAction) this.action_).mergeFrom((SubmitAction.C6374a) submitAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        public static C6377b newBuilder() {
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

        private void setSubmit(SubmitAction submitAction) {
            submitAction.getClass();
            this.action_ = submitAction;
            this.actionCase_ = 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6915i.f2560a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Actions();
                case 2:
                    return new C6377b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"action_", "actionCase_", SubmitAction.class, ExitAction.class});
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

        public EnumC6376a getActionCase() {
            return EnumC6376a.forNumber(this.actionCase_);
        }

        public ExitAction getExit() {
            return this.actionCase_ == 2 ? (ExitAction) this.action_ : ExitAction.getDefaultInstance();
        }

        public SubmitAction getSubmit() {
            return this.actionCase_ == 1 ? (SubmitAction) this.action_ : SubmitAction.getDefaultInstance();
        }

        public boolean hasExit() {
            return this.actionCase_ == 2;
        }

        public boolean hasSubmit() {
            return this.actionCase_ == 1;
        }

        public static C6377b newBuilder(Actions actions) {
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

    public static final class Rendering extends GeneratedMessageLite<Rendering, C6380b> implements MessageLiteOrBuilder {
        private static final Rendering DEFAULT_INSTANCE;
        public static final int EVENTS_FIELD_NUMBER = 1;
        private static volatile Parser<Rendering> PARSER = null;
        public static final int REQUIRED_SUBMISSION_DATA_FIELD_NUMBER = 3;
        public static final int WAIT_FOR_TD_DATA_COLLECTION_FIELD_NUMBER = 2;
        private static final Internal.ListAdapter.Converter<Integer, EnumC6381c> requiredSubmissionData_converter_ = new C6379a();
        private int bitField0_;
        private Events events_;
        private int requiredSubmissionDataMemoizedSerializedSize;
        private Internal.IntList requiredSubmissionData_ = GeneratedMessageLite.emptyIntList();
        private boolean waitForTdDataCollection_;

        public static final class Events extends GeneratedMessageLite<Events, C6378a> implements MessageLiteOrBuilder {
            private static final Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            private static volatile Parser<Events> PARSER;
            private Internal.ProtobufList<Common$SDKEvent> onAppear_ = GeneratedMessageLite.emptyProtobufList();

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane$Rendering$Events$a */
            public static final class C6378a extends GeneratedMessageLite.Builder<Events, C6378a> implements MessageLiteOrBuilder {
                public C6378a() {
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

            public static C6378a newBuilder() {
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
                switch (C6915i.f2560a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Events();
                    case 2:
                        return new C6378a();
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

            public static C6378a newBuilder(Events events) {
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

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane$Rendering$a */
        public class C6379a implements Internal.ListAdapter.Converter<Integer, EnumC6381c> {
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public final EnumC6381c convert(Integer num) {
                EnumC6381c enumC6381cForNumber = EnumC6381c.forNumber(num.intValue());
                return enumC6381cForNumber == null ? EnumC6381c.UNRECOGNIZED : enumC6381cForNumber;
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane$Rendering$b */
        public static final class C6380b extends GeneratedMessageLite.Builder<Rendering, C6380b> implements MessageLiteOrBuilder {
            public C6380b() {
                super(Rendering.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane$Rendering$c */
        public enum EnumC6381c implements Internal.EnumLite {
            SUBMITTED_DATA_UNKNOWN(0),
            SUBMITTED_DATA_TRUSTED_DATA(1),
            SUBMITTED_DATA_PHONE_NUMBER(2),
            UNRECOGNIZED(-1);

            public static final int SUBMITTED_DATA_PHONE_NUMBER_VALUE = 2;
            public static final int SUBMITTED_DATA_TRUSTED_DATA_VALUE = 1;
            public static final int SUBMITTED_DATA_UNKNOWN_VALUE = 0;

            /* renamed from: b */
            public static final a f2191b = new a();

            /* renamed from: a */
            public final int f2193a;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane$Rendering$c$a */
            public class a implements Internal.EnumLiteMap<EnumC6381c> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final Internal.EnumLite findValueByNumber(int i) {
                    return EnumC6381c.forNumber(i);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane$Rendering$c$b */
            public static final class b implements Internal.EnumVerifier {

                /* renamed from: a */
                public static final b f2194a = new b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return EnumC6381c.forNumber(i) != null;
                }
            }

            EnumC6381c(int i) {
                this.f2193a = i;
            }

            public static EnumC6381c forNumber(int i) {
                if (i == 0) {
                    return SUBMITTED_DATA_UNKNOWN;
                }
                if (i == 1) {
                    return SUBMITTED_DATA_TRUSTED_DATA;
                }
                if (i != 2) {
                    return null;
                }
                return SUBMITTED_DATA_PHONE_NUMBER;
            }

            public static Internal.EnumLiteMap<EnumC6381c> internalGetValueMap() {
                return f2191b;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return b.f2194a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f2193a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static EnumC6381c valueOf(int i) {
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

        private void addAllRequiredSubmissionData(Iterable<? extends EnumC6381c> iterable) {
            ensureRequiredSubmissionDataIsMutable();
            Iterator<? extends EnumC6381c> it = iterable.iterator();
            while (it.hasNext()) {
                this.requiredSubmissionData_.addInt(it.next().getNumber());
            }
        }

        private void addAllRequiredSubmissionDataValue(Iterable<Integer> iterable) {
            ensureRequiredSubmissionDataIsMutable();
            Iterator<Integer> it = iterable.iterator();
            while (it.hasNext()) {
                this.requiredSubmissionData_.addInt(it.next().intValue());
            }
        }

        private void addRequiredSubmissionData(EnumC6381c enumC6381c) {
            enumC6381c.getClass();
            ensureRequiredSubmissionDataIsMutable();
            this.requiredSubmissionData_.addInt(enumC6381c.getNumber());
        }

        private void addRequiredSubmissionDataValue(int i) {
            ensureRequiredSubmissionDataIsMutable();
            this.requiredSubmissionData_.addInt(i);
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -2;
        }

        private void clearRequiredSubmissionData() {
            this.requiredSubmissionData_ = GeneratedMessageLite.emptyIntList();
        }

        private void clearWaitForTdDataCollection() {
            this.waitForTdDataCollection_ = false;
        }

        private void ensureRequiredSubmissionDataIsMutable() {
            Internal.IntList intList = this.requiredSubmissionData_;
            if (intList.isModifiable()) {
                return;
            }
            this.requiredSubmissionData_ = GeneratedMessageLite.mutableCopy(intList);
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
                this.events_ = Events.newBuilder(this.events_).mergeFrom((Events.C6378a) events).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static C6380b newBuilder() {
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

        private void setRequiredSubmissionData(int i, EnumC6381c enumC6381c) {
            enumC6381c.getClass();
            ensureRequiredSubmissionDataIsMutable();
            this.requiredSubmissionData_.setInt(i, enumC6381c.getNumber());
        }

        private void setRequiredSubmissionDataValue(int i, int i2) {
            ensureRequiredSubmissionDataIsMutable();
            this.requiredSubmissionData_.setInt(i, i2);
        }

        private void setWaitForTdDataCollection(boolean z) {
            this.waitForTdDataCollection_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6915i.f2560a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Rendering();
                case 2:
                    return new C6380b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u0007\u0003,", new Object[]{"bitField0_", "events_", "waitForTdDataCollection_", "requiredSubmissionData_"});
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

        public Events getEvents() {
            Events events = this.events_;
            return events == null ? Events.getDefaultInstance() : events;
        }

        public EnumC6381c getRequiredSubmissionData(int i) {
            EnumC6381c enumC6381cForNumber = EnumC6381c.forNumber(this.requiredSubmissionData_.getInt(i));
            return enumC6381cForNumber == null ? EnumC6381c.UNRECOGNIZED : enumC6381cForNumber;
        }

        public int getRequiredSubmissionDataCount() {
            return this.requiredSubmissionData_.size();
        }

        public List<EnumC6381c> getRequiredSubmissionDataList() {
            return new Internal.ListAdapter(this.requiredSubmissionData_, requiredSubmissionData_converter_);
        }

        public int getRequiredSubmissionDataValue(int i) {
            return this.requiredSubmissionData_.getInt(i);
        }

        public List<Integer> getRequiredSubmissionDataValueList() {
            return this.requiredSubmissionData_;
        }

        public boolean getWaitForTdDataCollection() {
            return this.waitForTdDataCollection_;
        }

        public boolean hasEvents() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C6380b newBuilder(Rendering rendering) {
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

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane$a */
    public static final class C6382a extends GeneratedMessageLite.Builder<ClientSubmissionPaneOuterClass$ClientSubmissionPane, C6382a> implements MessageLiteOrBuilder {
        public C6382a() {
            super(ClientSubmissionPaneOuterClass$ClientSubmissionPane.DEFAULT_INSTANCE);
        }
    }

    static {
        ClientSubmissionPaneOuterClass$ClientSubmissionPane clientSubmissionPaneOuterClass$ClientSubmissionPane = new ClientSubmissionPaneOuterClass$ClientSubmissionPane();
        DEFAULT_INSTANCE = clientSubmissionPaneOuterClass$ClientSubmissionPane;
        GeneratedMessageLite.registerDefaultInstance(ClientSubmissionPaneOuterClass$ClientSubmissionPane.class, clientSubmissionPaneOuterClass$ClientSubmissionPane);
    }

    private ClientSubmissionPaneOuterClass$ClientSubmissionPane() {
    }

    public static ClientSubmissionPaneOuterClass$ClientSubmissionPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6382a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ClientSubmissionPaneOuterClass$ClientSubmissionPane parseDelimitedFrom(InputStream inputStream) {
        return (ClientSubmissionPaneOuterClass$ClientSubmissionPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientSubmissionPaneOuterClass$ClientSubmissionPane parseFrom(ByteBuffer byteBuffer) {
        return (ClientSubmissionPaneOuterClass$ClientSubmissionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ClientSubmissionPaneOuterClass$ClientSubmissionPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6915i.f2560a[methodToInvoke.ordinal()]) {
            case 1:
                return new ClientSubmissionPaneOuterClass$ClientSubmissionPane();
            case 2:
                return new C6382a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ClientSubmissionPaneOuterClass$ClientSubmissionPane> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ClientSubmissionPaneOuterClass$ClientSubmissionPane.class) {
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

    public static C6382a newBuilder(ClientSubmissionPaneOuterClass$ClientSubmissionPane clientSubmissionPaneOuterClass$ClientSubmissionPane) {
        return DEFAULT_INSTANCE.createBuilder(clientSubmissionPaneOuterClass$ClientSubmissionPane);
    }

    public static ClientSubmissionPaneOuterClass$ClientSubmissionPane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientSubmissionPaneOuterClass$ClientSubmissionPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ClientSubmissionPaneOuterClass$ClientSubmissionPane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientSubmissionPaneOuterClass$ClientSubmissionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ClientSubmissionPaneOuterClass$ClientSubmissionPane parseFrom(ByteString byteString) {
        return (ClientSubmissionPaneOuterClass$ClientSubmissionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ClientSubmissionPaneOuterClass$ClientSubmissionPane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientSubmissionPaneOuterClass$ClientSubmissionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ClientSubmissionPaneOuterClass$ClientSubmissionPane parseFrom(byte[] bArr) {
        return (ClientSubmissionPaneOuterClass$ClientSubmissionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ClientSubmissionPaneOuterClass$ClientSubmissionPane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientSubmissionPaneOuterClass$ClientSubmissionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ClientSubmissionPaneOuterClass$ClientSubmissionPane parseFrom(InputStream inputStream) {
        return (ClientSubmissionPaneOuterClass$ClientSubmissionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientSubmissionPaneOuterClass$ClientSubmissionPane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientSubmissionPaneOuterClass$ClientSubmissionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ClientSubmissionPaneOuterClass$ClientSubmissionPane parseFrom(CodedInputStream codedInputStream) {
        return (ClientSubmissionPaneOuterClass$ClientSubmissionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ClientSubmissionPaneOuterClass$ClientSubmissionPane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientSubmissionPaneOuterClass$ClientSubmissionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
