package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int64Value;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class Common$TextInputValidation extends GeneratedMessageLite<Common$TextInputValidation, C6527a> implements MessageLiteOrBuilder {
    private static final Common$TextInputValidation DEFAULT_INSTANCE;
    private static volatile Parser<Common$TextInputValidation> PARSER = null;
    public static final int RULES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Rule> rules_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Rule extends GeneratedMessageLite<Rule, C6525a> implements InterfaceC6528b {
        private static final Rule DEFAULT_INSTANCE;
        public static final int DISPLAY_ERROR_FIELD_NUMBER = 1;
        public static final int EQUALITY_FIELD_NUMBER = 5;
        public static final int LENGTH_FIELD_NUMBER = 2;
        private static volatile Parser<Rule> PARSER = null;
        public static final int PHONE_NUMBER_COUNTRY_CODE_FIELD_NUMBER = 7;
        public static final int REGEX_FIELD_NUMBER = 4;
        public static final int ROUTING_FIELD_NUMBER = 6;
        public static final int VALUE_FIELD_NUMBER = 3;
        private int bitField0_;
        private Common$LocalizedString displayError_;
        private int validationCase_ = 0;
        private Object validation_;

        public static final class Equality extends GeneratedMessageLite<Equality, C6519a> implements MessageLiteOrBuilder {
            private static final Equality DEFAULT_INSTANCE;
            public static final int OTHER_TEXT_INPUT_ID_FIELD_NUMBER = 1;
            private static volatile Parser<Equality> PARSER;
            private String otherTextInputId_ = "";

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation$Rule$Equality$a */
            public static final class C6519a extends GeneratedMessageLite.Builder<Equality, C6519a> implements MessageLiteOrBuilder {
                public C6519a() {
                    super(Equality.DEFAULT_INSTANCE);
                }
            }

            static {
                Equality equality = new Equality();
                DEFAULT_INSTANCE = equality;
                GeneratedMessageLite.registerDefaultInstance(Equality.class, equality);
            }

            private Equality() {
            }

            private void clearOtherTextInputId() {
                this.otherTextInputId_ = getDefaultInstance().getOtherTextInputId();
            }

            public static Equality getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6519a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Equality parseDelimitedFrom(InputStream inputStream) {
                return (Equality) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Equality parseFrom(ByteBuffer byteBuffer) {
                return (Equality) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Equality> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setOtherTextInputId(String str) {
                str.getClass();
                this.otherTextInputId_ = str;
            }

            private void setOtherTextInputIdBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.otherTextInputId_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Equality();
                    case 2:
                        return new C6519a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"otherTextInputId_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Equality> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Equality.class) {
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

            public String getOtherTextInputId() {
                return this.otherTextInputId_;
            }

            public ByteString getOtherTextInputIdBytes() {
                return ByteString.copyFromUtf8(this.otherTextInputId_);
            }

            public static C6519a newBuilder(Equality equality) {
                return DEFAULT_INSTANCE.createBuilder(equality);
            }

            public static Equality parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Equality) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Equality parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Equality) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Equality parseFrom(ByteString byteString) {
                return (Equality) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Equality parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Equality) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Equality parseFrom(byte[] bArr) {
                return (Equality) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Equality parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Equality) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Equality parseFrom(InputStream inputStream) {
                return (Equality) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Equality parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Equality) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Equality parseFrom(CodedInputStream codedInputStream) {
                return (Equality) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Equality parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Equality) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Length extends GeneratedMessageLite<Length, C6520a> implements MessageLiteOrBuilder {
            private static final Length DEFAULT_INSTANCE;
            public static final int MAXIMUM_FIELD_NUMBER = 2;
            public static final int MINIMUM_FIELD_NUMBER = 1;
            private static volatile Parser<Length> PARSER;
            private int maximum_;
            private int minimum_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation$Rule$Length$a */
            public static final class C6520a extends GeneratedMessageLite.Builder<Length, C6520a> implements MessageLiteOrBuilder {
                public C6520a() {
                    super(Length.DEFAULT_INSTANCE);
                }
            }

            static {
                Length length = new Length();
                DEFAULT_INSTANCE = length;
                GeneratedMessageLite.registerDefaultInstance(Length.class, length);
            }

            private Length() {
            }

            private void clearMaximum() {
                this.maximum_ = 0;
            }

            private void clearMinimum() {
                this.minimum_ = 0;
            }

            public static Length getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6520a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Length parseDelimitedFrom(InputStream inputStream) {
                return (Length) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Length parseFrom(ByteBuffer byteBuffer) {
                return (Length) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Length> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setMaximum(int i) {
                this.maximum_ = i;
            }

            private void setMinimum(int i) {
                this.minimum_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Length();
                    case 2:
                        return new C6520a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"minimum_", "maximum_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Length> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Length.class) {
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

            public int getMaximum() {
                return this.maximum_;
            }

            public int getMinimum() {
                return this.minimum_;
            }

            public static C6520a newBuilder(Length length) {
                return DEFAULT_INSTANCE.createBuilder(length);
            }

            public static Length parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Length) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Length parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Length) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Length parseFrom(ByteString byteString) {
                return (Length) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Length parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Length) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Length parseFrom(byte[] bArr) {
                return (Length) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Length parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Length) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Length parseFrom(InputStream inputStream) {
                return (Length) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Length parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Length) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Length parseFrom(CodedInputStream codedInputStream) {
                return (Length) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Length parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Length) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class PhoneNumber extends GeneratedMessageLite<PhoneNumber, C6521a> implements MessageLiteOrBuilder {
            private static final PhoneNumber DEFAULT_INSTANCE;
            private static volatile Parser<PhoneNumber> PARSER = null;
            public static final int PHONE_NUMBER_COUNTRY_CODE_FIELD_NUMBER = 1;
            private String phoneNumberCountryCode_ = "";

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation$Rule$PhoneNumber$a */
            public static final class C6521a extends GeneratedMessageLite.Builder<PhoneNumber, C6521a> implements MessageLiteOrBuilder {
                public C6521a() {
                    super(PhoneNumber.DEFAULT_INSTANCE);
                }
            }

            static {
                PhoneNumber phoneNumber = new PhoneNumber();
                DEFAULT_INSTANCE = phoneNumber;
                GeneratedMessageLite.registerDefaultInstance(PhoneNumber.class, phoneNumber);
            }

            private PhoneNumber() {
            }

            private void clearPhoneNumberCountryCode() {
                this.phoneNumberCountryCode_ = getDefaultInstance().getPhoneNumberCountryCode();
            }

            public static PhoneNumber getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6521a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static PhoneNumber parseDelimitedFrom(InputStream inputStream) {
                return (PhoneNumber) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PhoneNumber parseFrom(ByteBuffer byteBuffer) {
                return (PhoneNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<PhoneNumber> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setPhoneNumberCountryCode(String str) {
                str.getClass();
                this.phoneNumberCountryCode_ = str;
            }

            private void setPhoneNumberCountryCodeBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.phoneNumberCountryCode_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new PhoneNumber();
                    case 2:
                        return new C6521a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"phoneNumberCountryCode_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<PhoneNumber> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (PhoneNumber.class) {
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

            public String getPhoneNumberCountryCode() {
                return this.phoneNumberCountryCode_;
            }

            public ByteString getPhoneNumberCountryCodeBytes() {
                return ByteString.copyFromUtf8(this.phoneNumberCountryCode_);
            }

            public static C6521a newBuilder(PhoneNumber phoneNumber) {
                return DEFAULT_INSTANCE.createBuilder(phoneNumber);
            }

            public static PhoneNumber parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PhoneNumber) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PhoneNumber parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (PhoneNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static PhoneNumber parseFrom(ByteString byteString) {
                return (PhoneNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static PhoneNumber parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (PhoneNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static PhoneNumber parseFrom(byte[] bArr) {
                return (PhoneNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static PhoneNumber parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (PhoneNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static PhoneNumber parseFrom(InputStream inputStream) {
                return (PhoneNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static PhoneNumber parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PhoneNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static PhoneNumber parseFrom(CodedInputStream codedInputStream) {
                return (PhoneNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static PhoneNumber parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (PhoneNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Regex extends GeneratedMessageLite<Regex, C6522a> implements MessageLiteOrBuilder {
            private static final Regex DEFAULT_INSTANCE;
            private static volatile Parser<Regex> PARSER = null;
            public static final int REGEX_FIELD_NUMBER = 1;
            private String regex_ = "";

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation$Rule$Regex$a */
            public static final class C6522a extends GeneratedMessageLite.Builder<Regex, C6522a> implements MessageLiteOrBuilder {
                public C6522a() {
                    super(Regex.DEFAULT_INSTANCE);
                }
            }

            static {
                Regex regex = new Regex();
                DEFAULT_INSTANCE = regex;
                GeneratedMessageLite.registerDefaultInstance(Regex.class, regex);
            }

            private Regex() {
            }

            private void clearRegex() {
                this.regex_ = getDefaultInstance().getRegex();
            }

            public static Regex getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6522a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Regex parseDelimitedFrom(InputStream inputStream) {
                return (Regex) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Regex parseFrom(ByteBuffer byteBuffer) {
                return (Regex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Regex> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setRegex(String str) {
                str.getClass();
                this.regex_ = str;
            }

            private void setRegexBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.regex_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Regex();
                    case 2:
                        return new C6522a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"regex_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Regex> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Regex.class) {
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

            public String getRegex() {
                return this.regex_;
            }

            public ByteString getRegexBytes() {
                return ByteString.copyFromUtf8(this.regex_);
            }

            public static C6522a newBuilder(Regex regex) {
                return DEFAULT_INSTANCE.createBuilder(regex);
            }

            public static Regex parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Regex) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Regex parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Regex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Regex parseFrom(ByteString byteString) {
                return (Regex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Regex parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Regex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Regex parseFrom(byte[] bArr) {
                return (Regex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Regex parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Regex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Regex parseFrom(InputStream inputStream) {
                return (Regex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Regex parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Regex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Regex parseFrom(CodedInputStream codedInputStream) {
                return (Regex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Regex parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Regex) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class RoutingNumber extends GeneratedMessageLite<RoutingNumber, C6523a> implements MessageLiteOrBuilder {
            private static final RoutingNumber DEFAULT_INSTANCE;
            private static volatile Parser<RoutingNumber> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation$Rule$RoutingNumber$a */
            public static final class C6523a extends GeneratedMessageLite.Builder<RoutingNumber, C6523a> implements MessageLiteOrBuilder {
                public C6523a() {
                    super(RoutingNumber.DEFAULT_INSTANCE);
                }
            }

            static {
                RoutingNumber routingNumber = new RoutingNumber();
                DEFAULT_INSTANCE = routingNumber;
                GeneratedMessageLite.registerDefaultInstance(RoutingNumber.class, routingNumber);
            }

            private RoutingNumber() {
            }

            public static RoutingNumber getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6523a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static RoutingNumber parseDelimitedFrom(InputStream inputStream) {
                return (RoutingNumber) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static RoutingNumber parseFrom(ByteBuffer byteBuffer) {
                return (RoutingNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<RoutingNumber> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new RoutingNumber();
                    case 2:
                        return new C6523a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<RoutingNumber> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (RoutingNumber.class) {
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

            public static C6523a newBuilder(RoutingNumber routingNumber) {
                return DEFAULT_INSTANCE.createBuilder(routingNumber);
            }

            public static RoutingNumber parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (RoutingNumber) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static RoutingNumber parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (RoutingNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static RoutingNumber parseFrom(ByteString byteString) {
                return (RoutingNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static RoutingNumber parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (RoutingNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static RoutingNumber parseFrom(byte[] bArr) {
                return (RoutingNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static RoutingNumber parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (RoutingNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static RoutingNumber parseFrom(InputStream inputStream) {
                return (RoutingNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static RoutingNumber parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (RoutingNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static RoutingNumber parseFrom(CodedInputStream codedInputStream) {
                return (RoutingNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static RoutingNumber parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (RoutingNumber) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Value extends GeneratedMessageLite<Value, C6524a> implements MessageLiteOrBuilder {
            private static final Value DEFAULT_INSTANCE;
            public static final int MAXIMUM_FIELD_NUMBER = 2;
            public static final int MINIMUM_FIELD_NUMBER = 1;
            private static volatile Parser<Value> PARSER;
            private int bitField0_;
            private Int64Value maximum_;
            private Int64Value minimum_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation$Rule$Value$a */
            public static final class C6524a extends GeneratedMessageLite.Builder<Value, C6524a> implements MessageLiteOrBuilder {
                public C6524a() {
                    super(Value.DEFAULT_INSTANCE);
                }
            }

            static {
                Value value = new Value();
                DEFAULT_INSTANCE = value;
                GeneratedMessageLite.registerDefaultInstance(Value.class, value);
            }

            private Value() {
            }

            private void clearMaximum() {
                this.maximum_ = null;
                this.bitField0_ &= -3;
            }

            private void clearMinimum() {
                this.minimum_ = null;
                this.bitField0_ &= -2;
            }

            public static Value getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeMaximum(Int64Value int64Value) {
                int64Value.getClass();
                Int64Value int64Value2 = this.maximum_;
                if (int64Value2 == null || int64Value2 == Int64Value.getDefaultInstance()) {
                    this.maximum_ = int64Value;
                } else {
                    this.maximum_ = Int64Value.newBuilder(this.maximum_).mergeFrom((Int64Value.Builder) int64Value).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeMinimum(Int64Value int64Value) {
                int64Value.getClass();
                Int64Value int64Value2 = this.minimum_;
                if (int64Value2 == null || int64Value2 == Int64Value.getDefaultInstance()) {
                    this.minimum_ = int64Value;
                } else {
                    this.minimum_ = Int64Value.newBuilder(this.minimum_).mergeFrom((Int64Value.Builder) int64Value).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6524a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Value parseDelimitedFrom(InputStream inputStream) {
                return (Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Value parseFrom(ByteBuffer byteBuffer) {
                return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Value> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setMaximum(Int64Value int64Value) {
                int64Value.getClass();
                this.maximum_ = int64Value;
                this.bitField0_ |= 2;
            }

            private void setMinimum(Int64Value int64Value) {
                int64Value.getClass();
                this.minimum_ = int64Value;
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Value();
                    case 2:
                        return new C6524a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "minimum_", "maximum_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Value> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Value.class) {
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

            public Int64Value getMaximum() {
                Int64Value int64Value = this.maximum_;
                return int64Value == null ? Int64Value.getDefaultInstance() : int64Value;
            }

            public Int64Value getMinimum() {
                Int64Value int64Value = this.minimum_;
                return int64Value == null ? Int64Value.getDefaultInstance() : int64Value;
            }

            public boolean hasMaximum() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasMinimum() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C6524a newBuilder(Value value) {
                return DEFAULT_INSTANCE.createBuilder(value);
            }

            public static Value parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Value parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Value parseFrom(ByteString byteString) {
                return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Value parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Value parseFrom(byte[] bArr) {
                return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Value parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Value parseFrom(InputStream inputStream) {
                return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Value parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Value parseFrom(CodedInputStream codedInputStream) {
                return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Value parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation$Rule$a */
        public static final class C6525a extends GeneratedMessageLite.Builder<Rule, C6525a> implements InterfaceC6528b {
            public C6525a() {
                super(Rule.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation$Rule$b */
        public enum EnumC6526b {
            LENGTH(2),
            VALUE(3),
            REGEX(4),
            EQUALITY(5),
            ROUTING(6),
            PHONE_NUMBER_COUNTRY_CODE(7),
            VALIDATION_NOT_SET(0);


            /* renamed from: a */
            public final int f2322a;

            EnumC6526b(int i) {
                this.f2322a = i;
            }

            public static EnumC6526b forNumber(int i) {
                if (i == 0) {
                    return VALIDATION_NOT_SET;
                }
                switch (i) {
                    case 2:
                        return LENGTH;
                    case 3:
                        return VALUE;
                    case 4:
                        return REGEX;
                    case 5:
                        return EQUALITY;
                    case 6:
                        return ROUTING;
                    case 7:
                        return PHONE_NUMBER_COUNTRY_CODE;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.f2322a;
            }

            @Deprecated
            public static EnumC6526b valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            Rule rule = new Rule();
            DEFAULT_INSTANCE = rule;
            GeneratedMessageLite.registerDefaultInstance(Rule.class, rule);
        }

        private Rule() {
        }

        private void clearDisplayError() {
            this.displayError_ = null;
            this.bitField0_ &= -2;
        }

        private void clearEquality() {
            if (this.validationCase_ == 5) {
                this.validationCase_ = 0;
                this.validation_ = null;
            }
        }

        private void clearLength() {
            if (this.validationCase_ == 2) {
                this.validationCase_ = 0;
                this.validation_ = null;
            }
        }

        private void clearPhoneNumberCountryCode() {
            if (this.validationCase_ == 7) {
                this.validationCase_ = 0;
                this.validation_ = null;
            }
        }

        private void clearRegex() {
            if (this.validationCase_ == 4) {
                this.validationCase_ = 0;
                this.validation_ = null;
            }
        }

        private void clearRouting() {
            if (this.validationCase_ == 6) {
                this.validationCase_ = 0;
                this.validation_ = null;
            }
        }

        private void clearValidation() {
            this.validationCase_ = 0;
            this.validation_ = null;
        }

        private void clearValue() {
            if (this.validationCase_ == 3) {
                this.validationCase_ = 0;
                this.validation_ = null;
            }
        }

        public static Rule getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeDisplayError(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            Common$LocalizedString common$LocalizedString2 = this.displayError_;
            if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
                this.displayError_ = common$LocalizedString;
            } else {
                this.displayError_ = Common$LocalizedString.newBuilder(this.displayError_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergeEquality(Equality equality) {
            equality.getClass();
            if (this.validationCase_ != 5 || this.validation_ == Equality.getDefaultInstance()) {
                this.validation_ = equality;
            } else {
                this.validation_ = Equality.newBuilder((Equality) this.validation_).mergeFrom((Equality.C6519a) equality).buildPartial();
            }
            this.validationCase_ = 5;
        }

        private void mergeLength(Length length) {
            length.getClass();
            if (this.validationCase_ != 2 || this.validation_ == Length.getDefaultInstance()) {
                this.validation_ = length;
            } else {
                this.validation_ = Length.newBuilder((Length) this.validation_).mergeFrom((Length.C6520a) length).buildPartial();
            }
            this.validationCase_ = 2;
        }

        private void mergePhoneNumberCountryCode(PhoneNumber phoneNumber) {
            phoneNumber.getClass();
            if (this.validationCase_ != 7 || this.validation_ == PhoneNumber.getDefaultInstance()) {
                this.validation_ = phoneNumber;
            } else {
                this.validation_ = PhoneNumber.newBuilder((PhoneNumber) this.validation_).mergeFrom((PhoneNumber.C6521a) phoneNumber).buildPartial();
            }
            this.validationCase_ = 7;
        }

        private void mergeRegex(Regex regex) {
            regex.getClass();
            if (this.validationCase_ != 4 || this.validation_ == Regex.getDefaultInstance()) {
                this.validation_ = regex;
            } else {
                this.validation_ = Regex.newBuilder((Regex) this.validation_).mergeFrom((Regex.C6522a) regex).buildPartial();
            }
            this.validationCase_ = 4;
        }

        private void mergeRouting(RoutingNumber routingNumber) {
            routingNumber.getClass();
            if (this.validationCase_ != 6 || this.validation_ == RoutingNumber.getDefaultInstance()) {
                this.validation_ = routingNumber;
            } else {
                this.validation_ = RoutingNumber.newBuilder((RoutingNumber) this.validation_).mergeFrom((RoutingNumber.C6523a) routingNumber).buildPartial();
            }
            this.validationCase_ = 6;
        }

        private void mergeValue(Value value) {
            value.getClass();
            if (this.validationCase_ != 3 || this.validation_ == Value.getDefaultInstance()) {
                this.validation_ = value;
            } else {
                this.validation_ = Value.newBuilder((Value) this.validation_).mergeFrom((Value.C6524a) value).buildPartial();
            }
            this.validationCase_ = 3;
        }

        public static C6525a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Rule parseDelimitedFrom(InputStream inputStream) {
            return (Rule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Rule parseFrom(ByteBuffer byteBuffer) {
            return (Rule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Rule> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDisplayError(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            this.displayError_ = common$LocalizedString;
            this.bitField0_ |= 1;
        }

        private void setEquality(Equality equality) {
            equality.getClass();
            this.validation_ = equality;
            this.validationCase_ = 5;
        }

        private void setLength(Length length) {
            length.getClass();
            this.validation_ = length;
            this.validationCase_ = 2;
        }

        private void setPhoneNumberCountryCode(PhoneNumber phoneNumber) {
            phoneNumber.getClass();
            this.validation_ = phoneNumber;
            this.validationCase_ = 7;
        }

        private void setRegex(Regex regex) {
            regex.getClass();
            this.validation_ = regex;
            this.validationCase_ = 4;
        }

        private void setRouting(RoutingNumber routingNumber) {
            routingNumber.getClass();
            this.validation_ = routingNumber;
            this.validationCase_ = 6;
        }

        private void setValue(Value value) {
            value.getClass();
            this.validation_ = value;
            this.validationCase_ = 3;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Rule();
                case 2:
                    return new C6525a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"validation_", "validationCase_", "bitField0_", "displayError_", Length.class, Value.class, Regex.class, Equality.class, RoutingNumber.class, PhoneNumber.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Rule> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Rule.class) {
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

        public Common$LocalizedString getDisplayError() {
            Common$LocalizedString common$LocalizedString = this.displayError_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public Equality getEquality() {
            return this.validationCase_ == 5 ? (Equality) this.validation_ : Equality.getDefaultInstance();
        }

        public Length getLength() {
            return this.validationCase_ == 2 ? (Length) this.validation_ : Length.getDefaultInstance();
        }

        public PhoneNumber getPhoneNumberCountryCode() {
            return this.validationCase_ == 7 ? (PhoneNumber) this.validation_ : PhoneNumber.getDefaultInstance();
        }

        public Regex getRegex() {
            return this.validationCase_ == 4 ? (Regex) this.validation_ : Regex.getDefaultInstance();
        }

        public RoutingNumber getRouting() {
            return this.validationCase_ == 6 ? (RoutingNumber) this.validation_ : RoutingNumber.getDefaultInstance();
        }

        public EnumC6526b getValidationCase() {
            return EnumC6526b.forNumber(this.validationCase_);
        }

        public Value getValue() {
            return this.validationCase_ == 3 ? (Value) this.validation_ : Value.getDefaultInstance();
        }

        public boolean hasDisplayError() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasEquality() {
            return this.validationCase_ == 5;
        }

        public boolean hasLength() {
            return this.validationCase_ == 2;
        }

        public boolean hasPhoneNumberCountryCode() {
            return this.validationCase_ == 7;
        }

        public boolean hasRegex() {
            return this.validationCase_ == 4;
        }

        public boolean hasRouting() {
            return this.validationCase_ == 6;
        }

        public boolean hasValue() {
            return this.validationCase_ == 3;
        }

        public static C6525a newBuilder(Rule rule) {
            return DEFAULT_INSTANCE.createBuilder(rule);
        }

        public static Rule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Rule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Rule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Rule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Rule parseFrom(ByteString byteString) {
            return (Rule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Rule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Rule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Rule parseFrom(byte[] bArr) {
            return (Rule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Rule parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Rule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Rule parseFrom(InputStream inputStream) {
            return (Rule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Rule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Rule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Rule parseFrom(CodedInputStream codedInputStream) {
            return (Rule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Rule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Rule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation$a */
    public static final class C6527a extends GeneratedMessageLite.Builder<Common$TextInputValidation, C6527a> implements MessageLiteOrBuilder {
        public C6527a() {
            super(Common$TextInputValidation.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation$b */
    public interface InterfaceC6528b extends MessageLiteOrBuilder {
    }

    static {
        Common$TextInputValidation common$TextInputValidation = new Common$TextInputValidation();
        DEFAULT_INSTANCE = common$TextInputValidation;
        GeneratedMessageLite.registerDefaultInstance(Common$TextInputValidation.class, common$TextInputValidation);
    }

    private Common$TextInputValidation() {
    }

    private void addAllRules(Iterable<? extends Rule> iterable) {
        ensureRulesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.rules_);
    }

    private void addRules(Rule rule) {
        rule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(rule);
    }

    private void clearRules() {
        this.rules_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureRulesIsMutable() {
        Internal.ProtobufList<Rule> protobufList = this.rules_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.rules_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Common$TextInputValidation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6527a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$TextInputValidation parseDelimitedFrom(InputStream inputStream) {
        return (Common$TextInputValidation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$TextInputValidation parseFrom(ByteBuffer byteBuffer) {
        return (Common$TextInputValidation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$TextInputValidation> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeRules(int i) {
        ensureRulesIsMutable();
        this.rules_.remove(i);
    }

    private void setRules(int i, Rule rule) {
        rule.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i, rule);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$TextInputValidation();
            case 2:
                return new C6527a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rules_", Rule.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$TextInputValidation> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$TextInputValidation.class) {
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

    public Rule getRules(int i) {
        return this.rules_.get(i);
    }

    public int getRulesCount() {
        return this.rules_.size();
    }

    public List<Rule> getRulesList() {
        return this.rules_;
    }

    public InterfaceC6528b getRulesOrBuilder(int i) {
        return this.rules_.get(i);
    }

    public List<? extends InterfaceC6528b> getRulesOrBuilderList() {
        return this.rules_;
    }

    public static C6527a newBuilder(Common$TextInputValidation common$TextInputValidation) {
        return DEFAULT_INSTANCE.createBuilder(common$TextInputValidation);
    }

    public static Common$TextInputValidation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextInputValidation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$TextInputValidation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextInputValidation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$TextInputValidation parseFrom(ByteString byteString) {
        return (Common$TextInputValidation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addRules(int i, Rule rule) {
        rule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i, rule);
    }

    public static Common$TextInputValidation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextInputValidation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$TextInputValidation parseFrom(byte[] bArr) {
        return (Common$TextInputValidation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$TextInputValidation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextInputValidation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$TextInputValidation parseFrom(InputStream inputStream) {
        return (Common$TextInputValidation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$TextInputValidation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextInputValidation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$TextInputValidation parseFrom(CodedInputStream codedInputStream) {
        return (Common$TextInputValidation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$TextInputValidation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextInputValidation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
