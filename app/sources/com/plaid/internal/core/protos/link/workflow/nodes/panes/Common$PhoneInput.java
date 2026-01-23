package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class Common$PhoneInput extends GeneratedMessageLite<Common$PhoneInput, C6463a> implements MessageLiteOrBuilder {
    public static final int CALLING_CODE_LABEL_FIELD_NUMBER = 3;
    public static final int COUNTRY_CODES_FIELD_NUMBER = 2;
    private static final Common$PhoneInput DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<Common$PhoneInput> PARSER = null;
    public static final int PHONE_NUMBER_LABEL_FIELD_NUMBER = 5;
    public static final int PREFILLED_COUNTRY_FIELD_NUMBER = 8;
    public static final int PREFILLED_TEXT_FIELD_NUMBER = 6;
    public static final int PREFILL_OPTIONS_FIELD_NUMBER = 7;
    public static final int SHOULD_HIDE_CALLING_CODE_FLAG_FIELD_NUMBER = 9;
    private int bitField0_;
    private Common$LocalizedString callingCodeLabel_;
    private Common$LocalizedString phoneNumberLabel_;
    private Common$TextInput.PrefillOptions prefillOptions_;
    private Country prefilledCountry_;
    private Common$LocalizedString prefilledText_;
    private boolean shouldHideCallingCodeFlag_;
    private String id_ = "";
    private Internal.ProtobufList<Country> countryCodes_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Country extends GeneratedMessageLite<Country, C6462a> implements InterfaceC6464b {
        public static final int CALLING_CODE_FIELD_NUMBER = 4;
        public static final int COUNTRY_CODE_FIELD_NUMBER = 5;
        private static final Country DEFAULT_INSTANCE;
        public static final int ICON_FIELD_NUMBER = 3;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile Parser<Country> PARSER;
        private int bitField0_;
        private Common$LocalizedString callingCode_;
        private int id_;
        private Common$LocalizedString name_;
        private String icon_ = "";
        private String countryCode_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput$Country$a */
        public static final class C6462a extends GeneratedMessageLite.Builder<Country, C6462a> implements InterfaceC6464b {
            public C6462a() {
                super(Country.DEFAULT_INSTANCE);
            }
        }

        static {
            Country country = new Country();
            DEFAULT_INSTANCE = country;
            GeneratedMessageLite.registerDefaultInstance(Country.class, country);
        }

        private Country() {
        }

        private void clearCallingCode() {
            this.callingCode_ = null;
            this.bitField0_ &= -3;
        }

        private void clearCountryCode() {
            this.countryCode_ = getDefaultInstance().getCountryCode();
        }

        private void clearIcon() {
            this.icon_ = getDefaultInstance().getIcon();
        }

        private void clearId() {
            this.id_ = 0;
        }

        private void clearName() {
            this.name_ = null;
            this.bitField0_ &= -2;
        }

        public static Country getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeCallingCode(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            Common$LocalizedString common$LocalizedString2 = this.callingCode_;
            if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
                common$LocalizedString = Common$LocalizedString.newBuilder(this.callingCode_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
            }
            this.callingCode_ = common$LocalizedString;
            this.bitField0_ |= 2;
        }

        private void mergeName(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            Common$LocalizedString common$LocalizedString2 = this.name_;
            if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
                common$LocalizedString = Common$LocalizedString.newBuilder(this.name_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
            }
            this.name_ = common$LocalizedString;
            this.bitField0_ |= 1;
        }

        public static C6462a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Country parseDelimitedFrom(InputStream inputStream) {
            return (Country) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Country parseFrom(ByteString byteString) {
            return (Country) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Parser<Country> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setCallingCode(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            this.callingCode_ = common$LocalizedString;
            this.bitField0_ |= 2;
        }

        private void setCountryCode(String str) {
            str.getClass();
            this.countryCode_ = str;
        }

        private void setCountryCodeBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.countryCode_ = byteString.toStringUtf8();
        }

        private void setIcon(String str) {
            str.getClass();
            this.icon_ = str;
        }

        private void setIconBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.icon_ = byteString.toStringUtf8();
        }

        private void setId(int i) {
            this.id_ = i;
        }

        private void setName(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            this.name_ = common$LocalizedString;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Country();
                case 2:
                    return new C6462a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003Ȉ\u0004ဉ\u0001\u0005Ȉ", new Object[]{"bitField0_", "id_", "name_", "icon_", "callingCode_", "countryCode_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Country> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Country.class) {
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

        public Common$LocalizedString getCallingCode() {
            Common$LocalizedString common$LocalizedString = this.callingCode_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public String getCountryCode() {
            return this.countryCode_;
        }

        public ByteString getCountryCodeBytes() {
            return ByteString.copyFromUtf8(this.countryCode_);
        }

        public String getIcon() {
            return this.icon_;
        }

        public ByteString getIconBytes() {
            return ByteString.copyFromUtf8(this.icon_);
        }

        public int getId() {
            return this.id_;
        }

        public Common$LocalizedString getName() {
            Common$LocalizedString common$LocalizedString = this.name_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public boolean hasCallingCode() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C6462a newBuilder(Country country) {
            return DEFAULT_INSTANCE.createBuilder(country);
        }

        public static Country parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Country) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Country parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Country) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Country parseFrom(CodedInputStream codedInputStream) {
            return (Country) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Country parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Country) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Country parseFrom(InputStream inputStream) {
            return (Country) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Country parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Country) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Country parseFrom(ByteBuffer byteBuffer) {
            return (Country) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Country parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Country) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Country parseFrom(byte[] bArr) {
            return (Country) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Country parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Country) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput$a */
    public static final class C6463a extends GeneratedMessageLite.Builder<Common$PhoneInput, C6463a> implements MessageLiteOrBuilder {
        public C6463a() {
            super(Common$PhoneInput.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput$b */
    public interface InterfaceC6464b extends MessageLiteOrBuilder {
    }

    static {
        Common$PhoneInput common$PhoneInput = new Common$PhoneInput();
        DEFAULT_INSTANCE = common$PhoneInput;
        GeneratedMessageLite.registerDefaultInstance(Common$PhoneInput.class, common$PhoneInput);
    }

    private Common$PhoneInput() {
    }

    private void addAllCountryCodes(Iterable<? extends Country> iterable) {
        ensureCountryCodesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.countryCodes_);
    }

    private void addCountryCodes(int i, Country country) {
        country.getClass();
        ensureCountryCodesIsMutable();
        this.countryCodes_.add(i, country);
    }

    private void clearCallingCodeLabel() {
        this.callingCodeLabel_ = null;
        this.bitField0_ &= -2;
    }

    private void clearCountryCodes() {
        this.countryCodes_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearPhoneNumberLabel() {
        this.phoneNumberLabel_ = null;
        this.bitField0_ &= -3;
    }

    private void clearPrefillOptions() {
        this.prefillOptions_ = null;
        this.bitField0_ &= -9;
    }

    private void clearPrefilledCountry() {
        this.prefilledCountry_ = null;
        this.bitField0_ &= -17;
    }

    private void clearPrefilledText() {
        this.prefilledText_ = null;
        this.bitField0_ &= -5;
    }

    private void clearShouldHideCallingCodeFlag() {
        this.shouldHideCallingCodeFlag_ = false;
    }

    private void ensureCountryCodesIsMutable() {
        Internal.ProtobufList<Country> protobufList = this.countryCodes_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.countryCodes_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Common$PhoneInput getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeCallingCodeLabel(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.callingCodeLabel_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = Common$LocalizedString.newBuilder(this.callingCodeLabel_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.callingCodeLabel_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void mergePhoneNumberLabel(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.phoneNumberLabel_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = Common$LocalizedString.newBuilder(this.phoneNumberLabel_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.phoneNumberLabel_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    private void mergePrefillOptions(Common$TextInput.PrefillOptions prefillOptions) {
        prefillOptions.getClass();
        Common$TextInput.PrefillOptions prefillOptions2 = this.prefillOptions_;
        if (prefillOptions2 != null && prefillOptions2 != Common$TextInput.PrefillOptions.getDefaultInstance()) {
            prefillOptions = Common$TextInput.PrefillOptions.newBuilder(this.prefillOptions_).mergeFrom((Common$TextInput.PrefillOptions.C6514a) prefillOptions).buildPartial();
        }
        this.prefillOptions_ = prefillOptions;
        this.bitField0_ |= 8;
    }

    private void mergePrefilledCountry(Country country) {
        country.getClass();
        Country country2 = this.prefilledCountry_;
        if (country2 != null && country2 != Country.getDefaultInstance()) {
            country = Country.newBuilder(this.prefilledCountry_).mergeFrom((Country.C6462a) country).buildPartial();
        }
        this.prefilledCountry_ = country;
        this.bitField0_ |= 16;
    }

    private void mergePrefilledText(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.prefilledText_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = Common$LocalizedString.newBuilder(this.prefilledText_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.prefilledText_ = common$LocalizedString;
        this.bitField0_ |= 4;
    }

    public static C6463a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$PhoneInput parseDelimitedFrom(InputStream inputStream) {
        return (Common$PhoneInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$PhoneInput parseFrom(ByteString byteString) {
        return (Common$PhoneInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$PhoneInput> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeCountryCodes(int i) {
        ensureCountryCodesIsMutable();
        this.countryCodes_.remove(i);
    }

    private void setCallingCodeLabel(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.callingCodeLabel_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void setCountryCodes(int i, Country country) {
        country.getClass();
        ensureCountryCodesIsMutable();
        this.countryCodes_.set(i, country);
    }

    private void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    private void setIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setPhoneNumberLabel(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.phoneNumberLabel_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    private void setPrefillOptions(Common$TextInput.PrefillOptions prefillOptions) {
        prefillOptions.getClass();
        this.prefillOptions_ = prefillOptions;
        this.bitField0_ |= 8;
    }

    private void setPrefilledCountry(Country country) {
        country.getClass();
        this.prefilledCountry_ = country;
        this.bitField0_ |= 16;
    }

    private void setPrefilledText(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.prefilledText_ = common$LocalizedString;
        this.bitField0_ |= 4;
    }

    private void setShouldHideCallingCodeFlag(boolean z) {
        this.shouldHideCallingCodeFlag_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$PhoneInput();
            case 2:
                return new C6463a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\t\b\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002\u0007ဉ\u0003\bဉ\u0004\t\u0007", new Object[]{"bitField0_", "id_", "countryCodes_", Country.class, "callingCodeLabel_", "phoneNumberLabel_", "prefilledText_", "prefillOptions_", "prefilledCountry_", "shouldHideCallingCodeFlag_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$PhoneInput> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$PhoneInput.class) {
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

    public Common$LocalizedString getCallingCodeLabel() {
        Common$LocalizedString common$LocalizedString = this.callingCodeLabel_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public Country getCountryCodes(int i) {
        return this.countryCodes_.get(i);
    }

    public int getCountryCodesCount() {
        return this.countryCodes_.size();
    }

    public List<Country> getCountryCodesList() {
        return this.countryCodes_;
    }

    public InterfaceC6464b getCountryCodesOrBuilder(int i) {
        return this.countryCodes_.get(i);
    }

    public List<? extends InterfaceC6464b> getCountryCodesOrBuilderList() {
        return this.countryCodes_;
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public Common$LocalizedString getPhoneNumberLabel() {
        Common$LocalizedString common$LocalizedString = this.phoneNumberLabel_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public Common$TextInput.PrefillOptions getPrefillOptions() {
        Common$TextInput.PrefillOptions prefillOptions = this.prefillOptions_;
        return prefillOptions == null ? Common$TextInput.PrefillOptions.getDefaultInstance() : prefillOptions;
    }

    public Country getPrefilledCountry() {
        Country country = this.prefilledCountry_;
        return country == null ? Country.getDefaultInstance() : country;
    }

    public Common$LocalizedString getPrefilledText() {
        Common$LocalizedString common$LocalizedString = this.prefilledText_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public boolean getShouldHideCallingCodeFlag() {
        return this.shouldHideCallingCodeFlag_;
    }

    public boolean hasCallingCodeLabel() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPhoneNumberLabel() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPrefillOptions() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasPrefilledCountry() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasPrefilledText() {
        return (this.bitField0_ & 4) != 0;
    }

    private void addCountryCodes(Country country) {
        country.getClass();
        ensureCountryCodesIsMutable();
        this.countryCodes_.add(country);
    }

    public static C6463a newBuilder(Common$PhoneInput common$PhoneInput) {
        return DEFAULT_INSTANCE.createBuilder(common$PhoneInput);
    }

    public static Common$PhoneInput parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PhoneInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$PhoneInput parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PhoneInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$PhoneInput parseFrom(CodedInputStream codedInputStream) {
        return (Common$PhoneInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$PhoneInput parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PhoneInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$PhoneInput parseFrom(InputStream inputStream) {
        return (Common$PhoneInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$PhoneInput parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PhoneInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$PhoneInput parseFrom(ByteBuffer byteBuffer) {
        return (Common$PhoneInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$PhoneInput parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PhoneInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$PhoneInput parseFrom(byte[] bArr) {
        return (Common$PhoneInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$PhoneInput parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PhoneInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
