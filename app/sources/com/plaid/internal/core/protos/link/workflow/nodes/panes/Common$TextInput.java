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
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEncryptionMetadata;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Common$TextInput extends GeneratedMessageLite<Common$TextInput, C6517b> implements MessageLiteOrBuilder {
    public static final int AUTOCOMPLETE_TYPE_FIELD_NUMBER = 11;
    private static final Common$TextInput DEFAULT_INSTANCE;
    public static final int DISABLED_FIELD_NUMBER = 16;
    public static final int ENCRYPTION_FIELD_NUMBER = 8;
    public static final int HINT_FIELD_NUMBER = 13;
    public static final int ICON_FIELD_NUMBER = 9;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int INPUT_MODE_TYPE_FIELD_NUMBER = 14;
    public static final int LABEL_FIELD_NUMBER = 3;
    private static volatile Parser<Common$TextInput> PARSER = null;
    public static final int PLACEHOLDER_FIELD_NUMBER = 4;
    public static final int PREFILLED_TEXT_FIELD_NUMBER = 7;
    public static final int PREFILL_OPTIONS_FIELD_NUMBER = 15;
    public static final int PREFIX_ICON_FIELD_NUMBER = 12;
    public static final int SECURE_FIELD_NUMBER = 5;
    public static final int SECURE_OPTIONS_FIELD_NUMBER = 10;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int VALIDATION_FIELD_NUMBER = 6;
    private int autocompleteType_;
    private int bitField0_;
    private boolean disabled_;
    private Common$SDKEncryptionMetadata encryption_;
    private Common$AttributedLocalizedString hint_;
    private Common$RenderedAssetAppearance icon_;
    private String id_ = "";
    private int inputModeType_;
    private Common$LocalizedString label_;
    private Common$LocalizedString placeholder_;
    private PrefillOptions prefillOptions_;
    private Common$LocalizedString prefilledText_;
    private Common$RenderedAssetAppearance prefixIcon_;
    private SecureOptions secureOptions_;
    private boolean secure_;
    private int type_;
    private Common$TextInputValidation validation_;

    public static final class PrefillOptions extends GeneratedMessageLite<PrefillOptions, C6514a> implements MessageLiteOrBuilder {
        public static final int CLEAR_ON_FOCUS_FIELD_NUMBER = 1;
        private static final PrefillOptions DEFAULT_INSTANCE;
        private static volatile Parser<PrefillOptions> PARSER;
        private boolean clearOnFocus_;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput$PrefillOptions$a */
        public static final class C6514a extends GeneratedMessageLite.Builder<PrefillOptions, C6514a> implements MessageLiteOrBuilder {
            public C6514a() {
                super(PrefillOptions.DEFAULT_INSTANCE);
            }
        }

        static {
            PrefillOptions prefillOptions = new PrefillOptions();
            DEFAULT_INSTANCE = prefillOptions;
            GeneratedMessageLite.registerDefaultInstance(PrefillOptions.class, prefillOptions);
        }

        private PrefillOptions() {
        }

        private void clearClearOnFocus() {
            this.clearOnFocus_ = false;
        }

        public static PrefillOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6514a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PrefillOptions parseDelimitedFrom(InputStream inputStream) {
            return (PrefillOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PrefillOptions parseFrom(ByteBuffer byteBuffer) {
            return (PrefillOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<PrefillOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setClearOnFocus(boolean z) {
            this.clearOnFocus_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                case 1:
                    return new PrefillOptions();
                case 2:
                    return new C6514a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"clearOnFocus_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<PrefillOptions> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (PrefillOptions.class) {
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

        public boolean getClearOnFocus() {
            return this.clearOnFocus_;
        }

        public static C6514a newBuilder(PrefillOptions prefillOptions) {
            return DEFAULT_INSTANCE.createBuilder(prefillOptions);
        }

        public static PrefillOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PrefillOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PrefillOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (PrefillOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static PrefillOptions parseFrom(ByteString byteString) {
            return (PrefillOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PrefillOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (PrefillOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PrefillOptions parseFrom(byte[] bArr) {
            return (PrefillOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PrefillOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (PrefillOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static PrefillOptions parseFrom(InputStream inputStream) {
            return (PrefillOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PrefillOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PrefillOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PrefillOptions parseFrom(CodedInputStream codedInputStream) {
            return (PrefillOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PrefillOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PrefillOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SecureOptions extends GeneratedMessageLite<SecureOptions, C6515a> implements MessageLiteOrBuilder {
        private static final SecureOptions DEFAULT_INSTANCE;
        public static final int ENABLE_MASKING_FIELD_NUMBER = 2;
        private static volatile Parser<SecureOptions> PARSER = null;
        public static final int TOGGLE_MASKING_FIELD_NUMBER = 1;
        private boolean enableMasking_;
        private boolean toggleMasking_;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput$SecureOptions$a */
        public static final class C6515a extends GeneratedMessageLite.Builder<SecureOptions, C6515a> implements MessageLiteOrBuilder {
            public C6515a() {
                super(SecureOptions.DEFAULT_INSTANCE);
            }
        }

        static {
            SecureOptions secureOptions = new SecureOptions();
            DEFAULT_INSTANCE = secureOptions;
            GeneratedMessageLite.registerDefaultInstance(SecureOptions.class, secureOptions);
        }

        private SecureOptions() {
        }

        private void clearEnableMasking() {
            this.enableMasking_ = false;
        }

        private void clearToggleMasking() {
            this.toggleMasking_ = false;
        }

        public static SecureOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6515a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SecureOptions parseDelimitedFrom(InputStream inputStream) {
            return (SecureOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SecureOptions parseFrom(ByteBuffer byteBuffer) {
            return (SecureOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SecureOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setEnableMasking(boolean z) {
            this.enableMasking_ = z;
        }

        private void setToggleMasking(boolean z) {
            this.toggleMasking_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                case 1:
                    return new SecureOptions();
                case 2:
                    return new C6515a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"toggleMasking_", "enableMasking_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SecureOptions> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (SecureOptions.class) {
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

        public boolean getEnableMasking() {
            return this.enableMasking_;
        }

        public boolean getToggleMasking() {
            return this.toggleMasking_;
        }

        public static C6515a newBuilder(SecureOptions secureOptions) {
            return DEFAULT_INSTANCE.createBuilder(secureOptions);
        }

        public static SecureOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SecureOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SecureOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (SecureOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SecureOptions parseFrom(ByteString byteString) {
            return (SecureOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SecureOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SecureOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SecureOptions parseFrom(byte[] bArr) {
            return (SecureOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SecureOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SecureOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SecureOptions parseFrom(InputStream inputStream) {
            return (SecureOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SecureOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SecureOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SecureOptions parseFrom(CodedInputStream codedInputStream) {
            return (SecureOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SecureOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SecureOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput$a */
    public enum EnumC6516a implements Internal.EnumLite {
        AUTOCOMPLETE_UNKNOWN(0),
        AUTOCOMPLETE_ONE_TIME_CODE(1),
        AUTOCOMPLETE_PHONE_WITHOUT_COUNTRY_CODE(2),
        AUTOCOMPLETE_PHONE(3),
        AUTOCOMPLETE_EMAIL(4),
        UNRECOGNIZED(-1);

        public static final int AUTOCOMPLETE_EMAIL_VALUE = 4;
        public static final int AUTOCOMPLETE_ONE_TIME_CODE_VALUE = 1;
        public static final int AUTOCOMPLETE_PHONE_VALUE = 3;
        public static final int AUTOCOMPLETE_PHONE_WITHOUT_COUNTRY_CODE_VALUE = 2;
        public static final int AUTOCOMPLETE_UNKNOWN_VALUE = 0;

        /* renamed from: b */
        public static final a f2313b = new a();

        /* renamed from: a */
        public final int f2315a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput$a$a */
        public class a implements Internal.EnumLiteMap<EnumC6516a> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6516a.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput$a$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f2316a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6516a.forNumber(i) != null;
            }
        }

        EnumC6516a(int i) {
            this.f2315a = i;
        }

        public static EnumC6516a forNumber(int i) {
            if (i == 0) {
                return AUTOCOMPLETE_UNKNOWN;
            }
            if (i == 1) {
                return AUTOCOMPLETE_ONE_TIME_CODE;
            }
            if (i == 2) {
                return AUTOCOMPLETE_PHONE_WITHOUT_COUNTRY_CODE;
            }
            if (i == 3) {
                return AUTOCOMPLETE_PHONE;
            }
            if (i != 4) {
                return null;
            }
            return AUTOCOMPLETE_EMAIL;
        }

        public static Internal.EnumLiteMap<EnumC6516a> internalGetValueMap() {
            return f2313b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f2316a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f2315a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC6516a valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput$b */
    public static final class C6517b extends GeneratedMessageLite.Builder<Common$TextInput, C6517b> implements MessageLiteOrBuilder {
        public C6517b() {
            super(Common$TextInput.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput$c */
    public enum EnumC6518c implements Internal.EnumLite {
        INPUT_MODE_TYPE_UNKNOWN(0),
        INPUT_MODE_TYPE_NONE(1),
        INPUT_MODE_TYPE_TEXT(2),
        INPUT_MODE_TYPE_DECIMAL(3),
        INPUT_MODE_TYPE_NUMERIC(4),
        INPUT_MODE_TYPE_TELEPHONE(5),
        INPUT_MODE_TYPE_SEARCH(6),
        INPUT_MODE_TYPE_EMAIL(7),
        INPUT_MODE_TYPE_URL(8),
        UNRECOGNIZED(-1);

        public static final int INPUT_MODE_TYPE_DECIMAL_VALUE = 3;
        public static final int INPUT_MODE_TYPE_EMAIL_VALUE = 7;
        public static final int INPUT_MODE_TYPE_NONE_VALUE = 1;
        public static final int INPUT_MODE_TYPE_NUMERIC_VALUE = 4;
        public static final int INPUT_MODE_TYPE_SEARCH_VALUE = 6;
        public static final int INPUT_MODE_TYPE_TELEPHONE_VALUE = 5;
        public static final int INPUT_MODE_TYPE_TEXT_VALUE = 2;
        public static final int INPUT_MODE_TYPE_UNKNOWN_VALUE = 0;
        public static final int INPUT_MODE_TYPE_URL_VALUE = 8;

        /* renamed from: b */
        public static final a f2317b = new a();

        /* renamed from: a */
        public final int f2319a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput$c$a */
        public class a implements Internal.EnumLiteMap<EnumC6518c> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6518c.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput$c$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f2320a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6518c.forNumber(i) != null;
            }
        }

        EnumC6518c(int i) {
            this.f2319a = i;
        }

        public static EnumC6518c forNumber(int i) {
            switch (i) {
                case 0:
                    return INPUT_MODE_TYPE_UNKNOWN;
                case 1:
                    return INPUT_MODE_TYPE_NONE;
                case 2:
                    return INPUT_MODE_TYPE_TEXT;
                case 3:
                    return INPUT_MODE_TYPE_DECIMAL;
                case 4:
                    return INPUT_MODE_TYPE_NUMERIC;
                case 5:
                    return INPUT_MODE_TYPE_TELEPHONE;
                case 6:
                    return INPUT_MODE_TYPE_SEARCH;
                case 7:
                    return INPUT_MODE_TYPE_EMAIL;
                case 8:
                    return INPUT_MODE_TYPE_URL;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<EnumC6518c> internalGetValueMap() {
            return f2317b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f2320a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f2319a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC6518c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        Common$TextInput common$TextInput = new Common$TextInput();
        DEFAULT_INSTANCE = common$TextInput;
        GeneratedMessageLite.registerDefaultInstance(Common$TextInput.class, common$TextInput);
    }

    private Common$TextInput() {
    }

    private void clearAutocompleteType() {
        this.autocompleteType_ = 0;
    }

    private void clearDisabled() {
        this.disabled_ = false;
    }

    private void clearEncryption() {
        this.encryption_ = null;
        this.bitField0_ &= -65;
    }

    private void clearHint() {
        this.hint_ = null;
        this.bitField0_ &= -513;
    }

    private void clearIcon() {
        this.icon_ = null;
        this.bitField0_ &= -129;
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearInputModeType() {
        this.inputModeType_ = 0;
    }

    private void clearLabel() {
        this.label_ = null;
        this.bitField0_ &= -2;
    }

    private void clearPlaceholder() {
        this.placeholder_ = null;
        this.bitField0_ &= -3;
    }

    private void clearPrefillOptions() {
        this.prefillOptions_ = null;
        this.bitField0_ &= -33;
    }

    private void clearPrefilledText() {
        this.prefilledText_ = null;
        this.bitField0_ &= -17;
    }

    private void clearPrefixIcon() {
        this.prefixIcon_ = null;
        this.bitField0_ &= -257;
    }

    private void clearSecure() {
        this.secure_ = false;
    }

    private void clearSecureOptions() {
        this.secureOptions_ = null;
        this.bitField0_ &= -5;
    }

    private void clearType() {
        this.type_ = 0;
    }

    private void clearValidation() {
        this.validation_ = null;
        this.bitField0_ &= -9;
    }

    public static Common$TextInput getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeEncryption(Common$SDKEncryptionMetadata common$SDKEncryptionMetadata) {
        common$SDKEncryptionMetadata.getClass();
        Common$SDKEncryptionMetadata common$SDKEncryptionMetadata2 = this.encryption_;
        if (common$SDKEncryptionMetadata2 == null || common$SDKEncryptionMetadata2 == Common$SDKEncryptionMetadata.getDefaultInstance()) {
            this.encryption_ = common$SDKEncryptionMetadata;
        } else {
            this.encryption_ = Common$SDKEncryptionMetadata.newBuilder(this.encryption_).mergeFrom((Common$SDKEncryptionMetadata.C6477a) common$SDKEncryptionMetadata).buildPartial();
        }
        this.bitField0_ |= 64;
    }

    private void mergeHint(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.hint_;
        if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
            this.hint_ = common$AttributedLocalizedString;
        } else {
            this.hint_ = Common$AttributedLocalizedString.newBuilder(this.hint_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
        }
        this.bitField0_ |= 512;
    }

    private void mergeIcon(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.icon_;
        if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == Common$RenderedAssetAppearance.getDefaultInstance()) {
            this.icon_ = common$RenderedAssetAppearance;
        } else {
            this.icon_ = Common$RenderedAssetAppearance.newBuilder(this.icon_).mergeFrom((Common$RenderedAssetAppearance.C6475a) common$RenderedAssetAppearance).buildPartial();
        }
        this.bitField0_ |= 128;
    }

    private void mergeLabel(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.label_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
            this.label_ = common$LocalizedString;
        } else {
            this.label_ = Common$LocalizedString.newBuilder(this.label_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergePlaceholder(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.placeholder_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
            this.placeholder_ = common$LocalizedString;
        } else {
            this.placeholder_ = Common$LocalizedString.newBuilder(this.placeholder_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergePrefillOptions(PrefillOptions prefillOptions) {
        prefillOptions.getClass();
        PrefillOptions prefillOptions2 = this.prefillOptions_;
        if (prefillOptions2 == null || prefillOptions2 == PrefillOptions.getDefaultInstance()) {
            this.prefillOptions_ = prefillOptions;
        } else {
            this.prefillOptions_ = PrefillOptions.newBuilder(this.prefillOptions_).mergeFrom((PrefillOptions.C6514a) prefillOptions).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    private void mergePrefilledText(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.prefilledText_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
            this.prefilledText_ = common$LocalizedString;
        } else {
            this.prefilledText_ = Common$LocalizedString.newBuilder(this.prefilledText_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    private void mergePrefixIcon(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.prefixIcon_;
        if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == Common$RenderedAssetAppearance.getDefaultInstance()) {
            this.prefixIcon_ = common$RenderedAssetAppearance;
        } else {
            this.prefixIcon_ = Common$RenderedAssetAppearance.newBuilder(this.prefixIcon_).mergeFrom((Common$RenderedAssetAppearance.C6475a) common$RenderedAssetAppearance).buildPartial();
        }
        this.bitField0_ |= 256;
    }

    private void mergeSecureOptions(SecureOptions secureOptions) {
        secureOptions.getClass();
        SecureOptions secureOptions2 = this.secureOptions_;
        if (secureOptions2 == null || secureOptions2 == SecureOptions.getDefaultInstance()) {
            this.secureOptions_ = secureOptions;
        } else {
            this.secureOptions_ = SecureOptions.newBuilder(this.secureOptions_).mergeFrom((SecureOptions.C6515a) secureOptions).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    private void mergeValidation(Common$TextInputValidation common$TextInputValidation) {
        common$TextInputValidation.getClass();
        Common$TextInputValidation common$TextInputValidation2 = this.validation_;
        if (common$TextInputValidation2 == null || common$TextInputValidation2 == Common$TextInputValidation.getDefaultInstance()) {
            this.validation_ = common$TextInputValidation;
        } else {
            this.validation_ = Common$TextInputValidation.newBuilder(this.validation_).mergeFrom((Common$TextInputValidation.C6527a) common$TextInputValidation).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    public static C6517b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$TextInput parseDelimitedFrom(InputStream inputStream) {
        return (Common$TextInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$TextInput parseFrom(ByteBuffer byteBuffer) {
        return (Common$TextInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$TextInput> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAutocompleteType(EnumC6516a enumC6516a) {
        this.autocompleteType_ = enumC6516a.getNumber();
    }

    private void setAutocompleteTypeValue(int i) {
        this.autocompleteType_ = i;
    }

    private void setDisabled(boolean z) {
        this.disabled_ = z;
    }

    private void setEncryption(Common$SDKEncryptionMetadata common$SDKEncryptionMetadata) {
        common$SDKEncryptionMetadata.getClass();
        this.encryption_ = common$SDKEncryptionMetadata;
        this.bitField0_ |= 64;
    }

    private void setHint(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        this.hint_ = common$AttributedLocalizedString;
        this.bitField0_ |= 512;
    }

    private void setIcon(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.icon_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 128;
    }

    private void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    private void setIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setInputModeType(EnumC6518c enumC6518c) {
        this.inputModeType_ = enumC6518c.getNumber();
    }

    private void setInputModeTypeValue(int i) {
        this.inputModeType_ = i;
    }

    private void setLabel(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.label_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void setPlaceholder(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.placeholder_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    private void setPrefillOptions(PrefillOptions prefillOptions) {
        prefillOptions.getClass();
        this.prefillOptions_ = prefillOptions;
        this.bitField0_ |= 32;
    }

    private void setPrefilledText(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.prefilledText_ = common$LocalizedString;
        this.bitField0_ |= 16;
    }

    private void setPrefixIcon(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.prefixIcon_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 256;
    }

    private void setSecure(boolean z) {
        this.secure_ = z;
    }

    private void setSecureOptions(SecureOptions secureOptions) {
        secureOptions.getClass();
        this.secureOptions_ = secureOptions;
        this.bitField0_ |= 4;
    }

    private void setType(EnumC6869V enumC6869V) {
        this.type_ = enumC6869V.getNumber();
    }

    private void setTypeValue(int i) {
        this.type_ = i;
    }

    private void setValidation(Common$TextInputValidation common$TextInputValidation) {
        common$TextInputValidation.getClass();
        this.validation_ = common$TextInputValidation;
        this.bitField0_ |= 8;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$TextInput();
            case 2:
                return new C6517b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000\u0004ဉ\u0001\u0005\u0007\u0006ဉ\u0003\u0007ဉ\u0004\bဉ\u0006\tဉ\u0007\nဉ\u0002\u000b\f\fဉ\b\rဉ\t\u000e\f\u000fဉ\u0005\u0010\u0007", new Object[]{"bitField0_", "id_", "type_", "label_", "placeholder_", "secure_", "validation_", "prefilledText_", "encryption_", "icon_", "secureOptions_", "autocompleteType_", "prefixIcon_", "hint_", "inputModeType_", "prefillOptions_", "disabled_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$TextInput> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$TextInput.class) {
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

    public EnumC6516a getAutocompleteType() {
        EnumC6516a enumC6516aForNumber = EnumC6516a.forNumber(this.autocompleteType_);
        return enumC6516aForNumber == null ? EnumC6516a.UNRECOGNIZED : enumC6516aForNumber;
    }

    public int getAutocompleteTypeValue() {
        return this.autocompleteType_;
    }

    public boolean getDisabled() {
        return this.disabled_;
    }

    public Common$SDKEncryptionMetadata getEncryption() {
        Common$SDKEncryptionMetadata common$SDKEncryptionMetadata = this.encryption_;
        return common$SDKEncryptionMetadata == null ? Common$SDKEncryptionMetadata.getDefaultInstance() : common$SDKEncryptionMetadata;
    }

    public Common$AttributedLocalizedString getHint() {
        Common$AttributedLocalizedString common$AttributedLocalizedString = this.hint_;
        return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
    }

    public Common$RenderedAssetAppearance getIcon() {
        Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.icon_;
        return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public EnumC6518c getInputModeType() {
        EnumC6518c enumC6518cForNumber = EnumC6518c.forNumber(this.inputModeType_);
        return enumC6518cForNumber == null ? EnumC6518c.UNRECOGNIZED : enumC6518cForNumber;
    }

    public int getInputModeTypeValue() {
        return this.inputModeType_;
    }

    public Common$LocalizedString getLabel() {
        Common$LocalizedString common$LocalizedString = this.label_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public Common$LocalizedString getPlaceholder() {
        Common$LocalizedString common$LocalizedString = this.placeholder_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public PrefillOptions getPrefillOptions() {
        PrefillOptions prefillOptions = this.prefillOptions_;
        return prefillOptions == null ? PrefillOptions.getDefaultInstance() : prefillOptions;
    }

    public Common$LocalizedString getPrefilledText() {
        Common$LocalizedString common$LocalizedString = this.prefilledText_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public Common$RenderedAssetAppearance getPrefixIcon() {
        Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.prefixIcon_;
        return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public boolean getSecure() {
        return this.secure_;
    }

    public SecureOptions getSecureOptions() {
        SecureOptions secureOptions = this.secureOptions_;
        return secureOptions == null ? SecureOptions.getDefaultInstance() : secureOptions;
    }

    public EnumC6869V getType() {
        EnumC6869V enumC6869VForNumber = EnumC6869V.forNumber(this.type_);
        return enumC6869VForNumber == null ? EnumC6869V.UNRECOGNIZED : enumC6869VForNumber;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public Common$TextInputValidation getValidation() {
        Common$TextInputValidation common$TextInputValidation = this.validation_;
        return common$TextInputValidation == null ? Common$TextInputValidation.getDefaultInstance() : common$TextInputValidation;
    }

    public boolean hasEncryption() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasHint() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasIcon() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasLabel() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPlaceholder() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPrefillOptions() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasPrefilledText() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasPrefixIcon() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasSecureOptions() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasValidation() {
        return (this.bitField0_ & 8) != 0;
    }

    public static C6517b newBuilder(Common$TextInput common$TextInput) {
        return DEFAULT_INSTANCE.createBuilder(common$TextInput);
    }

    public static Common$TextInput parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$TextInput parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$TextInput parseFrom(ByteString byteString) {
        return (Common$TextInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$TextInput parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$TextInput parseFrom(byte[] bArr) {
        return (Common$TextInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$TextInput parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$TextInput parseFrom(InputStream inputStream) {
        return (Common$TextInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$TextInput parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$TextInput parseFrom(CodedInputStream codedInputStream) {
        return (Common$TextInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$TextInput parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
