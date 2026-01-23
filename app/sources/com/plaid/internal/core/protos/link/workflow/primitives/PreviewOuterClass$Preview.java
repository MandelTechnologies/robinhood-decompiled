package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization;
import com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class PreviewOuterClass$Preview extends GeneratedMessageLite<PreviewOuterClass$Preview, C6997a> implements MessageLiteOrBuilder {
    public static final int COBRANDING_CONFIG_FIELD_NUMBER = 6;
    private static final PreviewOuterClass$Preview DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 7;
    public static final int LINK_CUSTOMIZATION_FIELD_NUMBER = 5;
    public static final int LOCALE_FIELD_NUMBER = 4;
    private static volatile Parser<PreviewOuterClass$Preview> PARSER = null;
    public static final int PRESET_FIELD_NUMBER = 1;
    public static final int PRODUCTS_FIELD_NUMBER = 3;
    public static final int SCENARIO_FIELD_NUMBER = 2;
    private int bitField0_;
    private CobrandingConfig cobrandingConfig_;
    private Error error_;
    private LinkCustomizations$LinkCustomization linkCustomization_;
    private LocaleOuterClass$Locale locale_;
    private int preset_;
    private Internal.ProtobufList<String> products_ = GeneratedMessageLite.emptyProtobufList();
    private int scenario_;

    public static final class CobrandingConfig extends GeneratedMessageLite<CobrandingConfig, C6994a> implements MessageLiteOrBuilder {
        public static final int BRAND_COLOR_FIELD_NUMBER = 2;
        private static final CobrandingConfig DEFAULT_INSTANCE;
        public static final int LOGO_URL_1024_FIELD_NUMBER = 1;
        private static volatile Parser<CobrandingConfig> PARSER;
        private String logoUrl1024_ = "";
        private String brandColor_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview$CobrandingConfig$a */
        public static final class C6994a extends GeneratedMessageLite.Builder<CobrandingConfig, C6994a> implements MessageLiteOrBuilder {
            public C6994a() {
                super(CobrandingConfig.DEFAULT_INSTANCE);
            }
        }

        static {
            CobrandingConfig cobrandingConfig = new CobrandingConfig();
            DEFAULT_INSTANCE = cobrandingConfig;
            GeneratedMessageLite.registerDefaultInstance(CobrandingConfig.class, cobrandingConfig);
        }

        private CobrandingConfig() {
        }

        private void clearBrandColor() {
            this.brandColor_ = getDefaultInstance().getBrandColor();
        }

        private void clearLogoUrl1024() {
            this.logoUrl1024_ = getDefaultInstance().getLogoUrl1024();
        }

        public static CobrandingConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6994a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CobrandingConfig parseDelimitedFrom(InputStream inputStream) {
            return (CobrandingConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CobrandingConfig parseFrom(ByteBuffer byteBuffer) {
            return (CobrandingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CobrandingConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setBrandColor(String str) {
            str.getClass();
            this.brandColor_ = str;
        }

        private void setBrandColorBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.brandColor_ = byteString.toStringUtf8();
        }

        private void setLogoUrl1024(String str) {
            str.getClass();
            this.logoUrl1024_ = str;
        }

        private void setLogoUrl1024Bytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.logoUrl1024_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C7036p.f2698a[methodToInvoke.ordinal()]) {
                case 1:
                    return new CobrandingConfig();
                case 2:
                    return new C6994a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"logoUrl1024_", "brandColor_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<CobrandingConfig> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (CobrandingConfig.class) {
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

        public String getBrandColor() {
            return this.brandColor_;
        }

        public ByteString getBrandColorBytes() {
            return ByteString.copyFromUtf8(this.brandColor_);
        }

        public String getLogoUrl1024() {
            return this.logoUrl1024_;
        }

        public ByteString getLogoUrl1024Bytes() {
            return ByteString.copyFromUtf8(this.logoUrl1024_);
        }

        public static C6994a newBuilder(CobrandingConfig cobrandingConfig) {
            return DEFAULT_INSTANCE.createBuilder(cobrandingConfig);
        }

        public static CobrandingConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CobrandingConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CobrandingConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (CobrandingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CobrandingConfig parseFrom(ByteString byteString) {
            return (CobrandingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CobrandingConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CobrandingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CobrandingConfig parseFrom(byte[] bArr) {
            return (CobrandingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CobrandingConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CobrandingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CobrandingConfig parseFrom(InputStream inputStream) {
            return (CobrandingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CobrandingConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CobrandingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CobrandingConfig parseFrom(CodedInputStream codedInputStream) {
            return (CobrandingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CobrandingConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CobrandingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Error extends GeneratedMessageLite<Error, C6995a> implements MessageLiteOrBuilder {
        private static final Error DEFAULT_INSTANCE;
        public static final int ERROR_CODE_FIELD_NUMBER = 1;
        public static final int MFA_TYPE_FIELD_NUMBER = 2;
        private static volatile Parser<Error> PARSER;
        private String errorCode_ = "";
        private String mfaType_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview$Error$a */
        public static final class C6995a extends GeneratedMessageLite.Builder<Error, C6995a> implements MessageLiteOrBuilder {
            public C6995a() {
                super(Error.DEFAULT_INSTANCE);
            }
        }

        static {
            Error error = new Error();
            DEFAULT_INSTANCE = error;
            GeneratedMessageLite.registerDefaultInstance(Error.class, error);
        }

        private Error() {
        }

        private void clearErrorCode() {
            this.errorCode_ = getDefaultInstance().getErrorCode();
        }

        private void clearMfaType() {
            this.mfaType_ = getDefaultInstance().getMfaType();
        }

        public static Error getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6995a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Error parseDelimitedFrom(InputStream inputStream) {
            return (Error) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Error parseFrom(ByteBuffer byteBuffer) {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Error> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setErrorCode(String str) {
            str.getClass();
            this.errorCode_ = str;
        }

        private void setErrorCodeBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.errorCode_ = byteString.toStringUtf8();
        }

        private void setMfaType(String str) {
            str.getClass();
            this.mfaType_ = str;
        }

        private void setMfaTypeBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.mfaType_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C7036p.f2698a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Error();
                case 2:
                    return new C6995a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"errorCode_", "mfaType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Error> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Error.class) {
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

        public String getErrorCode() {
            return this.errorCode_;
        }

        public ByteString getErrorCodeBytes() {
            return ByteString.copyFromUtf8(this.errorCode_);
        }

        public String getMfaType() {
            return this.mfaType_;
        }

        public ByteString getMfaTypeBytes() {
            return ByteString.copyFromUtf8(this.mfaType_);
        }

        public static C6995a newBuilder(Error error) {
            return DEFAULT_INSTANCE.createBuilder(error);
        }

        public static Error parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Error) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Error parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Error parseFrom(ByteString byteString) {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Error parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Error parseFrom(byte[] bArr) {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Error parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Error parseFrom(InputStream inputStream) {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Error parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Error parseFrom(CodedInputStream codedInputStream) {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Error parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class RenderingOptions extends GeneratedMessageLite<RenderingOptions, C6996a> implements MessageLiteOrBuilder {
        private static final RenderingOptions DEFAULT_INSTANCE;
        public static final int EXECUTE_ACTION_IDS_FIELD_NUMBER = 3;
        public static final int PANE_DISABLED_FIELD_NUMBER = 1;
        private static volatile Parser<RenderingOptions> PARSER = null;
        public static final int SHOW_TRANSITION_FIELD_NUMBER = 2;
        private Internal.ProtobufList<String> executeActionIds_ = GeneratedMessageLite.emptyProtobufList();
        private boolean paneDisabled_;
        private boolean showTransition_;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview$RenderingOptions$a */
        public static final class C6996a extends GeneratedMessageLite.Builder<RenderingOptions, C6996a> implements MessageLiteOrBuilder {
            public C6996a() {
                super(RenderingOptions.DEFAULT_INSTANCE);
            }
        }

        static {
            RenderingOptions renderingOptions = new RenderingOptions();
            DEFAULT_INSTANCE = renderingOptions;
            GeneratedMessageLite.registerDefaultInstance(RenderingOptions.class, renderingOptions);
        }

        private RenderingOptions() {
        }

        private void addAllExecuteActionIds(Iterable<String> iterable) {
            ensureExecuteActionIdsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.executeActionIds_);
        }

        private void addExecuteActionIds(String str) {
            str.getClass();
            ensureExecuteActionIdsIsMutable();
            this.executeActionIds_.add(str);
        }

        private void addExecuteActionIdsBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureExecuteActionIdsIsMutable();
            this.executeActionIds_.add(byteString.toStringUtf8());
        }

        private void clearExecuteActionIds() {
            this.executeActionIds_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearPaneDisabled() {
            this.paneDisabled_ = false;
        }

        private void clearShowTransition() {
            this.showTransition_ = false;
        }

        private void ensureExecuteActionIdsIsMutable() {
            Internal.ProtobufList<String> protobufList = this.executeActionIds_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.executeActionIds_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static RenderingOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6996a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static RenderingOptions parseDelimitedFrom(InputStream inputStream) {
            return (RenderingOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RenderingOptions parseFrom(ByteBuffer byteBuffer) {
            return (RenderingOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<RenderingOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setExecuteActionIds(int i, String str) {
            str.getClass();
            ensureExecuteActionIdsIsMutable();
            this.executeActionIds_.set(i, str);
        }

        private void setPaneDisabled(boolean z) {
            this.paneDisabled_ = z;
        }

        private void setShowTransition(boolean z) {
            this.showTransition_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C7036p.f2698a[methodToInvoke.ordinal()]) {
                case 1:
                    return new RenderingOptions();
                case 2:
                    return new C6996a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0007\u0002\u0007\u0003Ț", new Object[]{"paneDisabled_", "showTransition_", "executeActionIds_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RenderingOptions> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (RenderingOptions.class) {
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

        public String getExecuteActionIds(int i) {
            return this.executeActionIds_.get(i);
        }

        public ByteString getExecuteActionIdsBytes(int i) {
            return ByteString.copyFromUtf8(this.executeActionIds_.get(i));
        }

        public int getExecuteActionIdsCount() {
            return this.executeActionIds_.size();
        }

        public List<String> getExecuteActionIdsList() {
            return this.executeActionIds_;
        }

        public boolean getPaneDisabled() {
            return this.paneDisabled_;
        }

        public boolean getShowTransition() {
            return this.showTransition_;
        }

        public static C6996a newBuilder(RenderingOptions renderingOptions) {
            return DEFAULT_INSTANCE.createBuilder(renderingOptions);
        }

        public static RenderingOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RenderingOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RenderingOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (RenderingOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RenderingOptions parseFrom(ByteString byteString) {
            return (RenderingOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RenderingOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (RenderingOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RenderingOptions parseFrom(byte[] bArr) {
            return (RenderingOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RenderingOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (RenderingOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RenderingOptions parseFrom(InputStream inputStream) {
            return (RenderingOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RenderingOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RenderingOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RenderingOptions parseFrom(CodedInputStream codedInputStream) {
            return (RenderingOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RenderingOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RenderingOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview$a */
    public static final class C6997a extends GeneratedMessageLite.Builder<PreviewOuterClass$Preview, C6997a> implements MessageLiteOrBuilder {
        public C6997a() {
            super(PreviewOuterClass$Preview.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview$b */
    public enum EnumC6998b implements Internal.EnumLite {
        PREVIEW_PRESET_UNKNOWN(0),
        PREVIEW_PRESET_ACCOUNT_NUMBER_PANE(1),
        PREVIEW_PRESET_ACCOUNT_SELECT_PANE(2),
        PREVIEW_PRESET_CONNECTED_PANE(3),
        PREVIEW_PRESET_CREDENTIAL_PANE(4),
        PREVIEW_PRESET_ERROR_PANE(5),
        PREVIEW_PRESET_EUCONSENT_PANE(6),
        PREVIEW_PRESET_EXIT_PANE(7),
        PREVIEW_PRESET_INSTITUTION_SEARCH_PANE(8),
        PREVIEW_PRESET_INSTITUTION_SELECT_PANE(9),
        PREVIEW_PRESET_LOADING_PANE(10),
        PREVIEW_PRESET_MANUAL_VERIFICATION_OF_INCOME_UPLOAD_START_PANE(11),
        PREVIEW_PRESET_MANUAL_VERIFICATION_OF_INCOME_UPLOAD_REVIEW_PANE(13),
        PREVIEW_PRESET_MFA_DEVICE_PANE(14),
        PREVIEW_PRESET_MFA_QUESTION_PANE(15),
        PREVIEW_PRESET_MFA_SELECTION_PANE(16),
        PREVIEW_PRESET_OAUTH_LOADING_PANE(17),
        PREVIEW_PRESET_PRIVACY_INTERSTITIAL_PANE(18),
        PREVIEW_PRESET_RECAPTCHA_PANE(19),
        PREVIEW_PRESET_RECONNECTED_PANE(20),
        PREVIEW_PRESET_ROUTING_NUMBER_PANE(21),
        PREVIEW_PRESET_PRODUCT_SCOPES_TRANSPARENCY_PANE(22),
        PREVIEW_PRESET_PRODUCT_SCOPES_TRANSPARENCY_UPDATE_PANE(23),
        PREVIEW_PRESET_EU_EDUCATION_PANE(24),
        PREVIEW_PRESET_WEB3_PINNED_WALLETS_PANE(25),
        PREVIEW_PRESET_PRODUCT_SCOPES_TRANSPARENCY_V4_PANE(26),
        PREVIEW_PRESET_DTM_PANE(27),
        PREVIEW_PRESET_LAYER_CONSENT_PANE(28),
        UNRECOGNIZED(-1);

        public static final int PREVIEW_PRESET_ACCOUNT_NUMBER_PANE_VALUE = 1;
        public static final int PREVIEW_PRESET_ACCOUNT_SELECT_PANE_VALUE = 2;
        public static final int PREVIEW_PRESET_CONNECTED_PANE_VALUE = 3;
        public static final int PREVIEW_PRESET_CREDENTIAL_PANE_VALUE = 4;
        public static final int PREVIEW_PRESET_DTM_PANE_VALUE = 27;
        public static final int PREVIEW_PRESET_ERROR_PANE_VALUE = 5;
        public static final int PREVIEW_PRESET_EUCONSENT_PANE_VALUE = 6;
        public static final int PREVIEW_PRESET_EU_EDUCATION_PANE_VALUE = 24;
        public static final int PREVIEW_PRESET_EXIT_PANE_VALUE = 7;
        public static final int PREVIEW_PRESET_INSTITUTION_SEARCH_PANE_VALUE = 8;
        public static final int PREVIEW_PRESET_INSTITUTION_SELECT_PANE_VALUE = 9;
        public static final int PREVIEW_PRESET_LAYER_CONSENT_PANE_VALUE = 28;
        public static final int PREVIEW_PRESET_LOADING_PANE_VALUE = 10;

        /* renamed from: PREVIEW_PRESET_MANUAL_VERIFICATION_OF_INCOME_UPLOAD_REVIEW_PANE_VALUE */
        public static final int f2632x33fc2e5 = 13;

        /* renamed from: PREVIEW_PRESET_MANUAL_VERIFICATION_OF_INCOME_UPLOAD_START_PANE_VALUE */
        public static final int f2633xfbaf5373 = 11;
        public static final int PREVIEW_PRESET_MFA_DEVICE_PANE_VALUE = 14;
        public static final int PREVIEW_PRESET_MFA_QUESTION_PANE_VALUE = 15;
        public static final int PREVIEW_PRESET_MFA_SELECTION_PANE_VALUE = 16;
        public static final int PREVIEW_PRESET_OAUTH_LOADING_PANE_VALUE = 17;
        public static final int PREVIEW_PRESET_PRIVACY_INTERSTITIAL_PANE_VALUE = 18;
        public static final int PREVIEW_PRESET_PRODUCT_SCOPES_TRANSPARENCY_PANE_VALUE = 22;
        public static final int PREVIEW_PRESET_PRODUCT_SCOPES_TRANSPARENCY_UPDATE_PANE_VALUE = 23;
        public static final int PREVIEW_PRESET_PRODUCT_SCOPES_TRANSPARENCY_V4_PANE_VALUE = 26;
        public static final int PREVIEW_PRESET_RECAPTCHA_PANE_VALUE = 19;
        public static final int PREVIEW_PRESET_RECONNECTED_PANE_VALUE = 20;
        public static final int PREVIEW_PRESET_ROUTING_NUMBER_PANE_VALUE = 21;
        public static final int PREVIEW_PRESET_UNKNOWN_VALUE = 0;
        public static final int PREVIEW_PRESET_WEB3_PINNED_WALLETS_PANE_VALUE = 25;

        /* renamed from: b */
        public static final a f2634b = new a();

        /* renamed from: a */
        public final int f2636a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview$b$a */
        public class a implements Internal.EnumLiteMap<EnumC6998b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6998b.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview$b$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f2637a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6998b.forNumber(i) != null;
            }
        }

        EnumC6998b(int i) {
            this.f2636a = i;
        }

        public static EnumC6998b forNumber(int i) {
            switch (i) {
                case 0:
                    return PREVIEW_PRESET_UNKNOWN;
                case 1:
                    return PREVIEW_PRESET_ACCOUNT_NUMBER_PANE;
                case 2:
                    return PREVIEW_PRESET_ACCOUNT_SELECT_PANE;
                case 3:
                    return PREVIEW_PRESET_CONNECTED_PANE;
                case 4:
                    return PREVIEW_PRESET_CREDENTIAL_PANE;
                case 5:
                    return PREVIEW_PRESET_ERROR_PANE;
                case 6:
                    return PREVIEW_PRESET_EUCONSENT_PANE;
                case 7:
                    return PREVIEW_PRESET_EXIT_PANE;
                case 8:
                    return PREVIEW_PRESET_INSTITUTION_SEARCH_PANE;
                case 9:
                    return PREVIEW_PRESET_INSTITUTION_SELECT_PANE;
                case 10:
                    return PREVIEW_PRESET_LOADING_PANE;
                case 11:
                    return PREVIEW_PRESET_MANUAL_VERIFICATION_OF_INCOME_UPLOAD_START_PANE;
                case 12:
                default:
                    return null;
                case 13:
                    return PREVIEW_PRESET_MANUAL_VERIFICATION_OF_INCOME_UPLOAD_REVIEW_PANE;
                case 14:
                    return PREVIEW_PRESET_MFA_DEVICE_PANE;
                case 15:
                    return PREVIEW_PRESET_MFA_QUESTION_PANE;
                case 16:
                    return PREVIEW_PRESET_MFA_SELECTION_PANE;
                case 17:
                    return PREVIEW_PRESET_OAUTH_LOADING_PANE;
                case 18:
                    return PREVIEW_PRESET_PRIVACY_INTERSTITIAL_PANE;
                case 19:
                    return PREVIEW_PRESET_RECAPTCHA_PANE;
                case 20:
                    return PREVIEW_PRESET_RECONNECTED_PANE;
                case 21:
                    return PREVIEW_PRESET_ROUTING_NUMBER_PANE;
                case 22:
                    return PREVIEW_PRESET_PRODUCT_SCOPES_TRANSPARENCY_PANE;
                case 23:
                    return PREVIEW_PRESET_PRODUCT_SCOPES_TRANSPARENCY_UPDATE_PANE;
                case 24:
                    return PREVIEW_PRESET_EU_EDUCATION_PANE;
                case 25:
                    return PREVIEW_PRESET_WEB3_PINNED_WALLETS_PANE;
                case 26:
                    return PREVIEW_PRESET_PRODUCT_SCOPES_TRANSPARENCY_V4_PANE;
                case 27:
                    return PREVIEW_PRESET_DTM_PANE;
                case 28:
                    return PREVIEW_PRESET_LAYER_CONSENT_PANE;
            }
        }

        public static Internal.EnumLiteMap<EnumC6998b> internalGetValueMap() {
            return f2634b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f2637a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f2636a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC6998b valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview$c */
    public enum EnumC6999c implements Internal.EnumLite {
        PREVIEW_SCENARIO_UNKNOWN(0),
        PREVIEW_SCENARIO_ACCOUNT_SELECT_V2(1),
        PREVIEW_SCENARIO_SCROLLED_TO_BOTTOM(2),
        PREVIEW_SCENARIO_ENTERING_CODE(3),
        PREVIEW_SCENARIO_NO_RESULTS(4),
        PREVIEW_SCENARIO_UPDATE_MODE(5),
        PREVIEW_SCENARIO_PST_CONSENT(6),
        PREVIEW_SCENARIO_PST_CONSENT_MODAL_OPEN(7),
        PREVIEW_SCENARIO_DTM_MODAL_OPEN(8),
        UNRECOGNIZED(-1);

        public static final int PREVIEW_SCENARIO_ACCOUNT_SELECT_V2_VALUE = 1;
        public static final int PREVIEW_SCENARIO_DTM_MODAL_OPEN_VALUE = 8;
        public static final int PREVIEW_SCENARIO_ENTERING_CODE_VALUE = 3;
        public static final int PREVIEW_SCENARIO_NO_RESULTS_VALUE = 4;
        public static final int PREVIEW_SCENARIO_PST_CONSENT_MODAL_OPEN_VALUE = 7;
        public static final int PREVIEW_SCENARIO_PST_CONSENT_VALUE = 6;
        public static final int PREVIEW_SCENARIO_SCROLLED_TO_BOTTOM_VALUE = 2;
        public static final int PREVIEW_SCENARIO_UNKNOWN_VALUE = 0;
        public static final int PREVIEW_SCENARIO_UPDATE_MODE_VALUE = 5;

        /* renamed from: b */
        public static final a f2638b = new a();

        /* renamed from: a */
        public final int f2640a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview$c$a */
        public class a implements Internal.EnumLiteMap<EnumC6999c> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6999c.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview$c$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f2641a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6999c.forNumber(i) != null;
            }
        }

        EnumC6999c(int i) {
            this.f2640a = i;
        }

        public static EnumC6999c forNumber(int i) {
            switch (i) {
                case 0:
                    return PREVIEW_SCENARIO_UNKNOWN;
                case 1:
                    return PREVIEW_SCENARIO_ACCOUNT_SELECT_V2;
                case 2:
                    return PREVIEW_SCENARIO_SCROLLED_TO_BOTTOM;
                case 3:
                    return PREVIEW_SCENARIO_ENTERING_CODE;
                case 4:
                    return PREVIEW_SCENARIO_NO_RESULTS;
                case 5:
                    return PREVIEW_SCENARIO_UPDATE_MODE;
                case 6:
                    return PREVIEW_SCENARIO_PST_CONSENT;
                case 7:
                    return PREVIEW_SCENARIO_PST_CONSENT_MODAL_OPEN;
                case 8:
                    return PREVIEW_SCENARIO_DTM_MODAL_OPEN;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<EnumC6999c> internalGetValueMap() {
            return f2638b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f2641a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f2640a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC6999c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        PreviewOuterClass$Preview previewOuterClass$Preview = new PreviewOuterClass$Preview();
        DEFAULT_INSTANCE = previewOuterClass$Preview;
        GeneratedMessageLite.registerDefaultInstance(PreviewOuterClass$Preview.class, previewOuterClass$Preview);
    }

    private PreviewOuterClass$Preview() {
    }

    private void addAllProducts(Iterable<String> iterable) {
        ensureProductsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.products_);
    }

    private void addProducts(String str) {
        str.getClass();
        ensureProductsIsMutable();
        this.products_.add(str);
    }

    private void addProductsBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureProductsIsMutable();
        this.products_.add(byteString.toStringUtf8());
    }

    private void clearCobrandingConfig() {
        this.cobrandingConfig_ = null;
        this.bitField0_ &= -9;
    }

    private void clearError() {
        this.error_ = null;
        this.bitField0_ &= -5;
    }

    private void clearLinkCustomization() {
        this.linkCustomization_ = null;
        this.bitField0_ &= -3;
    }

    private void clearLocale() {
        this.locale_ = null;
        this.bitField0_ &= -2;
    }

    private void clearPreset() {
        this.preset_ = 0;
    }

    private void clearProducts() {
        this.products_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearScenario() {
        this.scenario_ = 0;
    }

    private void ensureProductsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.products_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.products_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static PreviewOuterClass$Preview getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeCobrandingConfig(CobrandingConfig cobrandingConfig) {
        cobrandingConfig.getClass();
        CobrandingConfig cobrandingConfig2 = this.cobrandingConfig_;
        if (cobrandingConfig2 == null || cobrandingConfig2 == CobrandingConfig.getDefaultInstance()) {
            this.cobrandingConfig_ = cobrandingConfig;
        } else {
            this.cobrandingConfig_ = CobrandingConfig.newBuilder(this.cobrandingConfig_).mergeFrom((CobrandingConfig.C6994a) cobrandingConfig).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    private void mergeError(Error error) {
        error.getClass();
        Error error2 = this.error_;
        if (error2 == null || error2 == Error.getDefaultInstance()) {
            this.error_ = error;
        } else {
            this.error_ = Error.newBuilder(this.error_).mergeFrom((Error.C6995a) error).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    private void mergeLinkCustomization(LinkCustomizations$LinkCustomization linkCustomizations$LinkCustomization) {
        linkCustomizations$LinkCustomization.getClass();
        LinkCustomizations$LinkCustomization linkCustomizations$LinkCustomization2 = this.linkCustomization_;
        if (linkCustomizations$LinkCustomization2 == null || linkCustomizations$LinkCustomization2 == LinkCustomizations$LinkCustomization.getDefaultInstance()) {
            this.linkCustomization_ = linkCustomizations$LinkCustomization;
        } else {
            this.linkCustomization_ = LinkCustomizations$LinkCustomization.newBuilder(this.linkCustomization_).mergeFrom((LinkCustomizations$LinkCustomization.C6067d) linkCustomizations$LinkCustomization).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeLocale(LocaleOuterClass$Locale localeOuterClass$Locale) {
        localeOuterClass$Locale.getClass();
        LocaleOuterClass$Locale localeOuterClass$Locale2 = this.locale_;
        if (localeOuterClass$Locale2 == null || localeOuterClass$Locale2 == LocaleOuterClass$Locale.getDefaultInstance()) {
            this.locale_ = localeOuterClass$Locale;
        } else {
            this.locale_ = LocaleOuterClass$Locale.newBuilder(this.locale_).mergeFrom((LocaleOuterClass$Locale.C6991a) localeOuterClass$Locale).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C6997a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PreviewOuterClass$Preview parseDelimitedFrom(InputStream inputStream) {
        return (PreviewOuterClass$Preview) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PreviewOuterClass$Preview parseFrom(ByteBuffer byteBuffer) {
        return (PreviewOuterClass$Preview) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PreviewOuterClass$Preview> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCobrandingConfig(CobrandingConfig cobrandingConfig) {
        cobrandingConfig.getClass();
        this.cobrandingConfig_ = cobrandingConfig;
        this.bitField0_ |= 8;
    }

    private void setError(Error error) {
        error.getClass();
        this.error_ = error;
        this.bitField0_ |= 4;
    }

    private void setLinkCustomization(LinkCustomizations$LinkCustomization linkCustomizations$LinkCustomization) {
        linkCustomizations$LinkCustomization.getClass();
        this.linkCustomization_ = linkCustomizations$LinkCustomization;
        this.bitField0_ |= 2;
    }

    private void setLocale(LocaleOuterClass$Locale localeOuterClass$Locale) {
        localeOuterClass$Locale.getClass();
        this.locale_ = localeOuterClass$Locale;
        this.bitField0_ |= 1;
    }

    private void setPreset(EnumC6998b enumC6998b) {
        this.preset_ = enumC6998b.getNumber();
    }

    private void setPresetValue(int i) {
        this.preset_ = i;
    }

    private void setProducts(int i, String str) {
        str.getClass();
        ensureProductsIsMutable();
        this.products_.set(i, str);
    }

    private void setScenario(EnumC6999c enumC6999c) {
        this.scenario_ = enumC6999c.getNumber();
    }

    private void setScenarioValue(int i) {
        this.scenario_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C7036p.f2698a[methodToInvoke.ordinal()]) {
            case 1:
                return new PreviewOuterClass$Preview();
            case 2:
                return new C6997a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\f\u0002\f\u0003Ț\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0003\u0007ဉ\u0002", new Object[]{"bitField0_", "preset_", "scenario_", "products_", "locale_", "linkCustomization_", "cobrandingConfig_", "error_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PreviewOuterClass$Preview> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (PreviewOuterClass$Preview.class) {
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

    public CobrandingConfig getCobrandingConfig() {
        CobrandingConfig cobrandingConfig = this.cobrandingConfig_;
        return cobrandingConfig == null ? CobrandingConfig.getDefaultInstance() : cobrandingConfig;
    }

    public Error getError() {
        Error error = this.error_;
        return error == null ? Error.getDefaultInstance() : error;
    }

    public LinkCustomizations$LinkCustomization getLinkCustomization() {
        LinkCustomizations$LinkCustomization linkCustomizations$LinkCustomization = this.linkCustomization_;
        return linkCustomizations$LinkCustomization == null ? LinkCustomizations$LinkCustomization.getDefaultInstance() : linkCustomizations$LinkCustomization;
    }

    public LocaleOuterClass$Locale getLocale() {
        LocaleOuterClass$Locale localeOuterClass$Locale = this.locale_;
        return localeOuterClass$Locale == null ? LocaleOuterClass$Locale.getDefaultInstance() : localeOuterClass$Locale;
    }

    public EnumC6998b getPreset() {
        EnumC6998b enumC6998bForNumber = EnumC6998b.forNumber(this.preset_);
        return enumC6998bForNumber == null ? EnumC6998b.UNRECOGNIZED : enumC6998bForNumber;
    }

    public int getPresetValue() {
        return this.preset_;
    }

    public String getProducts(int i) {
        return this.products_.get(i);
    }

    public ByteString getProductsBytes(int i) {
        return ByteString.copyFromUtf8(this.products_.get(i));
    }

    public int getProductsCount() {
        return this.products_.size();
    }

    public List<String> getProductsList() {
        return this.products_;
    }

    public EnumC6999c getScenario() {
        EnumC6999c enumC6999cForNumber = EnumC6999c.forNumber(this.scenario_);
        return enumC6999cForNumber == null ? EnumC6999c.UNRECOGNIZED : enumC6999cForNumber;
    }

    public int getScenarioValue() {
        return this.scenario_;
    }

    public boolean hasCobrandingConfig() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasError() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasLinkCustomization() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasLocale() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C6997a newBuilder(PreviewOuterClass$Preview previewOuterClass$Preview) {
        return DEFAULT_INSTANCE.createBuilder(previewOuterClass$Preview);
    }

    public static PreviewOuterClass$Preview parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (PreviewOuterClass$Preview) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PreviewOuterClass$Preview parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (PreviewOuterClass$Preview) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PreviewOuterClass$Preview parseFrom(ByteString byteString) {
        return (PreviewOuterClass$Preview) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PreviewOuterClass$Preview parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (PreviewOuterClass$Preview) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PreviewOuterClass$Preview parseFrom(byte[] bArr) {
        return (PreviewOuterClass$Preview) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PreviewOuterClass$Preview parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (PreviewOuterClass$Preview) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PreviewOuterClass$Preview parseFrom(InputStream inputStream) {
        return (PreviewOuterClass$Preview) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PreviewOuterClass$Preview parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (PreviewOuterClass$Preview) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PreviewOuterClass$Preview parseFrom(CodedInputStream codedInputStream) {
        return (PreviewOuterClass$Preview) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PreviewOuterClass$Preview parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (PreviewOuterClass$Preview) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
