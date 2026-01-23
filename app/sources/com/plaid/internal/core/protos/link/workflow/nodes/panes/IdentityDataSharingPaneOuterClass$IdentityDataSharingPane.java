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
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class IdentityDataSharingPaneOuterClass$IdentityDataSharingPane extends GeneratedMessageLite<IdentityDataSharingPaneOuterClass$IdentityDataSharingPane, C6672a> implements MessageLiteOrBuilder {
    private static final IdentityDataSharingPaneOuterClass$IdentityDataSharingPane DEFAULT_INSTANCE;
    private static volatile Parser<IdentityDataSharingPaneOuterClass$IdentityDataSharingPane> PARSER;

    public static final class Actions extends GeneratedMessageLite<Actions, C6648b> implements MessageLiteOrBuilder {
        private static final Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 2;
        private static volatile Parser<Actions> PARSER = null;
        public static final int SELECT_NEW_FIELD_NUMBER = 3;
        public static final int SUBMIT_FIELD_NUMBER = 1;
        private int actionCase_ = 0;
        private Object action_;

        public static final class ExitAction extends GeneratedMessageLite<ExitAction, C6640a> implements MessageLiteOrBuilder {
            private static final ExitAction DEFAULT_INSTANCE;
            private static volatile Parser<ExitAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$Actions$ExitAction$a */
            public static final class C6640a extends GeneratedMessageLite.Builder<ExitAction, C6640a> implements MessageLiteOrBuilder {
                public C6640a() {
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

            public static C6640a newBuilder() {
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
                switch (C6916i0.f2561a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ExitAction();
                    case 2:
                        return new C6640a();
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

            public static C6640a newBuilder(ExitAction exitAction) {
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

        public static final class SelectNewAction extends GeneratedMessageLite<SelectNewAction, C6641a> implements MessageLiteOrBuilder {
            private static final SelectNewAction DEFAULT_INSTANCE;
            private static volatile Parser<SelectNewAction> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$Actions$SelectNewAction$a */
            public static final class C6641a extends GeneratedMessageLite.Builder<SelectNewAction, C6641a> implements MessageLiteOrBuilder {
                public C6641a() {
                    super(SelectNewAction.DEFAULT_INSTANCE);
                }
            }

            static {
                SelectNewAction selectNewAction = new SelectNewAction();
                DEFAULT_INSTANCE = selectNewAction;
                GeneratedMessageLite.registerDefaultInstance(SelectNewAction.class, selectNewAction);
            }

            private SelectNewAction() {
            }

            public static SelectNewAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6641a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static SelectNewAction parseDelimitedFrom(InputStream inputStream) {
                return (SelectNewAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SelectNewAction parseFrom(ByteBuffer byteBuffer) {
                return (SelectNewAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<SelectNewAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6916i0.f2561a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SelectNewAction();
                    case 2:
                        return new C6641a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<SelectNewAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (SelectNewAction.class) {
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

            public static C6641a newBuilder(SelectNewAction selectNewAction) {
                return DEFAULT_INSTANCE.createBuilder(selectNewAction);
            }

            public static SelectNewAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SelectNewAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SelectNewAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (SelectNewAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static SelectNewAction parseFrom(ByteString byteString) {
                return (SelectNewAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static SelectNewAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (SelectNewAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static SelectNewAction parseFrom(byte[] bArr) {
                return (SelectNewAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static SelectNewAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (SelectNewAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static SelectNewAction parseFrom(InputStream inputStream) {
                return (SelectNewAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SelectNewAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SelectNewAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SelectNewAction parseFrom(CodedInputStream codedInputStream) {
                return (SelectNewAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static SelectNewAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SelectNewAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SubmitAction extends GeneratedMessageLite<SubmitAction, C6646a> implements MessageLiteOrBuilder {
            private static final SubmitAction DEFAULT_INSTANCE;
            private static volatile Parser<SubmitAction> PARSER = null;
            public static final int RESPONSE_FIELD_NUMBER = 1;
            private int bitField0_;
            private Response response_;

            public static final class Response extends GeneratedMessageLite<Response, C6645b> implements MessageLiteOrBuilder {
                public static final int ADDRESSES_FIELD_NUMBER = 8;
                public static final int DATE_OF_BIRTH_FIELD_NUMBER = 4;
                private static final Response DEFAULT_INSTANCE;
                public static final int EMAIL_FIELD_NUMBER = 3;
                public static final int NAME_FIELD_NUMBER = 1;
                private static volatile Parser<Response> PARSER = null;
                public static final int SELECTED_ACCOUNT_IDS_FIELD_NUMBER = 7;
                public static final int SELECTED_ITEM_ID_FIELD_NUMBER = 6;
                public static final int SSN_FIELD_NUMBER = 5;
                private int bitField0_;
                private Name name_;
                private String email_ = "";
                private String dateOfBirth_ = "";
                private String ssn_ = "";
                private String selectedItemId_ = "";
                private Internal.ProtobufList<String> selectedAccountIds_ = GeneratedMessageLite.emptyProtobufList();
                private Internal.ProtobufList<Address> addresses_ = GeneratedMessageLite.emptyProtobufList();

                public static final class Address extends GeneratedMessageLite<Address, C6642a> implements InterfaceC6644a {
                    public static final int CITY_FIELD_NUMBER = 4;
                    public static final int COUNTRY_FIELD_NUMBER = 6;
                    private static final Address DEFAULT_INSTANCE;
                    private static volatile Parser<Address> PARSER = null;
                    public static final int POSTAL_CODE_FIELD_NUMBER = 5;
                    public static final int REGION_FIELD_NUMBER = 3;
                    public static final int STREET2_FIELD_NUMBER = 2;
                    public static final int STREET_FIELD_NUMBER = 1;
                    private String street_ = "";
                    private String street2_ = "";
                    private String region_ = "";
                    private String city_ = "";
                    private String postalCode_ = "";
                    private String country_ = "";

                    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$Actions$SubmitAction$Response$Address$a */
                    public static final class C6642a extends GeneratedMessageLite.Builder<Address, C6642a> implements InterfaceC6644a {
                        public C6642a() {
                            super(Address.DEFAULT_INSTANCE);
                        }
                    }

                    static {
                        Address address = new Address();
                        DEFAULT_INSTANCE = address;
                        GeneratedMessageLite.registerDefaultInstance(Address.class, address);
                    }

                    private Address() {
                    }

                    private void clearCity() {
                        this.city_ = getDefaultInstance().getCity();
                    }

                    private void clearCountry() {
                        this.country_ = getDefaultInstance().getCountry();
                    }

                    private void clearPostalCode() {
                        this.postalCode_ = getDefaultInstance().getPostalCode();
                    }

                    private void clearRegion() {
                        this.region_ = getDefaultInstance().getRegion();
                    }

                    private void clearStreet() {
                        this.street_ = getDefaultInstance().getStreet();
                    }

                    private void clearStreet2() {
                        this.street2_ = getDefaultInstance().getStreet2();
                    }

                    public static Address getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static C6642a newBuilder() {
                        return DEFAULT_INSTANCE.createBuilder();
                    }

                    public static Address parseDelimitedFrom(InputStream inputStream) {
                        return (Address) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                    }

                    public static Address parseFrom(ByteBuffer byteBuffer) {
                        return (Address) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                    }

                    public static Parser<Address> parser() {
                        return DEFAULT_INSTANCE.getParserForType();
                    }

                    private void setCity(String str) {
                        str.getClass();
                        this.city_ = str;
                    }

                    private void setCityBytes(ByteString byteString) throws IllegalArgumentException {
                        AbstractMessageLite.checkByteStringIsUtf8(byteString);
                        this.city_ = byteString.toStringUtf8();
                    }

                    private void setCountry(String str) {
                        str.getClass();
                        this.country_ = str;
                    }

                    private void setCountryBytes(ByteString byteString) throws IllegalArgumentException {
                        AbstractMessageLite.checkByteStringIsUtf8(byteString);
                        this.country_ = byteString.toStringUtf8();
                    }

                    private void setPostalCode(String str) {
                        str.getClass();
                        this.postalCode_ = str;
                    }

                    private void setPostalCodeBytes(ByteString byteString) throws IllegalArgumentException {
                        AbstractMessageLite.checkByteStringIsUtf8(byteString);
                        this.postalCode_ = byteString.toStringUtf8();
                    }

                    private void setRegion(String str) {
                        str.getClass();
                        this.region_ = str;
                    }

                    private void setRegionBytes(ByteString byteString) throws IllegalArgumentException {
                        AbstractMessageLite.checkByteStringIsUtf8(byteString);
                        this.region_ = byteString.toStringUtf8();
                    }

                    private void setStreet(String str) {
                        str.getClass();
                        this.street_ = str;
                    }

                    private void setStreet2(String str) {
                        str.getClass();
                        this.street2_ = str;
                    }

                    private void setStreet2Bytes(ByteString byteString) throws IllegalArgumentException {
                        AbstractMessageLite.checkByteStringIsUtf8(byteString);
                        this.street2_ = byteString.toStringUtf8();
                    }

                    private void setStreetBytes(ByteString byteString) throws IllegalArgumentException {
                        AbstractMessageLite.checkByteStringIsUtf8(byteString);
                        this.street_ = byteString.toStringUtf8();
                    }

                    @Override // com.google.protobuf.GeneratedMessageLite
                    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                        Parser defaultInstanceBasedParser;
                        switch (C6916i0.f2561a[methodToInvoke.ordinal()]) {
                            case 1:
                                return new Address();
                            case 2:
                                return new C6642a();
                            case 3:
                                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"street_", "street2_", "region_", "city_", "postalCode_", "country_"});
                            case 4:
                                return DEFAULT_INSTANCE;
                            case 5:
                                Parser<Address> parser = PARSER;
                                if (parser != null) {
                                    return parser;
                                }
                                synchronized (Address.class) {
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

                    public String getCity() {
                        return this.city_;
                    }

                    public ByteString getCityBytes() {
                        return ByteString.copyFromUtf8(this.city_);
                    }

                    public String getCountry() {
                        return this.country_;
                    }

                    public ByteString getCountryBytes() {
                        return ByteString.copyFromUtf8(this.country_);
                    }

                    public String getPostalCode() {
                        return this.postalCode_;
                    }

                    public ByteString getPostalCodeBytes() {
                        return ByteString.copyFromUtf8(this.postalCode_);
                    }

                    public String getRegion() {
                        return this.region_;
                    }

                    public ByteString getRegionBytes() {
                        return ByteString.copyFromUtf8(this.region_);
                    }

                    public String getStreet() {
                        return this.street_;
                    }

                    public String getStreet2() {
                        return this.street2_;
                    }

                    public ByteString getStreet2Bytes() {
                        return ByteString.copyFromUtf8(this.street2_);
                    }

                    public ByteString getStreetBytes() {
                        return ByteString.copyFromUtf8(this.street_);
                    }

                    public static C6642a newBuilder(Address address) {
                        return DEFAULT_INSTANCE.createBuilder(address);
                    }

                    public static Address parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                        return (Address) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                    }

                    public static Address parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                        return (Address) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                    }

                    public static Address parseFrom(ByteString byteString) {
                        return (Address) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                    }

                    public static Address parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                        return (Address) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                    }

                    public static Address parseFrom(byte[] bArr) {
                        return (Address) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                    }

                    public static Address parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                        return (Address) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                    }

                    public static Address parseFrom(InputStream inputStream) {
                        return (Address) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                    }

                    public static Address parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                        return (Address) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                    }

                    public static Address parseFrom(CodedInputStream codedInputStream) {
                        return (Address) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                    }

                    public static Address parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        return (Address) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                    }
                }

                public static final class Name extends GeneratedMessageLite<Name, C6643a> implements MessageLiteOrBuilder {
                    private static final Name DEFAULT_INSTANCE;
                    public static final int FIRST_NAME_FIELD_NUMBER = 1;
                    public static final int LAST_NAME_FIELD_NUMBER = 2;
                    private static volatile Parser<Name> PARSER;
                    private String firstName_ = "";
                    private String lastName_ = "";

                    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$Actions$SubmitAction$Response$Name$a */
                    public static final class C6643a extends GeneratedMessageLite.Builder<Name, C6643a> implements MessageLiteOrBuilder {
                        public C6643a() {
                            super(Name.DEFAULT_INSTANCE);
                        }
                    }

                    static {
                        Name name = new Name();
                        DEFAULT_INSTANCE = name;
                        GeneratedMessageLite.registerDefaultInstance(Name.class, name);
                    }

                    private Name() {
                    }

                    private void clearFirstName() {
                        this.firstName_ = getDefaultInstance().getFirstName();
                    }

                    private void clearLastName() {
                        this.lastName_ = getDefaultInstance().getLastName();
                    }

                    public static Name getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static C6643a newBuilder() {
                        return DEFAULT_INSTANCE.createBuilder();
                    }

                    public static Name parseDelimitedFrom(InputStream inputStream) {
                        return (Name) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                    }

                    public static Name parseFrom(ByteBuffer byteBuffer) {
                        return (Name) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                    }

                    public static Parser<Name> parser() {
                        return DEFAULT_INSTANCE.getParserForType();
                    }

                    private void setFirstName(String str) {
                        str.getClass();
                        this.firstName_ = str;
                    }

                    private void setFirstNameBytes(ByteString byteString) throws IllegalArgumentException {
                        AbstractMessageLite.checkByteStringIsUtf8(byteString);
                        this.firstName_ = byteString.toStringUtf8();
                    }

                    private void setLastName(String str) {
                        str.getClass();
                        this.lastName_ = str;
                    }

                    private void setLastNameBytes(ByteString byteString) throws IllegalArgumentException {
                        AbstractMessageLite.checkByteStringIsUtf8(byteString);
                        this.lastName_ = byteString.toStringUtf8();
                    }

                    @Override // com.google.protobuf.GeneratedMessageLite
                    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                        Parser defaultInstanceBasedParser;
                        switch (C6916i0.f2561a[methodToInvoke.ordinal()]) {
                            case 1:
                                return new Name();
                            case 2:
                                return new C6643a();
                            case 3:
                                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"firstName_", "lastName_"});
                            case 4:
                                return DEFAULT_INSTANCE;
                            case 5:
                                Parser<Name> parser = PARSER;
                                if (parser != null) {
                                    return parser;
                                }
                                synchronized (Name.class) {
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

                    public String getFirstName() {
                        return this.firstName_;
                    }

                    public ByteString getFirstNameBytes() {
                        return ByteString.copyFromUtf8(this.firstName_);
                    }

                    public String getLastName() {
                        return this.lastName_;
                    }

                    public ByteString getLastNameBytes() {
                        return ByteString.copyFromUtf8(this.lastName_);
                    }

                    public static C6643a newBuilder(Name name) {
                        return DEFAULT_INSTANCE.createBuilder(name);
                    }

                    public static Name parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                        return (Name) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                    }

                    public static Name parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                        return (Name) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                    }

                    public static Name parseFrom(ByteString byteString) {
                        return (Name) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                    }

                    public static Name parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                        return (Name) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                    }

                    public static Name parseFrom(byte[] bArr) {
                        return (Name) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                    }

                    public static Name parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                        return (Name) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                    }

                    public static Name parseFrom(InputStream inputStream) {
                        return (Name) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                    }

                    public static Name parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                        return (Name) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                    }

                    public static Name parseFrom(CodedInputStream codedInputStream) {
                        return (Name) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                    }

                    public static Name parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        return (Name) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                    }
                }

                /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$Actions$SubmitAction$Response$a */
                public interface InterfaceC6644a extends MessageLiteOrBuilder {
                }

                /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$Actions$SubmitAction$Response$b */
                public static final class C6645b extends GeneratedMessageLite.Builder<Response, C6645b> implements MessageLiteOrBuilder {
                    public C6645b() {
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

                private void addAddresses(Address address) {
                    address.getClass();
                    ensureAddressesIsMutable();
                    this.addresses_.add(address);
                }

                private void addAllAddresses(Iterable<? extends Address> iterable) {
                    ensureAddressesIsMutable();
                    AbstractMessageLite.addAll((Iterable) iterable, (List) this.addresses_);
                }

                private void addAllSelectedAccountIds(Iterable<String> iterable) {
                    ensureSelectedAccountIdsIsMutable();
                    AbstractMessageLite.addAll((Iterable) iterable, (List) this.selectedAccountIds_);
                }

                private void addSelectedAccountIds(String str) {
                    str.getClass();
                    ensureSelectedAccountIdsIsMutable();
                    this.selectedAccountIds_.add(str);
                }

                private void addSelectedAccountIdsBytes(ByteString byteString) throws IllegalArgumentException {
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    ensureSelectedAccountIdsIsMutable();
                    this.selectedAccountIds_.add(byteString.toStringUtf8());
                }

                private void clearAddresses() {
                    this.addresses_ = GeneratedMessageLite.emptyProtobufList();
                }

                private void clearDateOfBirth() {
                    this.dateOfBirth_ = getDefaultInstance().getDateOfBirth();
                }

                private void clearEmail() {
                    this.email_ = getDefaultInstance().getEmail();
                }

                private void clearName() {
                    this.name_ = null;
                    this.bitField0_ &= -2;
                }

                private void clearSelectedAccountIds() {
                    this.selectedAccountIds_ = GeneratedMessageLite.emptyProtobufList();
                }

                private void clearSelectedItemId() {
                    this.selectedItemId_ = getDefaultInstance().getSelectedItemId();
                }

                private void clearSsn() {
                    this.ssn_ = getDefaultInstance().getSsn();
                }

                private void ensureAddressesIsMutable() {
                    Internal.ProtobufList<Address> protobufList = this.addresses_;
                    if (protobufList.isModifiable()) {
                        return;
                    }
                    this.addresses_ = GeneratedMessageLite.mutableCopy(protobufList);
                }

                private void ensureSelectedAccountIdsIsMutable() {
                    Internal.ProtobufList<String> protobufList = this.selectedAccountIds_;
                    if (protobufList.isModifiable()) {
                        return;
                    }
                    this.selectedAccountIds_ = GeneratedMessageLite.mutableCopy(protobufList);
                }

                public static Response getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                private void mergeName(Name name) {
                    name.getClass();
                    Name name2 = this.name_;
                    if (name2 == null || name2 == Name.getDefaultInstance()) {
                        this.name_ = name;
                    } else {
                        this.name_ = Name.newBuilder(this.name_).mergeFrom((Name.C6643a) name).buildPartial();
                    }
                    this.bitField0_ |= 1;
                }

                public static C6645b newBuilder() {
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

                private void removeAddresses(int i) {
                    ensureAddressesIsMutable();
                    this.addresses_.remove(i);
                }

                private void setAddresses(int i, Address address) {
                    address.getClass();
                    ensureAddressesIsMutable();
                    this.addresses_.set(i, address);
                }

                private void setDateOfBirth(String str) {
                    str.getClass();
                    this.dateOfBirth_ = str;
                }

                private void setDateOfBirthBytes(ByteString byteString) throws IllegalArgumentException {
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    this.dateOfBirth_ = byteString.toStringUtf8();
                }

                private void setEmail(String str) {
                    str.getClass();
                    this.email_ = str;
                }

                private void setEmailBytes(ByteString byteString) throws IllegalArgumentException {
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    this.email_ = byteString.toStringUtf8();
                }

                private void setName(Name name) {
                    name.getClass();
                    this.name_ = name;
                    this.bitField0_ |= 1;
                }

                private void setSelectedAccountIds(int i, String str) {
                    str.getClass();
                    ensureSelectedAccountIdsIsMutable();
                    this.selectedAccountIds_.set(i, str);
                }

                private void setSelectedItemId(String str) {
                    str.getClass();
                    this.selectedItemId_ = str;
                }

                private void setSelectedItemIdBytes(ByteString byteString) throws IllegalArgumentException {
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    this.selectedItemId_ = byteString.toStringUtf8();
                }

                private void setSsn(String str) {
                    str.getClass();
                    this.ssn_ = str;
                }

                private void setSsnBytes(ByteString byteString) throws IllegalArgumentException {
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    this.ssn_ = byteString.toStringUtf8();
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    Parser defaultInstanceBasedParser;
                    switch (C6916i0.f2561a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new Response();
                        case 2:
                            return new C6645b();
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\b\u0007\u0000\u0002\u0000\u0001ဉ\u0000\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ț\b\u001b", new Object[]{"bitField0_", "name_", "email_", "dateOfBirth_", "ssn_", "selectedItemId_", "selectedAccountIds_", "addresses_", Address.class});
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

                public Address getAddresses(int i) {
                    return this.addresses_.get(i);
                }

                public int getAddressesCount() {
                    return this.addresses_.size();
                }

                public List<Address> getAddressesList() {
                    return this.addresses_;
                }

                public InterfaceC6644a getAddressesOrBuilder(int i) {
                    return this.addresses_.get(i);
                }

                public List<? extends InterfaceC6644a> getAddressesOrBuilderList() {
                    return this.addresses_;
                }

                public String getDateOfBirth() {
                    return this.dateOfBirth_;
                }

                public ByteString getDateOfBirthBytes() {
                    return ByteString.copyFromUtf8(this.dateOfBirth_);
                }

                public String getEmail() {
                    return this.email_;
                }

                public ByteString getEmailBytes() {
                    return ByteString.copyFromUtf8(this.email_);
                }

                public Name getName() {
                    Name name = this.name_;
                    return name == null ? Name.getDefaultInstance() : name;
                }

                public String getSelectedAccountIds(int i) {
                    return this.selectedAccountIds_.get(i);
                }

                public ByteString getSelectedAccountIdsBytes(int i) {
                    return ByteString.copyFromUtf8(this.selectedAccountIds_.get(i));
                }

                public int getSelectedAccountIdsCount() {
                    return this.selectedAccountIds_.size();
                }

                public List<String> getSelectedAccountIdsList() {
                    return this.selectedAccountIds_;
                }

                public String getSelectedItemId() {
                    return this.selectedItemId_;
                }

                public ByteString getSelectedItemIdBytes() {
                    return ByteString.copyFromUtf8(this.selectedItemId_);
                }

                public String getSsn() {
                    return this.ssn_;
                }

                public ByteString getSsnBytes() {
                    return ByteString.copyFromUtf8(this.ssn_);
                }

                public boolean hasName() {
                    return (this.bitField0_ & 1) != 0;
                }

                public static C6645b newBuilder(Response response) {
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

                private void addAddresses(int i, Address address) {
                    address.getClass();
                    ensureAddressesIsMutable();
                    this.addresses_.add(i, address);
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

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$Actions$SubmitAction$a */
            public static final class C6646a extends GeneratedMessageLite.Builder<SubmitAction, C6646a> implements MessageLiteOrBuilder {
                public C6646a() {
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
                    this.response_ = Response.newBuilder(this.response_).mergeFrom((Response.C6645b) response).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6646a newBuilder() {
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
                switch (C6916i0.f2561a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SubmitAction();
                    case 2:
                        return new C6646a();
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

            public static C6646a newBuilder(SubmitAction submitAction) {
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

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$Actions$a */
        public enum EnumC6647a {
            SUBMIT(1),
            EXIT(2),
            SELECT_NEW(3),
            ACTION_NOT_SET(0);


            /* renamed from: a */
            public final int f2387a;

            EnumC6647a(int i) {
                this.f2387a = i;
            }

            public static EnumC6647a forNumber(int i) {
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
                return SELECT_NEW;
            }

            public int getNumber() {
                return this.f2387a;
            }

            @Deprecated
            public static EnumC6647a valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$Actions$b */
        public static final class C6648b extends GeneratedMessageLite.Builder<Actions, C6648b> implements MessageLiteOrBuilder {
            public C6648b() {
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

        private void clearSelectNew() {
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
                this.action_ = ExitAction.newBuilder((ExitAction) this.action_).mergeFrom((ExitAction.C6640a) exitAction).buildPartial();
            }
            this.actionCase_ = 2;
        }

        private void mergeSelectNew(SelectNewAction selectNewAction) {
            selectNewAction.getClass();
            if (this.actionCase_ != 3 || this.action_ == SelectNewAction.getDefaultInstance()) {
                this.action_ = selectNewAction;
            } else {
                this.action_ = SelectNewAction.newBuilder((SelectNewAction) this.action_).mergeFrom((SelectNewAction.C6641a) selectNewAction).buildPartial();
            }
            this.actionCase_ = 3;
        }

        private void mergeSubmit(SubmitAction submitAction) {
            submitAction.getClass();
            if (this.actionCase_ != 1 || this.action_ == SubmitAction.getDefaultInstance()) {
                this.action_ = submitAction;
            } else {
                this.action_ = SubmitAction.newBuilder((SubmitAction) this.action_).mergeFrom((SubmitAction.C6646a) submitAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        public static C6648b newBuilder() {
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

        private void setSelectNew(SelectNewAction selectNewAction) {
            selectNewAction.getClass();
            this.action_ = selectNewAction;
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
            switch (C6916i0.f2561a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Actions();
                case 2:
                    return new C6648b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"action_", "actionCase_", SubmitAction.class, ExitAction.class, SelectNewAction.class});
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

        public EnumC6647a getActionCase() {
            return EnumC6647a.forNumber(this.actionCase_);
        }

        public ExitAction getExit() {
            return this.actionCase_ == 2 ? (ExitAction) this.action_ : ExitAction.getDefaultInstance();
        }

        public SelectNewAction getSelectNew() {
            return this.actionCase_ == 3 ? (SelectNewAction) this.action_ : SelectNewAction.getDefaultInstance();
        }

        public SubmitAction getSubmit() {
            return this.actionCase_ == 1 ? (SubmitAction) this.action_ : SubmitAction.getDefaultInstance();
        }

        public boolean hasExit() {
            return this.actionCase_ == 2;
        }

        public boolean hasSelectNew() {
            return this.actionCase_ == 3;
        }

        public boolean hasSubmit() {
            return this.actionCase_ == 1;
        }

        public static C6648b newBuilder(Actions actions) {
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

    public static final class Rendering extends GeneratedMessageLite<Rendering, C6669b> implements MessageLiteOrBuilder {
        public static final int ACCOUNT_SELECTION_OPTIONS_FIELD_NUMBER = 8;
        public static final int AUTO_SUBMIT_FIELD_NUMBER = 7;
        private static final Rendering DEFAULT_INSTANCE;
        public static final int DISCLAIMER_TEXT_FIELD_NUMBER = 3;
        public static final int EVENTS_FIELD_NUMBER = 5;
        public static final int FIELDS_FIELD_NUMBER = 2;
        public static final int LOADING_INDICATOR_FIELD_NUMBER = 6;
        private static volatile Parser<Rendering> PARSER = null;
        public static final int PRIMARY_BUTTON_FIELD_NUMBER = 4;
        public static final int PRIMARY_TEXT_FIELD_NUMBER = 1;
        private AccountSelectionOptions accountSelectionOptions_;
        private AutoSubmit autoSubmit_;
        private int bitField0_;
        private Common$AttributedLocalizedString disclaimerText_;
        private Events events_;
        private Fields fields_;
        private Common$RenderedAssetAppearance loadingIndicator_;
        private Common$ButtonContent primaryButton_;
        private Common$AttributedLocalizedString primaryText_;

        public static final class AccountSelectionOptions extends GeneratedMessageLite<AccountSelectionOptions, C6649a> implements MessageLiteOrBuilder {
            public static final int BEHAVIOR_FIELD_NUMBER = 1;
            private static final AccountSelectionOptions DEFAULT_INSTANCE;
            private static volatile Parser<AccountSelectionOptions> PARSER = null;
            public static final int SELECTED_ITEM_SUBTITLE_FIELD_NUMBER = 2;
            private int behavior_;
            private int bitField0_;
            private Common$AttributedLocalizedString selectedItemSubtitle_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$Rendering$AccountSelectionOptions$a */
            public static final class C6649a extends GeneratedMessageLite.Builder<AccountSelectionOptions, C6649a> implements MessageLiteOrBuilder {
                public C6649a() {
                    super(AccountSelectionOptions.DEFAULT_INSTANCE);
                }
            }

            static {
                AccountSelectionOptions accountSelectionOptions = new AccountSelectionOptions();
                DEFAULT_INSTANCE = accountSelectionOptions;
                GeneratedMessageLite.registerDefaultInstance(AccountSelectionOptions.class, accountSelectionOptions);
            }

            private AccountSelectionOptions() {
            }

            private void clearBehavior() {
                this.behavior_ = 0;
            }

            private void clearSelectedItemSubtitle() {
                this.selectedItemSubtitle_ = null;
                this.bitField0_ &= -2;
            }

            public static AccountSelectionOptions getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeSelectedItemSubtitle(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.selectedItemSubtitle_;
                if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                    this.selectedItemSubtitle_ = common$AttributedLocalizedString;
                } else {
                    this.selectedItemSubtitle_ = Common$AttributedLocalizedString.newBuilder(this.selectedItemSubtitle_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6649a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static AccountSelectionOptions parseDelimitedFrom(InputStream inputStream) {
                return (AccountSelectionOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static AccountSelectionOptions parseFrom(ByteBuffer byteBuffer) {
                return (AccountSelectionOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<AccountSelectionOptions> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setBehavior(EnumC6693O enumC6693O) {
                this.behavior_ = enumC6693O.getNumber();
            }

            private void setBehaviorValue(int i) {
                this.behavior_ = i;
            }

            private void setSelectedItemSubtitle(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                this.selectedItemSubtitle_ = common$AttributedLocalizedString;
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6916i0.f2561a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new AccountSelectionOptions();
                    case 2:
                        return new C6649a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "behavior_", "selectedItemSubtitle_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<AccountSelectionOptions> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (AccountSelectionOptions.class) {
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

            public EnumC6693O getBehavior() {
                EnumC6693O enumC6693OForNumber = EnumC6693O.forNumber(this.behavior_);
                return enumC6693OForNumber == null ? EnumC6693O.UNRECOGNIZED : enumC6693OForNumber;
            }

            public int getBehaviorValue() {
                return this.behavior_;
            }

            public Common$AttributedLocalizedString getSelectedItemSubtitle() {
                Common$AttributedLocalizedString common$AttributedLocalizedString = this.selectedItemSubtitle_;
                return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
            }

            public boolean hasSelectedItemSubtitle() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C6649a newBuilder(AccountSelectionOptions accountSelectionOptions) {
                return DEFAULT_INSTANCE.createBuilder(accountSelectionOptions);
            }

            public static AccountSelectionOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (AccountSelectionOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static AccountSelectionOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (AccountSelectionOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static AccountSelectionOptions parseFrom(ByteString byteString) {
                return (AccountSelectionOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static AccountSelectionOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (AccountSelectionOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static AccountSelectionOptions parseFrom(byte[] bArr) {
                return (AccountSelectionOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static AccountSelectionOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (AccountSelectionOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static AccountSelectionOptions parseFrom(InputStream inputStream) {
                return (AccountSelectionOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static AccountSelectionOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (AccountSelectionOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static AccountSelectionOptions parseFrom(CodedInputStream codedInputStream) {
                return (AccountSelectionOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static AccountSelectionOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (AccountSelectionOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Address extends GeneratedMessageLite<Address, C6650a> implements InterfaceC6668a {
            public static final int CITY_FIELD_NUMBER = 3;
            public static final int COUNTRY_FIELD_NUMBER = 6;
            private static final Address DEFAULT_INSTANCE;
            private static volatile Parser<Address> PARSER = null;
            public static final int POSTAL_CODE_FIELD_NUMBER = 5;
            public static final int REGION_FIELD_NUMBER = 4;
            public static final int STREET2_FIELD_NUMBER = 2;
            public static final int STREET_FIELD_NUMBER = 1;
            private int bitField0_;
            private EditableTextField city_;
            private EditableTextField country_;
            private EditableTextField postalCode_;
            private EditableTextField region_;
            private EditableTextField street2_;
            private EditableTextField street_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$Rendering$Address$a */
            public static final class C6650a extends GeneratedMessageLite.Builder<Address, C6650a> implements InterfaceC6668a {
                public C6650a() {
                    super(Address.DEFAULT_INSTANCE);
                }
            }

            static {
                Address address = new Address();
                DEFAULT_INSTANCE = address;
                GeneratedMessageLite.registerDefaultInstance(Address.class, address);
            }

            private Address() {
            }

            private void clearCity() {
                this.city_ = null;
                this.bitField0_ &= -5;
            }

            private void clearCountry() {
                this.country_ = null;
                this.bitField0_ &= -33;
            }

            private void clearPostalCode() {
                this.postalCode_ = null;
                this.bitField0_ &= -17;
            }

            private void clearRegion() {
                this.region_ = null;
                this.bitField0_ &= -9;
            }

            private void clearStreet() {
                this.street_ = null;
                this.bitField0_ &= -2;
            }

            private void clearStreet2() {
                this.street2_ = null;
                this.bitField0_ &= -3;
            }

            public static Address getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeCity(EditableTextField editableTextField) {
                editableTextField.getClass();
                EditableTextField editableTextField2 = this.city_;
                if (editableTextField2 == null || editableTextField2 == EditableTextField.getDefaultInstance()) {
                    this.city_ = editableTextField;
                } else {
                    this.city_ = EditableTextField.newBuilder(this.city_).mergeFrom((EditableTextField.C6660a) editableTextField).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergeCountry(EditableTextField editableTextField) {
                editableTextField.getClass();
                EditableTextField editableTextField2 = this.country_;
                if (editableTextField2 == null || editableTextField2 == EditableTextField.getDefaultInstance()) {
                    this.country_ = editableTextField;
                } else {
                    this.country_ = EditableTextField.newBuilder(this.country_).mergeFrom((EditableTextField.C6660a) editableTextField).buildPartial();
                }
                this.bitField0_ |= 32;
            }

            private void mergePostalCode(EditableTextField editableTextField) {
                editableTextField.getClass();
                EditableTextField editableTextField2 = this.postalCode_;
                if (editableTextField2 == null || editableTextField2 == EditableTextField.getDefaultInstance()) {
                    this.postalCode_ = editableTextField;
                } else {
                    this.postalCode_ = EditableTextField.newBuilder(this.postalCode_).mergeFrom((EditableTextField.C6660a) editableTextField).buildPartial();
                }
                this.bitField0_ |= 16;
            }

            private void mergeRegion(EditableTextField editableTextField) {
                editableTextField.getClass();
                EditableTextField editableTextField2 = this.region_;
                if (editableTextField2 == null || editableTextField2 == EditableTextField.getDefaultInstance()) {
                    this.region_ = editableTextField;
                } else {
                    this.region_ = EditableTextField.newBuilder(this.region_).mergeFrom((EditableTextField.C6660a) editableTextField).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            private void mergeStreet(EditableTextField editableTextField) {
                editableTextField.getClass();
                EditableTextField editableTextField2 = this.street_;
                if (editableTextField2 == null || editableTextField2 == EditableTextField.getDefaultInstance()) {
                    this.street_ = editableTextField;
                } else {
                    this.street_ = EditableTextField.newBuilder(this.street_).mergeFrom((EditableTextField.C6660a) editableTextField).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            private void mergeStreet2(EditableTextField editableTextField) {
                editableTextField.getClass();
                EditableTextField editableTextField2 = this.street2_;
                if (editableTextField2 == null || editableTextField2 == EditableTextField.getDefaultInstance()) {
                    this.street2_ = editableTextField;
                } else {
                    this.street2_ = EditableTextField.newBuilder(this.street2_).mergeFrom((EditableTextField.C6660a) editableTextField).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            public static C6650a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Address parseDelimitedFrom(InputStream inputStream) {
                return (Address) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Address parseFrom(ByteBuffer byteBuffer) {
                return (Address) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Address> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setCity(EditableTextField editableTextField) {
                editableTextField.getClass();
                this.city_ = editableTextField;
                this.bitField0_ |= 4;
            }

            private void setCountry(EditableTextField editableTextField) {
                editableTextField.getClass();
                this.country_ = editableTextField;
                this.bitField0_ |= 32;
            }

            private void setPostalCode(EditableTextField editableTextField) {
                editableTextField.getClass();
                this.postalCode_ = editableTextField;
                this.bitField0_ |= 16;
            }

            private void setRegion(EditableTextField editableTextField) {
                editableTextField.getClass();
                this.region_ = editableTextField;
                this.bitField0_ |= 8;
            }

            private void setStreet(EditableTextField editableTextField) {
                editableTextField.getClass();
                this.street_ = editableTextField;
                this.bitField0_ |= 1;
            }

            private void setStreet2(EditableTextField editableTextField) {
                editableTextField.getClass();
                this.street2_ = editableTextField;
                this.bitField0_ |= 2;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6916i0.f2561a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Address();
                    case 2:
                        return new C6650a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"bitField0_", "street_", "street2_", "city_", "region_", "postalCode_", "country_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Address> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Address.class) {
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

            public EditableTextField getCity() {
                EditableTextField editableTextField = this.city_;
                return editableTextField == null ? EditableTextField.getDefaultInstance() : editableTextField;
            }

            public EditableTextField getCountry() {
                EditableTextField editableTextField = this.country_;
                return editableTextField == null ? EditableTextField.getDefaultInstance() : editableTextField;
            }

            public EditableTextField getPostalCode() {
                EditableTextField editableTextField = this.postalCode_;
                return editableTextField == null ? EditableTextField.getDefaultInstance() : editableTextField;
            }

            public EditableTextField getRegion() {
                EditableTextField editableTextField = this.region_;
                return editableTextField == null ? EditableTextField.getDefaultInstance() : editableTextField;
            }

            public EditableTextField getStreet() {
                EditableTextField editableTextField = this.street_;
                return editableTextField == null ? EditableTextField.getDefaultInstance() : editableTextField;
            }

            public EditableTextField getStreet2() {
                EditableTextField editableTextField = this.street2_;
                return editableTextField == null ? EditableTextField.getDefaultInstance() : editableTextField;
            }

            public boolean hasCity() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasCountry() {
                return (this.bitField0_ & 32) != 0;
            }

            public boolean hasPostalCode() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasRegion() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasStreet() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasStreet2() {
                return (this.bitField0_ & 2) != 0;
            }

            public static C6650a newBuilder(Address address) {
                return DEFAULT_INSTANCE.createBuilder(address);
            }

            public static Address parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Address) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Address parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Address) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Address parseFrom(ByteString byteString) {
                return (Address) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Address parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Address) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Address parseFrom(byte[] bArr) {
                return (Address) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Address parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Address) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Address parseFrom(InputStream inputStream) {
                return (Address) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Address parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Address) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Address parseFrom(CodedInputStream codedInputStream) {
                return (Address) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Address parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Address) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Addresses extends GeneratedMessageLite<Addresses, C6651a> implements MessageLiteOrBuilder {
            public static final int ADDRESSES_FIELD_NUMBER = 1;
            private static final Addresses DEFAULT_INSTANCE;
            private static volatile Parser<Addresses> PARSER;
            private Internal.ProtobufList<Address> addresses_ = GeneratedMessageLite.emptyProtobufList();

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$Rendering$Addresses$a */
            public static final class C6651a extends GeneratedMessageLite.Builder<Addresses, C6651a> implements MessageLiteOrBuilder {
                public C6651a() {
                    super(Addresses.DEFAULT_INSTANCE);
                }
            }

            static {
                Addresses addresses = new Addresses();
                DEFAULT_INSTANCE = addresses;
                GeneratedMessageLite.registerDefaultInstance(Addresses.class, addresses);
            }

            private Addresses() {
            }

            private void addAddresses(Address address) {
                address.getClass();
                ensureAddressesIsMutable();
                this.addresses_.add(address);
            }

            private void addAllAddresses(Iterable<? extends Address> iterable) {
                ensureAddressesIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.addresses_);
            }

            private void clearAddresses() {
                this.addresses_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void ensureAddressesIsMutable() {
                Internal.ProtobufList<Address> protobufList = this.addresses_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.addresses_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static Addresses getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6651a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Addresses parseDelimitedFrom(InputStream inputStream) {
                return (Addresses) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Addresses parseFrom(ByteBuffer byteBuffer) {
                return (Addresses) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Addresses> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeAddresses(int i) {
                ensureAddressesIsMutable();
                this.addresses_.remove(i);
            }

            private void setAddresses(int i, Address address) {
                address.getClass();
                ensureAddressesIsMutable();
                this.addresses_.set(i, address);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6916i0.f2561a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Addresses();
                    case 2:
                        return new C6651a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"addresses_", Address.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Addresses> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Addresses.class) {
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

            public Address getAddresses(int i) {
                return this.addresses_.get(i);
            }

            public int getAddressesCount() {
                return this.addresses_.size();
            }

            public List<Address> getAddressesList() {
                return this.addresses_;
            }

            public InterfaceC6668a getAddressesOrBuilder(int i) {
                return this.addresses_.get(i);
            }

            public List<? extends InterfaceC6668a> getAddressesOrBuilderList() {
                return this.addresses_;
            }

            public static C6651a newBuilder(Addresses addresses) {
                return DEFAULT_INSTANCE.createBuilder(addresses);
            }

            public static Addresses parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Addresses) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Addresses parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Addresses) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Addresses parseFrom(ByteString byteString) {
                return (Addresses) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void addAddresses(int i, Address address) {
                address.getClass();
                ensureAddressesIsMutable();
                this.addresses_.add(i, address);
            }

            public static Addresses parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Addresses) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Addresses parseFrom(byte[] bArr) {
                return (Addresses) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Addresses parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Addresses) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Addresses parseFrom(InputStream inputStream) {
                return (Addresses) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Addresses parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Addresses) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Addresses parseFrom(CodedInputStream codedInputStream) {
                return (Addresses) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Addresses parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Addresses) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class AutoSubmit extends GeneratedMessageLite<AutoSubmit, C6652a> implements MessageLiteOrBuilder {
            public static final int AFTER_MS_FIELD_NUMBER = 1;
            private static final AutoSubmit DEFAULT_INSTANCE;
            private static volatile Parser<AutoSubmit> PARSER;
            private int afterMs_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$Rendering$AutoSubmit$a */
            public static final class C6652a extends GeneratedMessageLite.Builder<AutoSubmit, C6652a> implements MessageLiteOrBuilder {
                public C6652a() {
                    super(AutoSubmit.DEFAULT_INSTANCE);
                }
            }

            static {
                AutoSubmit autoSubmit = new AutoSubmit();
                DEFAULT_INSTANCE = autoSubmit;
                GeneratedMessageLite.registerDefaultInstance(AutoSubmit.class, autoSubmit);
            }

            private AutoSubmit() {
            }

            private void clearAfterMs() {
                this.afterMs_ = 0;
            }

            public static AutoSubmit getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6652a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static AutoSubmit parseDelimitedFrom(InputStream inputStream) {
                return (AutoSubmit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static AutoSubmit parseFrom(ByteBuffer byteBuffer) {
                return (AutoSubmit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<AutoSubmit> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setAfterMs(int i) {
                this.afterMs_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6916i0.f2561a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new AutoSubmit();
                    case 2:
                        return new C6652a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"afterMs_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<AutoSubmit> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (AutoSubmit.class) {
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

            public int getAfterMs() {
                return this.afterMs_;
            }

            public static C6652a newBuilder(AutoSubmit autoSubmit) {
                return DEFAULT_INSTANCE.createBuilder(autoSubmit);
            }

            public static AutoSubmit parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (AutoSubmit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static AutoSubmit parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (AutoSubmit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static AutoSubmit parseFrom(ByteString byteString) {
                return (AutoSubmit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static AutoSubmit parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (AutoSubmit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static AutoSubmit parseFrom(byte[] bArr) {
                return (AutoSubmit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static AutoSubmit parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (AutoSubmit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static AutoSubmit parseFrom(InputStream inputStream) {
                return (AutoSubmit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static AutoSubmit parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (AutoSubmit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static AutoSubmit parseFrom(CodedInputStream codedInputStream) {
                return (AutoSubmit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static AutoSubmit parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (AutoSubmit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ConnectedAccount extends GeneratedMessageLite<ConnectedAccount, C6653a> implements InterfaceC6670c {
            public static final int ACCOUNT_TYPE_FIELD_NUMBER = 1;
            private static final ConnectedAccount DEFAULT_INSTANCE;
            public static final int EXTERNAL_ID_FIELD_NUMBER = 4;
            public static final int MASKED_ACCOUNT_NUMBER_FIELD_NUMBER = 2;
            private static volatile Parser<ConnectedAccount> PARSER = null;
            public static final int SELECTED_FIELD_NUMBER = 3;
            private boolean selected_;
            private String accountType_ = "";
            private String maskedAccountNumber_ = "";
            private String externalId_ = "";

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$Rendering$ConnectedAccount$a */
            public static final class C6653a extends GeneratedMessageLite.Builder<ConnectedAccount, C6653a> implements InterfaceC6670c {
                public C6653a() {
                    super(ConnectedAccount.DEFAULT_INSTANCE);
                }
            }

            static {
                ConnectedAccount connectedAccount = new ConnectedAccount();
                DEFAULT_INSTANCE = connectedAccount;
                GeneratedMessageLite.registerDefaultInstance(ConnectedAccount.class, connectedAccount);
            }

            private ConnectedAccount() {
            }

            private void clearAccountType() {
                this.accountType_ = getDefaultInstance().getAccountType();
            }

            private void clearExternalId() {
                this.externalId_ = getDefaultInstance().getExternalId();
            }

            private void clearMaskedAccountNumber() {
                this.maskedAccountNumber_ = getDefaultInstance().getMaskedAccountNumber();
            }

            private void clearSelected() {
                this.selected_ = false;
            }

            public static ConnectedAccount getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6653a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ConnectedAccount parseDelimitedFrom(InputStream inputStream) {
                return (ConnectedAccount) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ConnectedAccount parseFrom(ByteBuffer byteBuffer) {
                return (ConnectedAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ConnectedAccount> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setAccountType(String str) {
                str.getClass();
                this.accountType_ = str;
            }

            private void setAccountTypeBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.accountType_ = byteString.toStringUtf8();
            }

            private void setExternalId(String str) {
                str.getClass();
                this.externalId_ = str;
            }

            private void setExternalIdBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.externalId_ = byteString.toStringUtf8();
            }

            private void setMaskedAccountNumber(String str) {
                str.getClass();
                this.maskedAccountNumber_ = str;
            }

            private void setMaskedAccountNumberBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.maskedAccountNumber_ = byteString.toStringUtf8();
            }

            private void setSelected(boolean z) {
                this.selected_ = z;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6916i0.f2561a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ConnectedAccount();
                    case 2:
                        return new C6653a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ", new Object[]{"accountType_", "maskedAccountNumber_", "selected_", "externalId_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ConnectedAccount> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (ConnectedAccount.class) {
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

            public String getAccountType() {
                return this.accountType_;
            }

            public ByteString getAccountTypeBytes() {
                return ByteString.copyFromUtf8(this.accountType_);
            }

            public String getExternalId() {
                return this.externalId_;
            }

            public ByteString getExternalIdBytes() {
                return ByteString.copyFromUtf8(this.externalId_);
            }

            public String getMaskedAccountNumber() {
                return this.maskedAccountNumber_;
            }

            public ByteString getMaskedAccountNumberBytes() {
                return ByteString.copyFromUtf8(this.maskedAccountNumber_);
            }

            public boolean getSelected() {
                return this.selected_;
            }

            public static C6653a newBuilder(ConnectedAccount connectedAccount) {
                return DEFAULT_INSTANCE.createBuilder(connectedAccount);
            }

            public static ConnectedAccount parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ConnectedAccount) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ConnectedAccount parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ConnectedAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ConnectedAccount parseFrom(ByteString byteString) {
                return (ConnectedAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ConnectedAccount parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ConnectedAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ConnectedAccount parseFrom(byte[] bArr) {
                return (ConnectedAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ConnectedAccount parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ConnectedAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ConnectedAccount parseFrom(InputStream inputStream) {
                return (ConnectedAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ConnectedAccount parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ConnectedAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ConnectedAccount parseFrom(CodedInputStream codedInputStream) {
                return (ConnectedAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ConnectedAccount parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ConnectedAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ConnectedItem extends GeneratedMessageLite<ConnectedItem, C6655a> implements InterfaceC6671d {
            public static final int ACCOUNTS_FIELD_NUMBER = 3;
            private static final ConnectedItem DEFAULT_INSTANCE;
            public static final int EXTERNAL_ID_FIELD_NUMBER = 4;
            public static final int INSTITUTION_LOGO_FIELD_NUMBER = 2;
            public static final int INSTITUTION_NAME_FIELD_NUMBER = 1;
            public static final int NOTE_FIELD_NUMBER = 5;
            private static volatile Parser<ConnectedItem> PARSER = null;
            public static final int SELECTION_OVERRIDE_MODAL_FIELD_NUMBER = 6;
            private int bitField0_;
            private Common$RenderedAssetAppearance institutionLogo_;
            private Note note_;
            private Common$Modal selectionOverrideModal_;
            private String institutionName_ = "";
            private String externalId_ = "";
            private Internal.ProtobufList<ConnectedAccount> accounts_ = GeneratedMessageLite.emptyProtobufList();

            public static final class Note extends GeneratedMessageLite<Note, C6654a> implements MessageLiteOrBuilder {
                private static final Note DEFAULT_INSTANCE;
                public static final int ICON_FIELD_NUMBER = 1;
                public static final int LABEL_FIELD_NUMBER = 2;
                private static volatile Parser<Note> PARSER;
                private int bitField0_;
                private Common$RenderedAssetAppearance icon_;
                private Common$AttributedLocalizedString label_;

                /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$Rendering$ConnectedItem$Note$a */
                public static final class C6654a extends GeneratedMessageLite.Builder<Note, C6654a> implements MessageLiteOrBuilder {
                    public C6654a() {
                        super(Note.DEFAULT_INSTANCE);
                    }
                }

                static {
                    Note note = new Note();
                    DEFAULT_INSTANCE = note;
                    GeneratedMessageLite.registerDefaultInstance(Note.class, note);
                }

                private Note() {
                }

                private void clearIcon() {
                    this.icon_ = null;
                    this.bitField0_ &= -2;
                }

                private void clearLabel() {
                    this.label_ = null;
                    this.bitField0_ &= -3;
                }

                public static Note getDefaultInstance() {
                    return DEFAULT_INSTANCE;
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

                private void mergeLabel(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                    common$AttributedLocalizedString.getClass();
                    Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.label_;
                    if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                        this.label_ = common$AttributedLocalizedString;
                    } else {
                        this.label_ = Common$AttributedLocalizedString.newBuilder(this.label_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
                    }
                    this.bitField0_ |= 2;
                }

                public static C6654a newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static Note parseDelimitedFrom(InputStream inputStream) {
                    return (Note) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static Note parseFrom(ByteBuffer byteBuffer) {
                    return (Note) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static Parser<Note> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                private void setIcon(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                    common$RenderedAssetAppearance.getClass();
                    this.icon_ = common$RenderedAssetAppearance;
                    this.bitField0_ |= 1;
                }

                private void setLabel(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                    common$AttributedLocalizedString.getClass();
                    this.label_ = common$AttributedLocalizedString;
                    this.bitField0_ |= 2;
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    Parser defaultInstanceBasedParser;
                    switch (C6916i0.f2561a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new Note();
                        case 2:
                            return new C6654a();
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "icon_", "label_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            Parser<Note> parser = PARSER;
                            if (parser != null) {
                                return parser;
                            }
                            synchronized (Note.class) {
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

                public Common$RenderedAssetAppearance getIcon() {
                    Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.icon_;
                    return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
                }

                public Common$AttributedLocalizedString getLabel() {
                    Common$AttributedLocalizedString common$AttributedLocalizedString = this.label_;
                    return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
                }

                public boolean hasIcon() {
                    return (this.bitField0_ & 1) != 0;
                }

                public boolean hasLabel() {
                    return (this.bitField0_ & 2) != 0;
                }

                public static C6654a newBuilder(Note note) {
                    return DEFAULT_INSTANCE.createBuilder(note);
                }

                public static Note parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (Note) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static Note parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                    return (Note) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static Note parseFrom(ByteString byteString) {
                    return (Note) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                public static Note parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                    return (Note) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static Note parseFrom(byte[] bArr) {
                    return (Note) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static Note parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                    return (Note) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static Note parseFrom(InputStream inputStream) {
                    return (Note) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static Note parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (Note) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static Note parseFrom(CodedInputStream codedInputStream) {
                    return (Note) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static Note parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (Note) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$Rendering$ConnectedItem$a */
            public static final class C6655a extends GeneratedMessageLite.Builder<ConnectedItem, C6655a> implements InterfaceC6671d {
                public C6655a() {
                    super(ConnectedItem.DEFAULT_INSTANCE);
                }
            }

            static {
                ConnectedItem connectedItem = new ConnectedItem();
                DEFAULT_INSTANCE = connectedItem;
                GeneratedMessageLite.registerDefaultInstance(ConnectedItem.class, connectedItem);
            }

            private ConnectedItem() {
            }

            private void addAccounts(ConnectedAccount connectedAccount) {
                connectedAccount.getClass();
                ensureAccountsIsMutable();
                this.accounts_.add(connectedAccount);
            }

            private void addAllAccounts(Iterable<? extends ConnectedAccount> iterable) {
                ensureAccountsIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.accounts_);
            }

            private void clearAccounts() {
                this.accounts_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearExternalId() {
                this.externalId_ = getDefaultInstance().getExternalId();
            }

            private void clearInstitutionLogo() {
                this.institutionLogo_ = null;
                this.bitField0_ &= -2;
            }

            private void clearInstitutionName() {
                this.institutionName_ = getDefaultInstance().getInstitutionName();
            }

            private void clearNote() {
                this.note_ = null;
                this.bitField0_ &= -3;
            }

            private void clearSelectionOverrideModal() {
                this.selectionOverrideModal_ = null;
                this.bitField0_ &= -5;
            }

            private void ensureAccountsIsMutable() {
                Internal.ProtobufList<ConnectedAccount> protobufList = this.accounts_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.accounts_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static ConnectedItem getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeInstitutionLogo(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                common$RenderedAssetAppearance.getClass();
                Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.institutionLogo_;
                if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == Common$RenderedAssetAppearance.getDefaultInstance()) {
                    this.institutionLogo_ = common$RenderedAssetAppearance;
                } else {
                    this.institutionLogo_ = Common$RenderedAssetAppearance.newBuilder(this.institutionLogo_).mergeFrom((Common$RenderedAssetAppearance.C6475a) common$RenderedAssetAppearance).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            private void mergeNote(Note note) {
                note.getClass();
                Note note2 = this.note_;
                if (note2 == null || note2 == Note.getDefaultInstance()) {
                    this.note_ = note;
                } else {
                    this.note_ = Note.newBuilder(this.note_).mergeFrom((Note.C6654a) note).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeSelectionOverrideModal(Common$Modal common$Modal) {
                common$Modal.getClass();
                Common$Modal common$Modal2 = this.selectionOverrideModal_;
                if (common$Modal2 == null || common$Modal2 == Common$Modal.getDefaultInstance()) {
                    this.selectionOverrideModal_ = common$Modal;
                } else {
                    this.selectionOverrideModal_ = Common$Modal.newBuilder(this.selectionOverrideModal_).mergeFrom((Common$Modal.C6446a) common$Modal).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            public static C6655a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ConnectedItem parseDelimitedFrom(InputStream inputStream) {
                return (ConnectedItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ConnectedItem parseFrom(ByteBuffer byteBuffer) {
                return (ConnectedItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ConnectedItem> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeAccounts(int i) {
                ensureAccountsIsMutable();
                this.accounts_.remove(i);
            }

            private void setAccounts(int i, ConnectedAccount connectedAccount) {
                connectedAccount.getClass();
                ensureAccountsIsMutable();
                this.accounts_.set(i, connectedAccount);
            }

            private void setExternalId(String str) {
                str.getClass();
                this.externalId_ = str;
            }

            private void setExternalIdBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.externalId_ = byteString.toStringUtf8();
            }

            private void setInstitutionLogo(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
                common$RenderedAssetAppearance.getClass();
                this.institutionLogo_ = common$RenderedAssetAppearance;
                this.bitField0_ |= 1;
            }

            private void setInstitutionName(String str) {
                str.getClass();
                this.institutionName_ = str;
            }

            private void setInstitutionNameBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.institutionName_ = byteString.toStringUtf8();
            }

            private void setNote(Note note) {
                note.getClass();
                this.note_ = note;
                this.bitField0_ |= 2;
            }

            private void setSelectionOverrideModal(Common$Modal common$Modal) {
                common$Modal.getClass();
                this.selectionOverrideModal_ = common$Modal;
                this.bitField0_ |= 4;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6916i0.f2561a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ConnectedItem();
                    case 2:
                        return new C6655a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u001b\u0004Ȉ\u0005ဉ\u0001\u0006ဉ\u0002", new Object[]{"bitField0_", "institutionName_", "institutionLogo_", "accounts_", ConnectedAccount.class, "externalId_", "note_", "selectionOverrideModal_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ConnectedItem> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (ConnectedItem.class) {
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

            public ConnectedAccount getAccounts(int i) {
                return this.accounts_.get(i);
            }

            public int getAccountsCount() {
                return this.accounts_.size();
            }

            public List<ConnectedAccount> getAccountsList() {
                return this.accounts_;
            }

            public InterfaceC6670c getAccountsOrBuilder(int i) {
                return this.accounts_.get(i);
            }

            public List<? extends InterfaceC6670c> getAccountsOrBuilderList() {
                return this.accounts_;
            }

            public String getExternalId() {
                return this.externalId_;
            }

            public ByteString getExternalIdBytes() {
                return ByteString.copyFromUtf8(this.externalId_);
            }

            public Common$RenderedAssetAppearance getInstitutionLogo() {
                Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.institutionLogo_;
                return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
            }

            public String getInstitutionName() {
                return this.institutionName_;
            }

            public ByteString getInstitutionNameBytes() {
                return ByteString.copyFromUtf8(this.institutionName_);
            }

            public Note getNote() {
                Note note = this.note_;
                return note == null ? Note.getDefaultInstance() : note;
            }

            public Common$Modal getSelectionOverrideModal() {
                Common$Modal common$Modal = this.selectionOverrideModal_;
                return common$Modal == null ? Common$Modal.getDefaultInstance() : common$Modal;
            }

            public boolean hasInstitutionLogo() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasNote() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasSelectionOverrideModal() {
                return (this.bitField0_ & 4) != 0;
            }

            public static C6655a newBuilder(ConnectedItem connectedItem) {
                return DEFAULT_INSTANCE.createBuilder(connectedItem);
            }

            public static ConnectedItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ConnectedItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ConnectedItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ConnectedItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ConnectedItem parseFrom(ByteString byteString) {
                return (ConnectedItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void addAccounts(int i, ConnectedAccount connectedAccount) {
                connectedAccount.getClass();
                ensureAccountsIsMutable();
                this.accounts_.add(i, connectedAccount);
            }

            public static ConnectedItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ConnectedItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ConnectedItem parseFrom(byte[] bArr) {
                return (ConnectedItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ConnectedItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ConnectedItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ConnectedItem parseFrom(InputStream inputStream) {
                return (ConnectedItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ConnectedItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ConnectedItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ConnectedItem parseFrom(CodedInputStream codedInputStream) {
                return (ConnectedItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ConnectedItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ConnectedItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ConnectedItems extends GeneratedMessageLite<ConnectedItems, C6656a> implements MessageLiteOrBuilder {
            private static final ConnectedItems DEFAULT_INSTANCE;
            public static final int DESIRED_ACCOUNT_TYPE_POPUP_FIELD_NUMBER = 3;
            public static final int ITEMS_FIELD_NUMBER = 1;
            private static volatile Parser<ConnectedItems> PARSER = null;
            public static final int SELECTED_ITEM_ID_FIELD_NUMBER = 2;
            private int bitField0_;
            private DesiredAccountTypePopUp desiredAccountTypePopup_;
            private Internal.ProtobufList<ConnectedItem> items_ = GeneratedMessageLite.emptyProtobufList();
            private String selectedItemId_ = "";

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$Rendering$ConnectedItems$a */
            public static final class C6656a extends GeneratedMessageLite.Builder<ConnectedItems, C6656a> implements MessageLiteOrBuilder {
                public C6656a() {
                    super(ConnectedItems.DEFAULT_INSTANCE);
                }
            }

            static {
                ConnectedItems connectedItems = new ConnectedItems();
                DEFAULT_INSTANCE = connectedItems;
                GeneratedMessageLite.registerDefaultInstance(ConnectedItems.class, connectedItems);
            }

            private ConnectedItems() {
            }

            private void addAllItems(Iterable<? extends ConnectedItem> iterable) {
                ensureItemsIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.items_);
            }

            private void addItems(ConnectedItem connectedItem) {
                connectedItem.getClass();
                ensureItemsIsMutable();
                this.items_.add(connectedItem);
            }

            private void clearDesiredAccountTypePopup() {
                this.desiredAccountTypePopup_ = null;
                this.bitField0_ &= -2;
            }

            private void clearItems() {
                this.items_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearSelectedItemId() {
                this.selectedItemId_ = getDefaultInstance().getSelectedItemId();
            }

            private void ensureItemsIsMutable() {
                Internal.ProtobufList<ConnectedItem> protobufList = this.items_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.items_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static ConnectedItems getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeDesiredAccountTypePopup(DesiredAccountTypePopUp desiredAccountTypePopUp) {
                desiredAccountTypePopUp.getClass();
                DesiredAccountTypePopUp desiredAccountTypePopUp2 = this.desiredAccountTypePopup_;
                if (desiredAccountTypePopUp2 == null || desiredAccountTypePopUp2 == DesiredAccountTypePopUp.getDefaultInstance()) {
                    this.desiredAccountTypePopup_ = desiredAccountTypePopUp;
                } else {
                    this.desiredAccountTypePopup_ = DesiredAccountTypePopUp.newBuilder(this.desiredAccountTypePopup_).mergeFrom((DesiredAccountTypePopUp.C6658a) desiredAccountTypePopUp).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6656a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ConnectedItems parseDelimitedFrom(InputStream inputStream) {
                return (ConnectedItems) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ConnectedItems parseFrom(ByteBuffer byteBuffer) {
                return (ConnectedItems) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ConnectedItems> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeItems(int i) {
                ensureItemsIsMutable();
                this.items_.remove(i);
            }

            private void setDesiredAccountTypePopup(DesiredAccountTypePopUp desiredAccountTypePopUp) {
                desiredAccountTypePopUp.getClass();
                this.desiredAccountTypePopup_ = desiredAccountTypePopUp;
                this.bitField0_ |= 1;
            }

            private void setItems(int i, ConnectedItem connectedItem) {
                connectedItem.getClass();
                ensureItemsIsMutable();
                this.items_.set(i, connectedItem);
            }

            private void setSelectedItemId(String str) {
                str.getClass();
                this.selectedItemId_ = str;
            }

            private void setSelectedItemIdBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.selectedItemId_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6916i0.f2561a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ConnectedItems();
                    case 2:
                        return new C6656a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003ဉ\u0000", new Object[]{"bitField0_", "items_", ConnectedItem.class, "selectedItemId_", "desiredAccountTypePopup_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ConnectedItems> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (ConnectedItems.class) {
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

            public DesiredAccountTypePopUp getDesiredAccountTypePopup() {
                DesiredAccountTypePopUp desiredAccountTypePopUp = this.desiredAccountTypePopup_;
                return desiredAccountTypePopUp == null ? DesiredAccountTypePopUp.getDefaultInstance() : desiredAccountTypePopUp;
            }

            public ConnectedItem getItems(int i) {
                return this.items_.get(i);
            }

            public int getItemsCount() {
                return this.items_.size();
            }

            public List<ConnectedItem> getItemsList() {
                return this.items_;
            }

            public InterfaceC6671d getItemsOrBuilder(int i) {
                return this.items_.get(i);
            }

            public List<? extends InterfaceC6671d> getItemsOrBuilderList() {
                return this.items_;
            }

            public String getSelectedItemId() {
                return this.selectedItemId_;
            }

            public ByteString getSelectedItemIdBytes() {
                return ByteString.copyFromUtf8(this.selectedItemId_);
            }

            public boolean hasDesiredAccountTypePopup() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C6656a newBuilder(ConnectedItems connectedItems) {
                return DEFAULT_INSTANCE.createBuilder(connectedItems);
            }

            public static ConnectedItems parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ConnectedItems) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ConnectedItems parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ConnectedItems) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ConnectedItems parseFrom(ByteString byteString) {
                return (ConnectedItems) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void addItems(int i, ConnectedItem connectedItem) {
                connectedItem.getClass();
                ensureItemsIsMutable();
                this.items_.add(i, connectedItem);
            }

            public static ConnectedItems parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ConnectedItems) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ConnectedItems parseFrom(byte[] bArr) {
                return (ConnectedItems) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ConnectedItems parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ConnectedItems) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ConnectedItems parseFrom(InputStream inputStream) {
                return (ConnectedItems) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ConnectedItems parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ConnectedItems) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ConnectedItems parseFrom(CodedInputStream codedInputStream) {
                return (ConnectedItems) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ConnectedItems parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ConnectedItems) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class DateOfBirth extends GeneratedMessageLite<DateOfBirth, C6657a> implements MessageLiteOrBuilder {
            public static final int DAY_FIELD_NUMBER = 4;
            private static final DateOfBirth DEFAULT_INSTANCE;
            public static final int MONTH_FIELD_NUMBER = 3;
            private static volatile Parser<DateOfBirth> PARSER = null;
            public static final int YEAR_FIELD_NUMBER = 2;
            private int bitField0_;
            private EditableTextField day_;
            private EditableTextField month_;
            private EditableTextField year_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$Rendering$DateOfBirth$a */
            public static final class C6657a extends GeneratedMessageLite.Builder<DateOfBirth, C6657a> implements MessageLiteOrBuilder {
                public C6657a() {
                    super(DateOfBirth.DEFAULT_INSTANCE);
                }
            }

            static {
                DateOfBirth dateOfBirth = new DateOfBirth();
                DEFAULT_INSTANCE = dateOfBirth;
                GeneratedMessageLite.registerDefaultInstance(DateOfBirth.class, dateOfBirth);
            }

            private DateOfBirth() {
            }

            private void clearDay() {
                this.day_ = null;
                this.bitField0_ &= -5;
            }

            private void clearMonth() {
                this.month_ = null;
                this.bitField0_ &= -3;
            }

            private void clearYear() {
                this.year_ = null;
                this.bitField0_ &= -2;
            }

            public static DateOfBirth getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeDay(EditableTextField editableTextField) {
                editableTextField.getClass();
                EditableTextField editableTextField2 = this.day_;
                if (editableTextField2 == null || editableTextField2 == EditableTextField.getDefaultInstance()) {
                    this.day_ = editableTextField;
                } else {
                    this.day_ = EditableTextField.newBuilder(this.day_).mergeFrom((EditableTextField.C6660a) editableTextField).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergeMonth(EditableTextField editableTextField) {
                editableTextField.getClass();
                EditableTextField editableTextField2 = this.month_;
                if (editableTextField2 == null || editableTextField2 == EditableTextField.getDefaultInstance()) {
                    this.month_ = editableTextField;
                } else {
                    this.month_ = EditableTextField.newBuilder(this.month_).mergeFrom((EditableTextField.C6660a) editableTextField).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeYear(EditableTextField editableTextField) {
                editableTextField.getClass();
                EditableTextField editableTextField2 = this.year_;
                if (editableTextField2 == null || editableTextField2 == EditableTextField.getDefaultInstance()) {
                    this.year_ = editableTextField;
                } else {
                    this.year_ = EditableTextField.newBuilder(this.year_).mergeFrom((EditableTextField.C6660a) editableTextField).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6657a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static DateOfBirth parseDelimitedFrom(InputStream inputStream) {
                return (DateOfBirth) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static DateOfBirth parseFrom(ByteBuffer byteBuffer) {
                return (DateOfBirth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<DateOfBirth> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setDay(EditableTextField editableTextField) {
                editableTextField.getClass();
                this.day_ = editableTextField;
                this.bitField0_ |= 4;
            }

            private void setMonth(EditableTextField editableTextField) {
                editableTextField.getClass();
                this.month_ = editableTextField;
                this.bitField0_ |= 2;
            }

            private void setYear(EditableTextField editableTextField) {
                editableTextField.getClass();
                this.year_ = editableTextField;
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6916i0.f2561a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new DateOfBirth();
                    case 2:
                        return new C6657a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"bitField0_", "year_", "month_", "day_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<DateOfBirth> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (DateOfBirth.class) {
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

            public EditableTextField getDay() {
                EditableTextField editableTextField = this.day_;
                return editableTextField == null ? EditableTextField.getDefaultInstance() : editableTextField;
            }

            public EditableTextField getMonth() {
                EditableTextField editableTextField = this.month_;
                return editableTextField == null ? EditableTextField.getDefaultInstance() : editableTextField;
            }

            public EditableTextField getYear() {
                EditableTextField editableTextField = this.year_;
                return editableTextField == null ? EditableTextField.getDefaultInstance() : editableTextField;
            }

            public boolean hasDay() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasMonth() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasYear() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C6657a newBuilder(DateOfBirth dateOfBirth) {
                return DEFAULT_INSTANCE.createBuilder(dateOfBirth);
            }

            public static DateOfBirth parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (DateOfBirth) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static DateOfBirth parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (DateOfBirth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static DateOfBirth parseFrom(ByteString byteString) {
                return (DateOfBirth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static DateOfBirth parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (DateOfBirth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static DateOfBirth parseFrom(byte[] bArr) {
                return (DateOfBirth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static DateOfBirth parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (DateOfBirth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static DateOfBirth parseFrom(InputStream inputStream) {
                return (DateOfBirth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static DateOfBirth parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (DateOfBirth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static DateOfBirth parseFrom(CodedInputStream codedInputStream) {
                return (DateOfBirth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static DateOfBirth parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (DateOfBirth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class DesiredAccountTypePopUp extends GeneratedMessageLite<DesiredAccountTypePopUp, C6658a> implements MessageLiteOrBuilder {
            public static final int BUTTON_FIELD_NUMBER = 2;
            private static final DesiredAccountTypePopUp DEFAULT_INSTANCE;
            private static volatile Parser<DesiredAccountTypePopUp> PARSER = null;
            public static final int PROMPT_FIELD_NUMBER = 1;
            public static final int SECONDARY_BUTTON_FIELD_NUMBER = 3;
            public static final int SUCCESS_MESSAGE_FIELD_NUMBER = 4;
            private int bitField0_;
            private Common$ButtonContent button_;
            private Common$AttributedLocalizedString prompt_;
            private Common$ButtonContent secondaryButton_;
            private Common$AttributedLocalizedString successMessage_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$Rendering$DesiredAccountTypePopUp$a */
            public static final class C6658a extends GeneratedMessageLite.Builder<DesiredAccountTypePopUp, C6658a> implements MessageLiteOrBuilder {
                public C6658a() {
                    super(DesiredAccountTypePopUp.DEFAULT_INSTANCE);
                }
            }

            static {
                DesiredAccountTypePopUp desiredAccountTypePopUp = new DesiredAccountTypePopUp();
                DEFAULT_INSTANCE = desiredAccountTypePopUp;
                GeneratedMessageLite.registerDefaultInstance(DesiredAccountTypePopUp.class, desiredAccountTypePopUp);
            }

            private DesiredAccountTypePopUp() {
            }

            private void clearButton() {
                this.button_ = null;
                this.bitField0_ &= -3;
            }

            private void clearPrompt() {
                this.prompt_ = null;
                this.bitField0_ &= -2;
            }

            private void clearSecondaryButton() {
                this.secondaryButton_ = null;
                this.bitField0_ &= -5;
            }

            private void clearSuccessMessage() {
                this.successMessage_ = null;
                this.bitField0_ &= -9;
            }

            public static DesiredAccountTypePopUp getDefaultInstance() {
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

            private void mergePrompt(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.prompt_;
                if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                    this.prompt_ = common$AttributedLocalizedString;
                } else {
                    this.prompt_ = Common$AttributedLocalizedString.newBuilder(this.prompt_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
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

            private void mergeSuccessMessage(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.successMessage_;
                if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                    this.successMessage_ = common$AttributedLocalizedString;
                } else {
                    this.successMessage_ = Common$AttributedLocalizedString.newBuilder(this.successMessage_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            public static C6658a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static DesiredAccountTypePopUp parseDelimitedFrom(InputStream inputStream) {
                return (DesiredAccountTypePopUp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static DesiredAccountTypePopUp parseFrom(ByteBuffer byteBuffer) {
                return (DesiredAccountTypePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<DesiredAccountTypePopUp> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.button_ = common$ButtonContent;
                this.bitField0_ |= 2;
            }

            private void setPrompt(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                this.prompt_ = common$AttributedLocalizedString;
                this.bitField0_ |= 1;
            }

            private void setSecondaryButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.secondaryButton_ = common$ButtonContent;
                this.bitField0_ |= 4;
            }

            private void setSuccessMessage(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                this.successMessage_ = common$AttributedLocalizedString;
                this.bitField0_ |= 8;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6916i0.f2561a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new DesiredAccountTypePopUp();
                    case 2:
                        return new C6658a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "prompt_", "button_", "secondaryButton_", "successMessage_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<DesiredAccountTypePopUp> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (DesiredAccountTypePopUp.class) {
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

            public Common$AttributedLocalizedString getPrompt() {
                Common$AttributedLocalizedString common$AttributedLocalizedString = this.prompt_;
                return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
            }

            public Common$ButtonContent getSecondaryButton() {
                Common$ButtonContent common$ButtonContent = this.secondaryButton_;
                return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public Common$AttributedLocalizedString getSuccessMessage() {
                Common$AttributedLocalizedString common$AttributedLocalizedString = this.successMessage_;
                return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
            }

            public boolean hasButton() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasPrompt() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasSecondaryButton() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasSuccessMessage() {
                return (this.bitField0_ & 8) != 0;
            }

            public static C6658a newBuilder(DesiredAccountTypePopUp desiredAccountTypePopUp) {
                return DEFAULT_INSTANCE.createBuilder(desiredAccountTypePopUp);
            }

            public static DesiredAccountTypePopUp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (DesiredAccountTypePopUp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static DesiredAccountTypePopUp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (DesiredAccountTypePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static DesiredAccountTypePopUp parseFrom(ByteString byteString) {
                return (DesiredAccountTypePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static DesiredAccountTypePopUp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (DesiredAccountTypePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static DesiredAccountTypePopUp parseFrom(byte[] bArr) {
                return (DesiredAccountTypePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static DesiredAccountTypePopUp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (DesiredAccountTypePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static DesiredAccountTypePopUp parseFrom(InputStream inputStream) {
                return (DesiredAccountTypePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static DesiredAccountTypePopUp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (DesiredAccountTypePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static DesiredAccountTypePopUp parseFrom(CodedInputStream codedInputStream) {
                return (DesiredAccountTypePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static DesiredAccountTypePopUp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (DesiredAccountTypePopUp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class EditState extends GeneratedMessageLite<EditState, C6659a> implements MessageLiteOrBuilder {
            private static final EditState DEFAULT_INSTANCE;
            private static volatile Parser<EditState> PARSER = null;
            public static final int PRIMARY_TEXT_FIELD_NUMBER = 1;
            public static final int SECONDARY_BUTTON_FIELD_NUMBER = 5;
            public static final int SECONDARY_TEXT_FIELD_NUMBER = 2;
            public static final int SELECT_NEW_BUTTON_FIELD_NUMBER = 4;
            public static final int SUBMIT_BUTTON_FIELD_NUMBER = 3;
            private int bitField0_;
            private Common$AttributedLocalizedString primaryText_;
            private Common$ButtonContent secondaryButton_;
            private Common$AttributedLocalizedString secondaryText_;
            private Common$ButtonContent selectNewButton_;
            private Common$ButtonContent submitButton_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$Rendering$EditState$a */
            public static final class C6659a extends GeneratedMessageLite.Builder<EditState, C6659a> implements MessageLiteOrBuilder {
                public C6659a() {
                    super(EditState.DEFAULT_INSTANCE);
                }
            }

            static {
                EditState editState = new EditState();
                DEFAULT_INSTANCE = editState;
                GeneratedMessageLite.registerDefaultInstance(EditState.class, editState);
            }

            private EditState() {
            }

            private void clearPrimaryText() {
                this.primaryText_ = null;
                this.bitField0_ &= -2;
            }

            private void clearSecondaryButton() {
                this.secondaryButton_ = null;
                this.bitField0_ &= -17;
            }

            private void clearSecondaryText() {
                this.secondaryText_ = null;
                this.bitField0_ &= -3;
            }

            private void clearSelectNewButton() {
                this.selectNewButton_ = null;
                this.bitField0_ &= -9;
            }

            private void clearSubmitButton() {
                this.submitButton_ = null;
                this.bitField0_ &= -5;
            }

            public static EditState getDefaultInstance() {
                return DEFAULT_INSTANCE;
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

            private void mergeSecondaryText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.secondaryText_;
                if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                    this.secondaryText_ = common$AttributedLocalizedString;
                } else {
                    this.secondaryText_ = Common$AttributedLocalizedString.newBuilder(this.secondaryText_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeSelectNewButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                Common$ButtonContent common$ButtonContent2 = this.selectNewButton_;
                if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                    this.selectNewButton_ = common$ButtonContent;
                } else {
                    this.selectNewButton_ = Common$ButtonContent.newBuilder(this.selectNewButton_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            private void mergeSubmitButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                Common$ButtonContent common$ButtonContent2 = this.submitButton_;
                if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                    this.submitButton_ = common$ButtonContent;
                } else {
                    this.submitButton_ = Common$ButtonContent.newBuilder(this.submitButton_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            public static C6659a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static EditState parseDelimitedFrom(InputStream inputStream) {
                return (EditState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static EditState parseFrom(ByteBuffer byteBuffer) {
                return (EditState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<EditState> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setPrimaryText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                this.primaryText_ = common$AttributedLocalizedString;
                this.bitField0_ |= 1;
            }

            private void setSecondaryButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.secondaryButton_ = common$ButtonContent;
                this.bitField0_ |= 16;
            }

            private void setSecondaryText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                this.secondaryText_ = common$AttributedLocalizedString;
                this.bitField0_ |= 2;
            }

            private void setSelectNewButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.selectNewButton_ = common$ButtonContent;
                this.bitField0_ |= 8;
            }

            private void setSubmitButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.submitButton_ = common$ButtonContent;
                this.bitField0_ |= 4;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6916i0.f2561a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new EditState();
                    case 2:
                        return new C6659a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "primaryText_", "secondaryText_", "submitButton_", "selectNewButton_", "secondaryButton_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<EditState> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (EditState.class) {
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

            public Common$AttributedLocalizedString getPrimaryText() {
                Common$AttributedLocalizedString common$AttributedLocalizedString = this.primaryText_;
                return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
            }

            public Common$ButtonContent getSecondaryButton() {
                Common$ButtonContent common$ButtonContent = this.secondaryButton_;
                return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public Common$AttributedLocalizedString getSecondaryText() {
                Common$AttributedLocalizedString common$AttributedLocalizedString = this.secondaryText_;
                return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
            }

            public Common$ButtonContent getSelectNewButton() {
                Common$ButtonContent common$ButtonContent = this.selectNewButton_;
                return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public Common$ButtonContent getSubmitButton() {
                Common$ButtonContent common$ButtonContent = this.submitButton_;
                return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public boolean hasPrimaryText() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasSecondaryButton() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasSecondaryText() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasSelectNewButton() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasSubmitButton() {
                return (this.bitField0_ & 4) != 0;
            }

            public static C6659a newBuilder(EditState editState) {
                return DEFAULT_INSTANCE.createBuilder(editState);
            }

            public static EditState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (EditState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static EditState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (EditState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static EditState parseFrom(ByteString byteString) {
                return (EditState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static EditState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (EditState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static EditState parseFrom(byte[] bArr) {
                return (EditState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static EditState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (EditState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static EditState parseFrom(InputStream inputStream) {
                return (EditState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static EditState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (EditState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static EditState parseFrom(CodedInputStream codedInputStream) {
                return (EditState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static EditState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (EditState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class EditableTextField extends GeneratedMessageLite<EditableTextField, C6660a> implements MessageLiteOrBuilder {
            private static final EditableTextField DEFAULT_INSTANCE;
            private static volatile Parser<EditableTextField> PARSER = null;
            public static final int TEXT_INPUT_FIELD_NUMBER = 1;
            public static final int VALUE_FIELD_NUMBER = 2;
            private int bitField0_;
            private Common$TextInput textInput_;
            private String value_ = "";

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$Rendering$EditableTextField$a */
            public static final class C6660a extends GeneratedMessageLite.Builder<EditableTextField, C6660a> implements MessageLiteOrBuilder {
                public C6660a() {
                    super(EditableTextField.DEFAULT_INSTANCE);
                }
            }

            static {
                EditableTextField editableTextField = new EditableTextField();
                DEFAULT_INSTANCE = editableTextField;
                GeneratedMessageLite.registerDefaultInstance(EditableTextField.class, editableTextField);
            }

            private EditableTextField() {
            }

            private void clearTextInput() {
                this.textInput_ = null;
                this.bitField0_ &= -2;
            }

            private void clearValue() {
                this.value_ = getDefaultInstance().getValue();
            }

            public static EditableTextField getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeTextInput(Common$TextInput common$TextInput) {
                common$TextInput.getClass();
                Common$TextInput common$TextInput2 = this.textInput_;
                if (common$TextInput2 == null || common$TextInput2 == Common$TextInput.getDefaultInstance()) {
                    this.textInput_ = common$TextInput;
                } else {
                    this.textInput_ = Common$TextInput.newBuilder(this.textInput_).mergeFrom((Common$TextInput.C6517b) common$TextInput).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C6660a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static EditableTextField parseDelimitedFrom(InputStream inputStream) {
                return (EditableTextField) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static EditableTextField parseFrom(ByteBuffer byteBuffer) {
                return (EditableTextField) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<EditableTextField> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setTextInput(Common$TextInput common$TextInput) {
                common$TextInput.getClass();
                this.textInput_ = common$TextInput;
                this.bitField0_ |= 1;
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
                switch (C6916i0.f2561a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new EditableTextField();
                    case 2:
                        return new C6660a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"bitField0_", "textInput_", "value_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<EditableTextField> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (EditableTextField.class) {
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

            public Common$TextInput getTextInput() {
                Common$TextInput common$TextInput = this.textInput_;
                return common$TextInput == null ? Common$TextInput.getDefaultInstance() : common$TextInput;
            }

            public String getValue() {
                return this.value_;
            }

            public ByteString getValueBytes() {
                return ByteString.copyFromUtf8(this.value_);
            }

            public boolean hasTextInput() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C6660a newBuilder(EditableTextField editableTextField) {
                return DEFAULT_INSTANCE.createBuilder(editableTextField);
            }

            public static EditableTextField parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (EditableTextField) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static EditableTextField parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (EditableTextField) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static EditableTextField parseFrom(ByteString byteString) {
                return (EditableTextField) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static EditableTextField parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (EditableTextField) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static EditableTextField parseFrom(byte[] bArr) {
                return (EditableTextField) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static EditableTextField parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (EditableTextField) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static EditableTextField parseFrom(InputStream inputStream) {
                return (EditableTextField) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static EditableTextField parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (EditableTextField) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static EditableTextField parseFrom(CodedInputStream codedInputStream) {
                return (EditableTextField) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static EditableTextField parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (EditableTextField) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Events extends GeneratedMessageLite<Events, C6661a> implements MessageLiteOrBuilder {
            private static final Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            public static final int ON_SELECT_ITEM_FIELD_NUMBER = 4;
            public static final int ON_SELECT_NEW_FIELD_NUMBER = 3;
            public static final int ON_SUBMIT_FIELD_NUMBER = 2;
            private static volatile Parser<Events> PARSER;
            private Internal.ProtobufList<Common$SDKEvent> onAppear_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.ProtobufList<Common$SDKEvent> onSubmit_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.ProtobufList<Common$SDKEvent> onSelectNew_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.ProtobufList<Common$SDKEvent> onSelectItem_ = GeneratedMessageLite.emptyProtobufList();

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$Rendering$Events$a */
            public static final class C6661a extends GeneratedMessageLite.Builder<Events, C6661a> implements MessageLiteOrBuilder {
                public C6661a() {
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

            private void addAllOnSelectItem(Iterable<? extends Common$SDKEvent> iterable) {
                ensureOnSelectItemIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.onSelectItem_);
            }

            private void addAllOnSelectNew(Iterable<? extends Common$SDKEvent> iterable) {
                ensureOnSelectNewIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.onSelectNew_);
            }

            private void addAllOnSubmit(Iterable<? extends Common$SDKEvent> iterable) {
                ensureOnSubmitIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.onSubmit_);
            }

            private void addOnAppear(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnAppearIsMutable();
                this.onAppear_.add(common$SDKEvent);
            }

            private void addOnSelectItem(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnSelectItemIsMutable();
                this.onSelectItem_.add(common$SDKEvent);
            }

            private void addOnSelectNew(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnSelectNewIsMutable();
                this.onSelectNew_.add(common$SDKEvent);
            }

            private void addOnSubmit(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnSubmitIsMutable();
                this.onSubmit_.add(common$SDKEvent);
            }

            private void clearOnAppear() {
                this.onAppear_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearOnSelectItem() {
                this.onSelectItem_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearOnSelectNew() {
                this.onSelectNew_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearOnSubmit() {
                this.onSubmit_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void ensureOnAppearIsMutable() {
                Internal.ProtobufList<Common$SDKEvent> protobufList = this.onAppear_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onAppear_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureOnSelectItemIsMutable() {
                Internal.ProtobufList<Common$SDKEvent> protobufList = this.onSelectItem_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onSelectItem_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureOnSelectNewIsMutable() {
                Internal.ProtobufList<Common$SDKEvent> protobufList = this.onSelectNew_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onSelectNew_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureOnSubmitIsMutable() {
                Internal.ProtobufList<Common$SDKEvent> protobufList = this.onSubmit_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onSubmit_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static Events getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6661a newBuilder() {
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

            private void removeOnSelectItem(int i) {
                ensureOnSelectItemIsMutable();
                this.onSelectItem_.remove(i);
            }

            private void removeOnSelectNew(int i) {
                ensureOnSelectNewIsMutable();
                this.onSelectNew_.remove(i);
            }

            private void removeOnSubmit(int i) {
                ensureOnSubmitIsMutable();
                this.onSubmit_.remove(i);
            }

            private void setOnAppear(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnAppearIsMutable();
                this.onAppear_.set(i, common$SDKEvent);
            }

            private void setOnSelectItem(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnSelectItemIsMutable();
                this.onSelectItem_.set(i, common$SDKEvent);
            }

            private void setOnSelectNew(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnSelectNewIsMutable();
                this.onSelectNew_.set(i, common$SDKEvent);
            }

            private void setOnSubmit(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnSubmitIsMutable();
                this.onSubmit_.set(i, common$SDKEvent);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6916i0.f2561a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Events();
                    case 2:
                        return new C6661a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"onAppear_", Common$SDKEvent.class, "onSubmit_", Common$SDKEvent.class, "onSelectNew_", Common$SDKEvent.class, "onSelectItem_", Common$SDKEvent.class});
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

            public Common$SDKEvent getOnSelectItem(int i) {
                return this.onSelectItem_.get(i);
            }

            public int getOnSelectItemCount() {
                return this.onSelectItem_.size();
            }

            public List<Common$SDKEvent> getOnSelectItemList() {
                return this.onSelectItem_;
            }

            public InterfaceC6691M getOnSelectItemOrBuilder(int i) {
                return this.onSelectItem_.get(i);
            }

            public List<? extends InterfaceC6691M> getOnSelectItemOrBuilderList() {
                return this.onSelectItem_;
            }

            public Common$SDKEvent getOnSelectNew(int i) {
                return this.onSelectNew_.get(i);
            }

            public int getOnSelectNewCount() {
                return this.onSelectNew_.size();
            }

            public List<Common$SDKEvent> getOnSelectNewList() {
                return this.onSelectNew_;
            }

            public InterfaceC6691M getOnSelectNewOrBuilder(int i) {
                return this.onSelectNew_.get(i);
            }

            public List<? extends InterfaceC6691M> getOnSelectNewOrBuilderList() {
                return this.onSelectNew_;
            }

            public Common$SDKEvent getOnSubmit(int i) {
                return this.onSubmit_.get(i);
            }

            public int getOnSubmitCount() {
                return this.onSubmit_.size();
            }

            public List<Common$SDKEvent> getOnSubmitList() {
                return this.onSubmit_;
            }

            public InterfaceC6691M getOnSubmitOrBuilder(int i) {
                return this.onSubmit_.get(i);
            }

            public List<? extends InterfaceC6691M> getOnSubmitOrBuilderList() {
                return this.onSubmit_;
            }

            public static C6661a newBuilder(Events events) {
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

            private void addOnSelectItem(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnSelectItemIsMutable();
                this.onSelectItem_.add(i, common$SDKEvent);
            }

            private void addOnSelectNew(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnSelectNewIsMutable();
                this.onSelectNew_.add(i, common$SDKEvent);
            }

            private void addOnSubmit(int i, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnSubmitIsMutable();
                this.onSubmit_.add(i, common$SDKEvent);
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

        public static final class Field extends GeneratedMessageLite<Field, C6664a> implements MessageLiteOrBuilder {
            private static final Field DEFAULT_INSTANCE;
            public static final int EDIT_STATE_FIELD_NUMBER = 2;
            public static final int LABEL_FIELD_NUMBER = 1;
            private static volatile Parser<Field> PARSER = null;
            public static final int SELECT_STATE_FIELD_NUMBER = 4;
            public static final int VALUE_FIELD_NUMBER = 3;
            private int bitField0_;
            private EditState editState_;
            private Common$AttributedLocalizedString label_;
            private SelectState selectState_;
            private Value value_;

            public static final class Value extends GeneratedMessageLite<Value, C6662a> implements MessageLiteOrBuilder {
                public static final int ADDRESSES_FIELD_NUMBER = 7;
                public static final int CONNECTED_ITEMS_FIELD_NUMBER = 6;
                public static final int DATE_OF_BIRTH_FIELD_NUMBER = 5;
                private static final Value DEFAULT_INSTANCE;
                public static final int EMAIL_FIELD_NUMBER = 3;
                public static final int NAME_FIELD_NUMBER = 2;
                private static volatile Parser<Value> PARSER = null;
                public static final int SSN_FIELD_NUMBER = 4;
                private int valueCase_ = 0;
                private Object value_;

                /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$Rendering$Field$Value$a */
                public static final class C6662a extends GeneratedMessageLite.Builder<Value, C6662a> implements MessageLiteOrBuilder {
                    public C6662a() {
                        super(Value.DEFAULT_INSTANCE);
                    }
                }

                /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$Rendering$Field$Value$b */
                public enum EnumC6663b {
                    NAME(2),
                    EMAIL(3),
                    SSN(4),
                    DATE_OF_BIRTH(5),
                    CONNECTED_ITEMS(6),
                    ADDRESSES(7),
                    VALUE_NOT_SET(0);


                    /* renamed from: a */
                    public final int f2389a;

                    EnumC6663b(int i) {
                        this.f2389a = i;
                    }

                    public static EnumC6663b forNumber(int i) {
                        if (i == 0) {
                            return VALUE_NOT_SET;
                        }
                        switch (i) {
                            case 2:
                                return NAME;
                            case 3:
                                return EMAIL;
                            case 4:
                                return SSN;
                            case 5:
                                return DATE_OF_BIRTH;
                            case 6:
                                return CONNECTED_ITEMS;
                            case 7:
                                return ADDRESSES;
                            default:
                                return null;
                        }
                    }

                    public int getNumber() {
                        return this.f2389a;
                    }

                    @Deprecated
                    public static EnumC6663b valueOf(int i) {
                        return forNumber(i);
                    }
                }

                static {
                    Value value = new Value();
                    DEFAULT_INSTANCE = value;
                    GeneratedMessageLite.registerDefaultInstance(Value.class, value);
                }

                private Value() {
                }

                private void clearAddresses() {
                    if (this.valueCase_ == 7) {
                        this.valueCase_ = 0;
                        this.value_ = null;
                    }
                }

                private void clearConnectedItems() {
                    if (this.valueCase_ == 6) {
                        this.valueCase_ = 0;
                        this.value_ = null;
                    }
                }

                private void clearDateOfBirth() {
                    if (this.valueCase_ == 5) {
                        this.valueCase_ = 0;
                        this.value_ = null;
                    }
                }

                private void clearEmail() {
                    if (this.valueCase_ == 3) {
                        this.valueCase_ = 0;
                        this.value_ = null;
                    }
                }

                private void clearName() {
                    if (this.valueCase_ == 2) {
                        this.valueCase_ = 0;
                        this.value_ = null;
                    }
                }

                private void clearSsn() {
                    if (this.valueCase_ == 4) {
                        this.valueCase_ = 0;
                        this.value_ = null;
                    }
                }

                private void clearValue() {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }

                public static Value getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                private void mergeAddresses(Addresses addresses) {
                    addresses.getClass();
                    if (this.valueCase_ != 7 || this.value_ == Addresses.getDefaultInstance()) {
                        this.value_ = addresses;
                    } else {
                        this.value_ = Addresses.newBuilder((Addresses) this.value_).mergeFrom((Addresses.C6651a) addresses).buildPartial();
                    }
                    this.valueCase_ = 7;
                }

                private void mergeConnectedItems(ConnectedItems connectedItems) {
                    connectedItems.getClass();
                    if (this.valueCase_ != 6 || this.value_ == ConnectedItems.getDefaultInstance()) {
                        this.value_ = connectedItems;
                    } else {
                        this.value_ = ConnectedItems.newBuilder((ConnectedItems) this.value_).mergeFrom((ConnectedItems.C6656a) connectedItems).buildPartial();
                    }
                    this.valueCase_ = 6;
                }

                private void mergeDateOfBirth(DateOfBirth dateOfBirth) {
                    dateOfBirth.getClass();
                    if (this.valueCase_ != 5 || this.value_ == DateOfBirth.getDefaultInstance()) {
                        this.value_ = dateOfBirth;
                    } else {
                        this.value_ = DateOfBirth.newBuilder((DateOfBirth) this.value_).mergeFrom((DateOfBirth.C6657a) dateOfBirth).buildPartial();
                    }
                    this.valueCase_ = 5;
                }

                private void mergeEmail(EditableTextField editableTextField) {
                    editableTextField.getClass();
                    if (this.valueCase_ != 3 || this.value_ == EditableTextField.getDefaultInstance()) {
                        this.value_ = editableTextField;
                    } else {
                        this.value_ = EditableTextField.newBuilder((EditableTextField) this.value_).mergeFrom((EditableTextField.C6660a) editableTextField).buildPartial();
                    }
                    this.valueCase_ = 3;
                }

                private void mergeName(Name name) {
                    name.getClass();
                    if (this.valueCase_ != 2 || this.value_ == Name.getDefaultInstance()) {
                        this.value_ = name;
                    } else {
                        this.value_ = Name.newBuilder((Name) this.value_).mergeFrom((Name.C6666a) name).buildPartial();
                    }
                    this.valueCase_ = 2;
                }

                private void mergeSsn(EditableTextField editableTextField) {
                    editableTextField.getClass();
                    if (this.valueCase_ != 4 || this.value_ == EditableTextField.getDefaultInstance()) {
                        this.value_ = editableTextField;
                    } else {
                        this.value_ = EditableTextField.newBuilder((EditableTextField) this.value_).mergeFrom((EditableTextField.C6660a) editableTextField).buildPartial();
                    }
                    this.valueCase_ = 4;
                }

                public static C6662a newBuilder() {
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

                private void setAddresses(Addresses addresses) {
                    addresses.getClass();
                    this.value_ = addresses;
                    this.valueCase_ = 7;
                }

                private void setConnectedItems(ConnectedItems connectedItems) {
                    connectedItems.getClass();
                    this.value_ = connectedItems;
                    this.valueCase_ = 6;
                }

                private void setDateOfBirth(DateOfBirth dateOfBirth) {
                    dateOfBirth.getClass();
                    this.value_ = dateOfBirth;
                    this.valueCase_ = 5;
                }

                private void setEmail(EditableTextField editableTextField) {
                    editableTextField.getClass();
                    this.value_ = editableTextField;
                    this.valueCase_ = 3;
                }

                private void setName(Name name) {
                    name.getClass();
                    this.value_ = name;
                    this.valueCase_ = 2;
                }

                private void setSsn(EditableTextField editableTextField) {
                    editableTextField.getClass();
                    this.value_ = editableTextField;
                    this.valueCase_ = 4;
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    Parser defaultInstanceBasedParser;
                    switch (C6916i0.f2561a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new Value();
                        case 2:
                            return new C6662a();
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0002\u0007\u0006\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"value_", "valueCase_", Name.class, EditableTextField.class, EditableTextField.class, DateOfBirth.class, ConnectedItems.class, Addresses.class});
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

                public Addresses getAddresses() {
                    return this.valueCase_ == 7 ? (Addresses) this.value_ : Addresses.getDefaultInstance();
                }

                public ConnectedItems getConnectedItems() {
                    return this.valueCase_ == 6 ? (ConnectedItems) this.value_ : ConnectedItems.getDefaultInstance();
                }

                public DateOfBirth getDateOfBirth() {
                    return this.valueCase_ == 5 ? (DateOfBirth) this.value_ : DateOfBirth.getDefaultInstance();
                }

                public EditableTextField getEmail() {
                    return this.valueCase_ == 3 ? (EditableTextField) this.value_ : EditableTextField.getDefaultInstance();
                }

                public Name getName() {
                    return this.valueCase_ == 2 ? (Name) this.value_ : Name.getDefaultInstance();
                }

                public EditableTextField getSsn() {
                    return this.valueCase_ == 4 ? (EditableTextField) this.value_ : EditableTextField.getDefaultInstance();
                }

                public EnumC6663b getValueCase() {
                    return EnumC6663b.forNumber(this.valueCase_);
                }

                public boolean hasAddresses() {
                    return this.valueCase_ == 7;
                }

                public boolean hasConnectedItems() {
                    return this.valueCase_ == 6;
                }

                public boolean hasDateOfBirth() {
                    return this.valueCase_ == 5;
                }

                public boolean hasEmail() {
                    return this.valueCase_ == 3;
                }

                public boolean hasName() {
                    return this.valueCase_ == 2;
                }

                public boolean hasSsn() {
                    return this.valueCase_ == 4;
                }

                public static C6662a newBuilder(Value value) {
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

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$Rendering$Field$a */
            public static final class C6664a extends GeneratedMessageLite.Builder<Field, C6664a> implements MessageLiteOrBuilder {
                public C6664a() {
                    super(Field.DEFAULT_INSTANCE);
                }
            }

            static {
                Field field = new Field();
                DEFAULT_INSTANCE = field;
                GeneratedMessageLite.registerDefaultInstance(Field.class, field);
            }

            private Field() {
            }

            private void clearEditState() {
                this.editState_ = null;
                this.bitField0_ &= -3;
            }

            private void clearLabel() {
                this.label_ = null;
                this.bitField0_ &= -2;
            }

            private void clearSelectState() {
                this.selectState_ = null;
                this.bitField0_ &= -9;
            }

            private void clearValue() {
                this.value_ = null;
                this.bitField0_ &= -5;
            }

            public static Field getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeEditState(EditState editState) {
                editState.getClass();
                EditState editState2 = this.editState_;
                if (editState2 == null || editState2 == EditState.getDefaultInstance()) {
                    this.editState_ = editState;
                } else {
                    this.editState_ = EditState.newBuilder(this.editState_).mergeFrom((EditState.C6659a) editState).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeLabel(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.label_;
                if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                    this.label_ = common$AttributedLocalizedString;
                } else {
                    this.label_ = Common$AttributedLocalizedString.newBuilder(this.label_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            private void mergeSelectState(SelectState selectState) {
                selectState.getClass();
                SelectState selectState2 = this.selectState_;
                if (selectState2 == null || selectState2 == SelectState.getDefaultInstance()) {
                    this.selectState_ = selectState;
                } else {
                    this.selectState_ = SelectState.newBuilder(this.selectState_).mergeFrom((SelectState.C6667a) selectState).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            private void mergeValue(Value value) {
                value.getClass();
                Value value2 = this.value_;
                if (value2 == null || value2 == Value.getDefaultInstance()) {
                    this.value_ = value;
                } else {
                    this.value_ = Value.newBuilder(this.value_).mergeFrom((Value.C6662a) value).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            public static C6664a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Field parseDelimitedFrom(InputStream inputStream) {
                return (Field) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Field parseFrom(ByteBuffer byteBuffer) {
                return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Field> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setEditState(EditState editState) {
                editState.getClass();
                this.editState_ = editState;
                this.bitField0_ |= 2;
            }

            private void setLabel(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                this.label_ = common$AttributedLocalizedString;
                this.bitField0_ |= 1;
            }

            private void setSelectState(SelectState selectState) {
                selectState.getClass();
                this.selectState_ = selectState;
                this.bitField0_ |= 8;
            }

            private void setValue(Value value) {
                value.getClass();
                this.value_ = value;
                this.bitField0_ |= 4;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6916i0.f2561a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Field();
                    case 2:
                        return new C6664a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "label_", "editState_", "value_", "selectState_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Field> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Field.class) {
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

            public EditState getEditState() {
                EditState editState = this.editState_;
                return editState == null ? EditState.getDefaultInstance() : editState;
            }

            public Common$AttributedLocalizedString getLabel() {
                Common$AttributedLocalizedString common$AttributedLocalizedString = this.label_;
                return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
            }

            public SelectState getSelectState() {
                SelectState selectState = this.selectState_;
                return selectState == null ? SelectState.getDefaultInstance() : selectState;
            }

            public Value getValue() {
                Value value = this.value_;
                return value == null ? Value.getDefaultInstance() : value;
            }

            public boolean hasEditState() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasLabel() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasSelectState() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasValue() {
                return (this.bitField0_ & 4) != 0;
            }

            public static C6664a newBuilder(Field field) {
                return DEFAULT_INSTANCE.createBuilder(field);
            }

            public static Field parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Field) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Field parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Field parseFrom(ByteString byteString) {
                return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Field parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Field parseFrom(byte[] bArr) {
                return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Field parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Field parseFrom(InputStream inputStream) {
                return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Field parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Field parseFrom(CodedInputStream codedInputStream) {
                return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Field parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Field) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Fields extends GeneratedMessageLite<Fields, C6665a> implements MessageLiteOrBuilder {
            public static final int ADDRESSES_FIELD_NUMBER = 7;
            public static final int CONNECTED_ITEMS_FIELD_NUMBER = 6;
            public static final int DATE_OF_BIRTH_FIELD_NUMBER = 4;
            private static final Fields DEFAULT_INSTANCE;
            public static final int EMAIL_FIELD_NUMBER = 3;
            public static final int NAME_FIELD_NUMBER = 1;
            private static volatile Parser<Fields> PARSER = null;
            public static final int SSN_FIELD_NUMBER = 5;
            public static final int SSN_LAST4_ONLY_FIELD_NUMBER = 8;
            private Field addresses_;
            private int bitField0_;
            private Field connectedItems_;
            private Field dateOfBirth_;
            private Field email_;
            private Field name_;
            private boolean ssnLast4Only_;
            private Field ssn_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$Rendering$Fields$a */
            public static final class C6665a extends GeneratedMessageLite.Builder<Fields, C6665a> implements MessageLiteOrBuilder {
                public C6665a() {
                    super(Fields.DEFAULT_INSTANCE);
                }
            }

            static {
                Fields fields = new Fields();
                DEFAULT_INSTANCE = fields;
                GeneratedMessageLite.registerDefaultInstance(Fields.class, fields);
            }

            private Fields() {
            }

            private void clearAddresses() {
                this.addresses_ = null;
                this.bitField0_ &= -33;
            }

            private void clearConnectedItems() {
                this.connectedItems_ = null;
                this.bitField0_ &= -17;
            }

            private void clearDateOfBirth() {
                this.dateOfBirth_ = null;
                this.bitField0_ &= -5;
            }

            private void clearEmail() {
                this.email_ = null;
                this.bitField0_ &= -3;
            }

            private void clearName() {
                this.name_ = null;
                this.bitField0_ &= -2;
            }

            private void clearSsn() {
                this.ssn_ = null;
                this.bitField0_ &= -9;
            }

            private void clearSsnLast4Only() {
                this.ssnLast4Only_ = false;
            }

            public static Fields getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeAddresses(Field field) {
                field.getClass();
                Field field2 = this.addresses_;
                if (field2 == null || field2 == Field.getDefaultInstance()) {
                    this.addresses_ = field;
                } else {
                    this.addresses_ = Field.newBuilder(this.addresses_).mergeFrom((Field.C6664a) field).buildPartial();
                }
                this.bitField0_ |= 32;
            }

            private void mergeConnectedItems(Field field) {
                field.getClass();
                Field field2 = this.connectedItems_;
                if (field2 == null || field2 == Field.getDefaultInstance()) {
                    this.connectedItems_ = field;
                } else {
                    this.connectedItems_ = Field.newBuilder(this.connectedItems_).mergeFrom((Field.C6664a) field).buildPartial();
                }
                this.bitField0_ |= 16;
            }

            private void mergeDateOfBirth(Field field) {
                field.getClass();
                Field field2 = this.dateOfBirth_;
                if (field2 == null || field2 == Field.getDefaultInstance()) {
                    this.dateOfBirth_ = field;
                } else {
                    this.dateOfBirth_ = Field.newBuilder(this.dateOfBirth_).mergeFrom((Field.C6664a) field).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergeEmail(Field field) {
                field.getClass();
                Field field2 = this.email_;
                if (field2 == null || field2 == Field.getDefaultInstance()) {
                    this.email_ = field;
                } else {
                    this.email_ = Field.newBuilder(this.email_).mergeFrom((Field.C6664a) field).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeName(Field field) {
                field.getClass();
                Field field2 = this.name_;
                if (field2 == null || field2 == Field.getDefaultInstance()) {
                    this.name_ = field;
                } else {
                    this.name_ = Field.newBuilder(this.name_).mergeFrom((Field.C6664a) field).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            private void mergeSsn(Field field) {
                field.getClass();
                Field field2 = this.ssn_;
                if (field2 == null || field2 == Field.getDefaultInstance()) {
                    this.ssn_ = field;
                } else {
                    this.ssn_ = Field.newBuilder(this.ssn_).mergeFrom((Field.C6664a) field).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            public static C6665a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Fields parseDelimitedFrom(InputStream inputStream) {
                return (Fields) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Fields parseFrom(ByteBuffer byteBuffer) {
                return (Fields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Fields> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setAddresses(Field field) {
                field.getClass();
                this.addresses_ = field;
                this.bitField0_ |= 32;
            }

            private void setConnectedItems(Field field) {
                field.getClass();
                this.connectedItems_ = field;
                this.bitField0_ |= 16;
            }

            private void setDateOfBirth(Field field) {
                field.getClass();
                this.dateOfBirth_ = field;
                this.bitField0_ |= 4;
            }

            private void setEmail(Field field) {
                field.getClass();
                this.email_ = field;
                this.bitField0_ |= 2;
            }

            private void setName(Field field) {
                field.getClass();
                this.name_ = field;
                this.bitField0_ |= 1;
            }

            private void setSsn(Field field) {
                field.getClass();
                this.ssn_ = field;
                this.bitField0_ |= 8;
            }

            private void setSsnLast4Only(boolean z) {
                this.ssnLast4Only_ = z;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6916i0.f2561a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Fields();
                    case 2:
                        return new C6665a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\b\u0007", new Object[]{"bitField0_", "name_", "email_", "dateOfBirth_", "ssn_", "connectedItems_", "addresses_", "ssnLast4Only_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Fields> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Fields.class) {
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

            public Field getAddresses() {
                Field field = this.addresses_;
                return field == null ? Field.getDefaultInstance() : field;
            }

            public Field getConnectedItems() {
                Field field = this.connectedItems_;
                return field == null ? Field.getDefaultInstance() : field;
            }

            public Field getDateOfBirth() {
                Field field = this.dateOfBirth_;
                return field == null ? Field.getDefaultInstance() : field;
            }

            public Field getEmail() {
                Field field = this.email_;
                return field == null ? Field.getDefaultInstance() : field;
            }

            public Field getName() {
                Field field = this.name_;
                return field == null ? Field.getDefaultInstance() : field;
            }

            public Field getSsn() {
                Field field = this.ssn_;
                return field == null ? Field.getDefaultInstance() : field;
            }

            public boolean getSsnLast4Only() {
                return this.ssnLast4Only_;
            }

            public boolean hasAddresses() {
                return (this.bitField0_ & 32) != 0;
            }

            public boolean hasConnectedItems() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasDateOfBirth() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasEmail() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasName() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasSsn() {
                return (this.bitField0_ & 8) != 0;
            }

            public static C6665a newBuilder(Fields fields) {
                return DEFAULT_INSTANCE.createBuilder(fields);
            }

            public static Fields parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Fields) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Fields parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Fields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Fields parseFrom(ByteString byteString) {
                return (Fields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Fields parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Fields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Fields parseFrom(byte[] bArr) {
                return (Fields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Fields parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Fields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Fields parseFrom(InputStream inputStream) {
                return (Fields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Fields parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Fields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Fields parseFrom(CodedInputStream codedInputStream) {
                return (Fields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Fields parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Fields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Name extends GeneratedMessageLite<Name, C6666a> implements MessageLiteOrBuilder {
            private static final Name DEFAULT_INSTANCE;
            public static final int FIRST_NAME_FIELD_NUMBER = 1;
            public static final int LAST_NAME_FIELD_NUMBER = 2;
            private static volatile Parser<Name> PARSER;
            private int bitField0_;
            private EditableTextField firstName_;
            private EditableTextField lastName_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$Rendering$Name$a */
            public static final class C6666a extends GeneratedMessageLite.Builder<Name, C6666a> implements MessageLiteOrBuilder {
                public C6666a() {
                    super(Name.DEFAULT_INSTANCE);
                }
            }

            static {
                Name name = new Name();
                DEFAULT_INSTANCE = name;
                GeneratedMessageLite.registerDefaultInstance(Name.class, name);
            }

            private Name() {
            }

            private void clearFirstName() {
                this.firstName_ = null;
                this.bitField0_ &= -2;
            }

            private void clearLastName() {
                this.lastName_ = null;
                this.bitField0_ &= -3;
            }

            public static Name getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeFirstName(EditableTextField editableTextField) {
                editableTextField.getClass();
                EditableTextField editableTextField2 = this.firstName_;
                if (editableTextField2 == null || editableTextField2 == EditableTextField.getDefaultInstance()) {
                    this.firstName_ = editableTextField;
                } else {
                    this.firstName_ = EditableTextField.newBuilder(this.firstName_).mergeFrom((EditableTextField.C6660a) editableTextField).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            private void mergeLastName(EditableTextField editableTextField) {
                editableTextField.getClass();
                EditableTextField editableTextField2 = this.lastName_;
                if (editableTextField2 == null || editableTextField2 == EditableTextField.getDefaultInstance()) {
                    this.lastName_ = editableTextField;
                } else {
                    this.lastName_ = EditableTextField.newBuilder(this.lastName_).mergeFrom((EditableTextField.C6660a) editableTextField).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            public static C6666a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Name parseDelimitedFrom(InputStream inputStream) {
                return (Name) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Name parseFrom(ByteBuffer byteBuffer) {
                return (Name) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Name> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setFirstName(EditableTextField editableTextField) {
                editableTextField.getClass();
                this.firstName_ = editableTextField;
                this.bitField0_ |= 1;
            }

            private void setLastName(EditableTextField editableTextField) {
                editableTextField.getClass();
                this.lastName_ = editableTextField;
                this.bitField0_ |= 2;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6916i0.f2561a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Name();
                    case 2:
                        return new C6666a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "firstName_", "lastName_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Name> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Name.class) {
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

            public EditableTextField getFirstName() {
                EditableTextField editableTextField = this.firstName_;
                return editableTextField == null ? EditableTextField.getDefaultInstance() : editableTextField;
            }

            public EditableTextField getLastName() {
                EditableTextField editableTextField = this.lastName_;
                return editableTextField == null ? EditableTextField.getDefaultInstance() : editableTextField;
            }

            public boolean hasFirstName() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasLastName() {
                return (this.bitField0_ & 2) != 0;
            }

            public static C6666a newBuilder(Name name) {
                return DEFAULT_INSTANCE.createBuilder(name);
            }

            public static Name parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Name) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Name parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Name) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Name parseFrom(ByteString byteString) {
                return (Name) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Name parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Name) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Name parseFrom(byte[] bArr) {
                return (Name) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Name parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Name) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Name parseFrom(InputStream inputStream) {
                return (Name) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Name parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Name) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Name parseFrom(CodedInputStream codedInputStream) {
                return (Name) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Name parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Name) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SelectState extends GeneratedMessageLite<SelectState, C6667a> implements MessageLiteOrBuilder {
            private static final SelectState DEFAULT_INSTANCE;
            private static volatile Parser<SelectState> PARSER = null;
            public static final int PRIMARY_TEXT_FIELD_NUMBER = 1;
            public static final int SECONDARY_BUTTON_FIELD_NUMBER = 4;
            public static final int SECONDARY_TEXT_FIELD_NUMBER = 2;
            public static final int SUBMIT_BUTTON_FIELD_NUMBER = 3;
            private int bitField0_;
            private Common$AttributedLocalizedString primaryText_;
            private Common$ButtonContent secondaryButton_;
            private Common$AttributedLocalizedString secondaryText_;
            private Common$ButtonContent submitButton_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$Rendering$SelectState$a */
            public static final class C6667a extends GeneratedMessageLite.Builder<SelectState, C6667a> implements MessageLiteOrBuilder {
                public C6667a() {
                    super(SelectState.DEFAULT_INSTANCE);
                }
            }

            static {
                SelectState selectState = new SelectState();
                DEFAULT_INSTANCE = selectState;
                GeneratedMessageLite.registerDefaultInstance(SelectState.class, selectState);
            }

            private SelectState() {
            }

            private void clearPrimaryText() {
                this.primaryText_ = null;
                this.bitField0_ &= -2;
            }

            private void clearSecondaryButton() {
                this.secondaryButton_ = null;
                this.bitField0_ &= -9;
            }

            private void clearSecondaryText() {
                this.secondaryText_ = null;
                this.bitField0_ &= -3;
            }

            private void clearSubmitButton() {
                this.submitButton_ = null;
                this.bitField0_ &= -5;
            }

            public static SelectState getDefaultInstance() {
                return DEFAULT_INSTANCE;
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

            private void mergeSecondaryText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.secondaryText_;
                if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                    this.secondaryText_ = common$AttributedLocalizedString;
                } else {
                    this.secondaryText_ = Common$AttributedLocalizedString.newBuilder(this.secondaryText_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeSubmitButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                Common$ButtonContent common$ButtonContent2 = this.submitButton_;
                if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                    this.submitButton_ = common$ButtonContent;
                } else {
                    this.submitButton_ = Common$ButtonContent.newBuilder(this.submitButton_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            public static C6667a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static SelectState parseDelimitedFrom(InputStream inputStream) {
                return (SelectState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SelectState parseFrom(ByteBuffer byteBuffer) {
                return (SelectState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<SelectState> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setPrimaryText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                this.primaryText_ = common$AttributedLocalizedString;
                this.bitField0_ |= 1;
            }

            private void setSecondaryButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.secondaryButton_ = common$ButtonContent;
                this.bitField0_ |= 8;
            }

            private void setSecondaryText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
                common$AttributedLocalizedString.getClass();
                this.secondaryText_ = common$AttributedLocalizedString;
                this.bitField0_ |= 2;
            }

            private void setSubmitButton(Common$ButtonContent common$ButtonContent) {
                common$ButtonContent.getClass();
                this.submitButton_ = common$ButtonContent;
                this.bitField0_ |= 4;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6916i0.f2561a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SelectState();
                    case 2:
                        return new C6667a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "primaryText_", "secondaryText_", "submitButton_", "secondaryButton_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<SelectState> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (SelectState.class) {
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

            public Common$AttributedLocalizedString getPrimaryText() {
                Common$AttributedLocalizedString common$AttributedLocalizedString = this.primaryText_;
                return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
            }

            public Common$ButtonContent getSecondaryButton() {
                Common$ButtonContent common$ButtonContent = this.secondaryButton_;
                return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public Common$AttributedLocalizedString getSecondaryText() {
                Common$AttributedLocalizedString common$AttributedLocalizedString = this.secondaryText_;
                return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
            }

            public Common$ButtonContent getSubmitButton() {
                Common$ButtonContent common$ButtonContent = this.submitButton_;
                return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
            }

            public boolean hasPrimaryText() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasSecondaryButton() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasSecondaryText() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasSubmitButton() {
                return (this.bitField0_ & 4) != 0;
            }

            public static C6667a newBuilder(SelectState selectState) {
                return DEFAULT_INSTANCE.createBuilder(selectState);
            }

            public static SelectState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SelectState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SelectState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (SelectState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static SelectState parseFrom(ByteString byteString) {
                return (SelectState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static SelectState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (SelectState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static SelectState parseFrom(byte[] bArr) {
                return (SelectState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static SelectState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (SelectState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static SelectState parseFrom(InputStream inputStream) {
                return (SelectState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SelectState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SelectState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SelectState parseFrom(CodedInputStream codedInputStream) {
                return (SelectState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static SelectState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SelectState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$Rendering$a */
        public interface InterfaceC6668a extends MessageLiteOrBuilder {
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$Rendering$b */
        public static final class C6669b extends GeneratedMessageLite.Builder<Rendering, C6669b> implements MessageLiteOrBuilder {
            public C6669b() {
                super(Rendering.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$Rendering$c */
        public interface InterfaceC6670c extends MessageLiteOrBuilder {
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$Rendering$d */
        public interface InterfaceC6671d extends MessageLiteOrBuilder {
        }

        static {
            Rendering rendering = new Rendering();
            DEFAULT_INSTANCE = rendering;
            GeneratedMessageLite.registerDefaultInstance(Rendering.class, rendering);
        }

        private Rendering() {
        }

        private void clearAccountSelectionOptions() {
            this.accountSelectionOptions_ = null;
            this.bitField0_ &= -65;
        }

        private void clearAutoSubmit() {
            this.autoSubmit_ = null;
            this.bitField0_ &= -33;
        }

        private void clearDisclaimerText() {
            this.disclaimerText_ = null;
            this.bitField0_ &= -5;
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -129;
        }

        private void clearFields() {
            this.fields_ = null;
            this.bitField0_ &= -3;
        }

        private void clearLoadingIndicator() {
            this.loadingIndicator_ = null;
            this.bitField0_ &= -17;
        }

        private void clearPrimaryButton() {
            this.primaryButton_ = null;
            this.bitField0_ &= -9;
        }

        private void clearPrimaryText() {
            this.primaryText_ = null;
            this.bitField0_ &= -2;
        }

        public static Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeAccountSelectionOptions(AccountSelectionOptions accountSelectionOptions) {
            accountSelectionOptions.getClass();
            AccountSelectionOptions accountSelectionOptions2 = this.accountSelectionOptions_;
            if (accountSelectionOptions2 == null || accountSelectionOptions2 == AccountSelectionOptions.getDefaultInstance()) {
                this.accountSelectionOptions_ = accountSelectionOptions;
            } else {
                this.accountSelectionOptions_ = AccountSelectionOptions.newBuilder(this.accountSelectionOptions_).mergeFrom((AccountSelectionOptions.C6649a) accountSelectionOptions).buildPartial();
            }
            this.bitField0_ |= 64;
        }

        private void mergeAutoSubmit(AutoSubmit autoSubmit) {
            autoSubmit.getClass();
            AutoSubmit autoSubmit2 = this.autoSubmit_;
            if (autoSubmit2 == null || autoSubmit2 == AutoSubmit.getDefaultInstance()) {
                this.autoSubmit_ = autoSubmit;
            } else {
                this.autoSubmit_ = AutoSubmit.newBuilder(this.autoSubmit_).mergeFrom((AutoSubmit.C6652a) autoSubmit).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        private void mergeDisclaimerText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.disclaimerText_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
                this.disclaimerText_ = common$AttributedLocalizedString;
            } else {
                this.disclaimerText_ = Common$AttributedLocalizedString.newBuilder(this.disclaimerText_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        private void mergeEvents(Events events) {
            events.getClass();
            Events events2 = this.events_;
            if (events2 == null || events2 == Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = Events.newBuilder(this.events_).mergeFrom((Events.C6661a) events).buildPartial();
            }
            this.bitField0_ |= 128;
        }

        private void mergeFields(Fields fields) {
            fields.getClass();
            Fields fields2 = this.fields_;
            if (fields2 == null || fields2 == Fields.getDefaultInstance()) {
                this.fields_ = fields;
            } else {
                this.fields_ = Fields.newBuilder(this.fields_).mergeFrom((Fields.C6665a) fields).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergeLoadingIndicator(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            common$RenderedAssetAppearance.getClass();
            Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.loadingIndicator_;
            if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == Common$RenderedAssetAppearance.getDefaultInstance()) {
                this.loadingIndicator_ = common$RenderedAssetAppearance;
            } else {
                this.loadingIndicator_ = Common$RenderedAssetAppearance.newBuilder(this.loadingIndicator_).mergeFrom((Common$RenderedAssetAppearance.C6475a) common$RenderedAssetAppearance).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        private void mergePrimaryButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            Common$ButtonContent common$ButtonContent2 = this.primaryButton_;
            if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                this.primaryButton_ = common$ButtonContent;
            } else {
                this.primaryButton_ = Common$ButtonContent.newBuilder(this.primaryButton_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
            }
            this.bitField0_ |= 8;
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

        public static C6669b newBuilder() {
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

        private void setAccountSelectionOptions(AccountSelectionOptions accountSelectionOptions) {
            accountSelectionOptions.getClass();
            this.accountSelectionOptions_ = accountSelectionOptions;
            this.bitField0_ |= 64;
        }

        private void setAutoSubmit(AutoSubmit autoSubmit) {
            autoSubmit.getClass();
            this.autoSubmit_ = autoSubmit;
            this.bitField0_ |= 32;
        }

        private void setDisclaimerText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.disclaimerText_ = common$AttributedLocalizedString;
            this.bitField0_ |= 4;
        }

        private void setEvents(Events events) {
            events.getClass();
            this.events_ = events;
            this.bitField0_ |= 128;
        }

        private void setFields(Fields fields) {
            fields.getClass();
            this.fields_ = fields;
            this.bitField0_ |= 2;
        }

        private void setLoadingIndicator(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            common$RenderedAssetAppearance.getClass();
            this.loadingIndicator_ = common$RenderedAssetAppearance;
            this.bitField0_ |= 16;
        }

        private void setPrimaryButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.primaryButton_ = common$ButtonContent;
            this.bitField0_ |= 8;
        }

        private void setPrimaryText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.primaryText_ = common$AttributedLocalizedString;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6916i0.f2561a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Rendering();
                case 2:
                    return new C6669b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0007\u0006ဉ\u0004\u0007ဉ\u0005\bဉ\u0006", new Object[]{"bitField0_", "primaryText_", "fields_", "disclaimerText_", "primaryButton_", "events_", "loadingIndicator_", "autoSubmit_", "accountSelectionOptions_"});
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

        public AccountSelectionOptions getAccountSelectionOptions() {
            AccountSelectionOptions accountSelectionOptions = this.accountSelectionOptions_;
            return accountSelectionOptions == null ? AccountSelectionOptions.getDefaultInstance() : accountSelectionOptions;
        }

        public AutoSubmit getAutoSubmit() {
            AutoSubmit autoSubmit = this.autoSubmit_;
            return autoSubmit == null ? AutoSubmit.getDefaultInstance() : autoSubmit;
        }

        public Common$AttributedLocalizedString getDisclaimerText() {
            Common$AttributedLocalizedString common$AttributedLocalizedString = this.disclaimerText_;
            return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public Events getEvents() {
            Events events = this.events_;
            return events == null ? Events.getDefaultInstance() : events;
        }

        public Fields getFields() {
            Fields fields = this.fields_;
            return fields == null ? Fields.getDefaultInstance() : fields;
        }

        public Common$RenderedAssetAppearance getLoadingIndicator() {
            Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.loadingIndicator_;
            return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
        }

        public Common$ButtonContent getPrimaryButton() {
            Common$ButtonContent common$ButtonContent = this.primaryButton_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public Common$AttributedLocalizedString getPrimaryText() {
            Common$AttributedLocalizedString common$AttributedLocalizedString = this.primaryText_;
            return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public boolean hasAccountSelectionOptions() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasAutoSubmit() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasDisclaimerText() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasEvents() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasFields() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasLoadingIndicator() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasPrimaryButton() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasPrimaryText() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C6669b newBuilder(Rendering rendering) {
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

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane$a */
    public static final class C6672a extends GeneratedMessageLite.Builder<IdentityDataSharingPaneOuterClass$IdentityDataSharingPane, C6672a> implements MessageLiteOrBuilder {
        public C6672a() {
            super(IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.DEFAULT_INSTANCE);
        }
    }

    static {
        IdentityDataSharingPaneOuterClass$IdentityDataSharingPane identityDataSharingPaneOuterClass$IdentityDataSharingPane = new IdentityDataSharingPaneOuterClass$IdentityDataSharingPane();
        DEFAULT_INSTANCE = identityDataSharingPaneOuterClass$IdentityDataSharingPane;
        GeneratedMessageLite.registerDefaultInstance(IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.class, identityDataSharingPaneOuterClass$IdentityDataSharingPane);
    }

    private IdentityDataSharingPaneOuterClass$IdentityDataSharingPane() {
    }

    public static IdentityDataSharingPaneOuterClass$IdentityDataSharingPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6672a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IdentityDataSharingPaneOuterClass$IdentityDataSharingPane parseDelimitedFrom(InputStream inputStream) {
        return (IdentityDataSharingPaneOuterClass$IdentityDataSharingPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IdentityDataSharingPaneOuterClass$IdentityDataSharingPane parseFrom(ByteBuffer byteBuffer) {
        return (IdentityDataSharingPaneOuterClass$IdentityDataSharingPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IdentityDataSharingPaneOuterClass$IdentityDataSharingPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6916i0.f2561a[methodToInvoke.ordinal()]) {
            case 1:
                return new IdentityDataSharingPaneOuterClass$IdentityDataSharingPane();
            case 2:
                return new C6672a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IdentityDataSharingPaneOuterClass$IdentityDataSharingPane> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.class) {
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

    public static C6672a newBuilder(IdentityDataSharingPaneOuterClass$IdentityDataSharingPane identityDataSharingPaneOuterClass$IdentityDataSharingPane) {
        return DEFAULT_INSTANCE.createBuilder(identityDataSharingPaneOuterClass$IdentityDataSharingPane);
    }

    public static IdentityDataSharingPaneOuterClass$IdentityDataSharingPane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (IdentityDataSharingPaneOuterClass$IdentityDataSharingPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IdentityDataSharingPaneOuterClass$IdentityDataSharingPane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (IdentityDataSharingPaneOuterClass$IdentityDataSharingPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IdentityDataSharingPaneOuterClass$IdentityDataSharingPane parseFrom(ByteString byteString) {
        return (IdentityDataSharingPaneOuterClass$IdentityDataSharingPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static IdentityDataSharingPaneOuterClass$IdentityDataSharingPane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (IdentityDataSharingPaneOuterClass$IdentityDataSharingPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IdentityDataSharingPaneOuterClass$IdentityDataSharingPane parseFrom(byte[] bArr) {
        return (IdentityDataSharingPaneOuterClass$IdentityDataSharingPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IdentityDataSharingPaneOuterClass$IdentityDataSharingPane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (IdentityDataSharingPaneOuterClass$IdentityDataSharingPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IdentityDataSharingPaneOuterClass$IdentityDataSharingPane parseFrom(InputStream inputStream) {
        return (IdentityDataSharingPaneOuterClass$IdentityDataSharingPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IdentityDataSharingPaneOuterClass$IdentityDataSharingPane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (IdentityDataSharingPaneOuterClass$IdentityDataSharingPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IdentityDataSharingPaneOuterClass$IdentityDataSharingPane parseFrom(CodedInputStream codedInputStream) {
        return (IdentityDataSharingPaneOuterClass$IdentityDataSharingPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IdentityDataSharingPaneOuterClass$IdentityDataSharingPane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (IdentityDataSharingPaneOuterClass$IdentityDataSharingPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
