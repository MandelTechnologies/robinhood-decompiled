package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Common$AnimatedCoBrandedHeader extends GeneratedMessageLite<Common$AnimatedCoBrandedHeader, C6387a> implements MessageLiteOrBuilder {
    public static final int ANIMATION_OPTIONS_FIELD_NUMBER = 6;
    public static final int CLIENT_LOGO_FIELD_NUMBER = 1;
    private static final Common$AnimatedCoBrandedHeader DEFAULT_INSTANCE;
    public static final int GLOW_ARC_CONFIGURATION_FIELD_NUMBER = 5;
    public static final int HEADER_TEXT_FIELD_NUMBER = 4;
    private static volatile Parser<Common$AnimatedCoBrandedHeader> PARSER = null;
    public static final int PLAID_LOGO_FIELD_NUMBER = 2;
    public static final int SUBHEADER_FIELD_NUMBER = 3;
    private AnimationOptions animationOptions_;
    private int bitField0_;
    private Common$RenderedAssetAppearance clientLogo_;
    private GlowArcConfiguration glowArcConfiguration_;
    private Common$TextContent headerText_;
    private Common$RenderedAssetAppearance plaidLogo_;
    private Common$TextContent subheader_;

    public static final class AnimationOptions extends GeneratedMessageLite<AnimationOptions, C6385a> implements MessageLiteOrBuilder {
        private static final AnimationOptions DEFAULT_INSTANCE;
        private static volatile Parser<AnimationOptions> PARSER = null;
        public static final int START_DELAY_MS_FIELD_NUMBER = 1;
        private int startDelayMs_;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader$AnimationOptions$a */
        public static final class C6385a extends GeneratedMessageLite.Builder<AnimationOptions, C6385a> implements MessageLiteOrBuilder {
            public C6385a() {
                super(AnimationOptions.DEFAULT_INSTANCE);
            }
        }

        static {
            AnimationOptions animationOptions = new AnimationOptions();
            DEFAULT_INSTANCE = animationOptions;
            GeneratedMessageLite.registerDefaultInstance(AnimationOptions.class, animationOptions);
        }

        private AnimationOptions() {
        }

        private void clearStartDelayMs() {
            this.startDelayMs_ = 0;
        }

        public static AnimationOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6385a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AnimationOptions parseDelimitedFrom(InputStream inputStream) {
            return (AnimationOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AnimationOptions parseFrom(ByteString byteString) {
            return (AnimationOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Parser<AnimationOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setStartDelayMs(int i) {
            this.startDelayMs_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AnimationOptions();
                case 2:
                    return new C6385a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"startDelayMs_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AnimationOptions> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (AnimationOptions.class) {
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

        public int getStartDelayMs() {
            return this.startDelayMs_;
        }

        public static C6385a newBuilder(AnimationOptions animationOptions) {
            return DEFAULT_INSTANCE.createBuilder(animationOptions);
        }

        public static AnimationOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AnimationOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AnimationOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (AnimationOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AnimationOptions parseFrom(CodedInputStream codedInputStream) {
            return (AnimationOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AnimationOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AnimationOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static AnimationOptions parseFrom(InputStream inputStream) {
            return (AnimationOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AnimationOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AnimationOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AnimationOptions parseFrom(ByteBuffer byteBuffer) {
            return (AnimationOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static AnimationOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (AnimationOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AnimationOptions parseFrom(byte[] bArr) {
            return (AnimationOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AnimationOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (AnimationOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }
    }

    public static final class GlowArcConfiguration extends GeneratedMessageLite<GlowArcConfiguration, C6386a> implements MessageLiteOrBuilder {
        public static final int COLOR_FIELD_NUMBER = 2;
        private static final GlowArcConfiguration DEFAULT_INSTANCE;
        public static final int IS_VISIBLE_FIELD_NUMBER = 1;
        private static volatile Parser<GlowArcConfiguration> PARSER;
        private String color_ = "";
        private boolean isVisible_;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader$GlowArcConfiguration$a */
        public static final class C6386a extends GeneratedMessageLite.Builder<GlowArcConfiguration, C6386a> implements MessageLiteOrBuilder {
            public C6386a() {
                super(GlowArcConfiguration.DEFAULT_INSTANCE);
            }
        }

        static {
            GlowArcConfiguration glowArcConfiguration = new GlowArcConfiguration();
            DEFAULT_INSTANCE = glowArcConfiguration;
            GeneratedMessageLite.registerDefaultInstance(GlowArcConfiguration.class, glowArcConfiguration);
        }

        private GlowArcConfiguration() {
        }

        private void clearColor() {
            this.color_ = getDefaultInstance().getColor();
        }

        private void clearIsVisible() {
            this.isVisible_ = false;
        }

        public static GlowArcConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6386a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GlowArcConfiguration parseDelimitedFrom(InputStream inputStream) {
            return (GlowArcConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GlowArcConfiguration parseFrom(ByteString byteString) {
            return (GlowArcConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Parser<GlowArcConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setColor(String str) {
            str.getClass();
            this.color_ = str;
        }

        private void setColorBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.color_ = byteString.toStringUtf8();
        }

        private void setIsVisible(boolean z) {
            this.isVisible_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                case 1:
                    return new GlowArcConfiguration();
                case 2:
                    return new C6386a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002Ȉ", new Object[]{"isVisible_", "color_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<GlowArcConfiguration> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (GlowArcConfiguration.class) {
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

        public String getColor() {
            return this.color_;
        }

        public ByteString getColorBytes() {
            return ByteString.copyFromUtf8(this.color_);
        }

        public boolean getIsVisible() {
            return this.isVisible_;
        }

        public static C6386a newBuilder(GlowArcConfiguration glowArcConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(glowArcConfiguration);
        }

        public static GlowArcConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GlowArcConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GlowArcConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (GlowArcConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GlowArcConfiguration parseFrom(CodedInputStream codedInputStream) {
            return (GlowArcConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GlowArcConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GlowArcConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static GlowArcConfiguration parseFrom(InputStream inputStream) {
            return (GlowArcConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GlowArcConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GlowArcConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GlowArcConfiguration parseFrom(ByteBuffer byteBuffer) {
            return (GlowArcConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static GlowArcConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (GlowArcConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GlowArcConfiguration parseFrom(byte[] bArr) {
            return (GlowArcConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GlowArcConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (GlowArcConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AnimatedCoBrandedHeader$a */
    public static final class C6387a extends GeneratedMessageLite.Builder<Common$AnimatedCoBrandedHeader, C6387a> implements MessageLiteOrBuilder {
        public C6387a() {
            super(Common$AnimatedCoBrandedHeader.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$AnimatedCoBrandedHeader common$AnimatedCoBrandedHeader = new Common$AnimatedCoBrandedHeader();
        DEFAULT_INSTANCE = common$AnimatedCoBrandedHeader;
        GeneratedMessageLite.registerDefaultInstance(Common$AnimatedCoBrandedHeader.class, common$AnimatedCoBrandedHeader);
    }

    private Common$AnimatedCoBrandedHeader() {
    }

    private void clearAnimationOptions() {
        this.animationOptions_ = null;
        this.bitField0_ &= -33;
    }

    private void clearClientLogo() {
        this.clientLogo_ = null;
        this.bitField0_ &= -2;
    }

    private void clearGlowArcConfiguration() {
        this.glowArcConfiguration_ = null;
        this.bitField0_ &= -17;
    }

    private void clearHeaderText() {
        this.headerText_ = null;
        this.bitField0_ &= -9;
    }

    private void clearPlaidLogo() {
        this.plaidLogo_ = null;
        this.bitField0_ &= -3;
    }

    private void clearSubheader() {
        this.subheader_ = null;
        this.bitField0_ &= -5;
    }

    public static Common$AnimatedCoBrandedHeader getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeAnimationOptions(AnimationOptions animationOptions) {
        animationOptions.getClass();
        AnimationOptions animationOptions2 = this.animationOptions_;
        if (animationOptions2 != null && animationOptions2 != AnimationOptions.getDefaultInstance()) {
            animationOptions = AnimationOptions.newBuilder(this.animationOptions_).mergeFrom((AnimationOptions.C6385a) animationOptions).buildPartial();
        }
        this.animationOptions_ = animationOptions;
        this.bitField0_ |= 32;
    }

    private void mergeClientLogo(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.clientLogo_;
        if (common$RenderedAssetAppearance2 != null && common$RenderedAssetAppearance2 != Common$RenderedAssetAppearance.getDefaultInstance()) {
            common$RenderedAssetAppearance = Common$RenderedAssetAppearance.newBuilder(this.clientLogo_).mergeFrom((Common$RenderedAssetAppearance.C6475a) common$RenderedAssetAppearance).buildPartial();
        }
        this.clientLogo_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 1;
    }

    private void mergeGlowArcConfiguration(GlowArcConfiguration glowArcConfiguration) {
        glowArcConfiguration.getClass();
        GlowArcConfiguration glowArcConfiguration2 = this.glowArcConfiguration_;
        if (glowArcConfiguration2 != null && glowArcConfiguration2 != GlowArcConfiguration.getDefaultInstance()) {
            glowArcConfiguration = GlowArcConfiguration.newBuilder(this.glowArcConfiguration_).mergeFrom((GlowArcConfiguration.C6386a) glowArcConfiguration).buildPartial();
        }
        this.glowArcConfiguration_ = glowArcConfiguration;
        this.bitField0_ |= 16;
    }

    private void mergeHeaderText(Common$TextContent common$TextContent) {
        common$TextContent.getClass();
        Common$TextContent common$TextContent2 = this.headerText_;
        if (common$TextContent2 != null && common$TextContent2 != Common$TextContent.getDefaultInstance()) {
            common$TextContent = Common$TextContent.newBuilder(this.headerText_).mergeFrom((Common$TextContent.C6509c) common$TextContent).buildPartial();
        }
        this.headerText_ = common$TextContent;
        this.bitField0_ |= 8;
    }

    private void mergePlaidLogo(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.plaidLogo_;
        if (common$RenderedAssetAppearance2 != null && common$RenderedAssetAppearance2 != Common$RenderedAssetAppearance.getDefaultInstance()) {
            common$RenderedAssetAppearance = Common$RenderedAssetAppearance.newBuilder(this.plaidLogo_).mergeFrom((Common$RenderedAssetAppearance.C6475a) common$RenderedAssetAppearance).buildPartial();
        }
        this.plaidLogo_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 2;
    }

    private void mergeSubheader(Common$TextContent common$TextContent) {
        common$TextContent.getClass();
        Common$TextContent common$TextContent2 = this.subheader_;
        if (common$TextContent2 != null && common$TextContent2 != Common$TextContent.getDefaultInstance()) {
            common$TextContent = Common$TextContent.newBuilder(this.subheader_).mergeFrom((Common$TextContent.C6509c) common$TextContent).buildPartial();
        }
        this.subheader_ = common$TextContent;
        this.bitField0_ |= 4;
    }

    public static C6387a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$AnimatedCoBrandedHeader parseDelimitedFrom(InputStream inputStream) {
        return (Common$AnimatedCoBrandedHeader) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$AnimatedCoBrandedHeader parseFrom(ByteString byteString) {
        return (Common$AnimatedCoBrandedHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$AnimatedCoBrandedHeader> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAnimationOptions(AnimationOptions animationOptions) {
        animationOptions.getClass();
        this.animationOptions_ = animationOptions;
        this.bitField0_ |= 32;
    }

    private void setClientLogo(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.clientLogo_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 1;
    }

    private void setGlowArcConfiguration(GlowArcConfiguration glowArcConfiguration) {
        glowArcConfiguration.getClass();
        this.glowArcConfiguration_ = glowArcConfiguration;
        this.bitField0_ |= 16;
    }

    private void setHeaderText(Common$TextContent common$TextContent) {
        common$TextContent.getClass();
        this.headerText_ = common$TextContent;
        this.bitField0_ |= 8;
    }

    private void setPlaidLogo(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.plaidLogo_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 2;
    }

    private void setSubheader(Common$TextContent common$TextContent) {
        common$TextContent.getClass();
        this.subheader_ = common$TextContent;
        this.bitField0_ |= 4;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$AnimatedCoBrandedHeader();
            case 2:
                return new C6387a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"bitField0_", "clientLogo_", "plaidLogo_", "subheader_", "headerText_", "glowArcConfiguration_", "animationOptions_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$AnimatedCoBrandedHeader> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$AnimatedCoBrandedHeader.class) {
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

    public AnimationOptions getAnimationOptions() {
        AnimationOptions animationOptions = this.animationOptions_;
        return animationOptions == null ? AnimationOptions.getDefaultInstance() : animationOptions;
    }

    public Common$RenderedAssetAppearance getClientLogo() {
        Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.clientLogo_;
        return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public GlowArcConfiguration getGlowArcConfiguration() {
        GlowArcConfiguration glowArcConfiguration = this.glowArcConfiguration_;
        return glowArcConfiguration == null ? GlowArcConfiguration.getDefaultInstance() : glowArcConfiguration;
    }

    public Common$TextContent getHeaderText() {
        Common$TextContent common$TextContent = this.headerText_;
        return common$TextContent == null ? Common$TextContent.getDefaultInstance() : common$TextContent;
    }

    public Common$RenderedAssetAppearance getPlaidLogo() {
        Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.plaidLogo_;
        return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public Common$TextContent getSubheader() {
        Common$TextContent common$TextContent = this.subheader_;
        return common$TextContent == null ? Common$TextContent.getDefaultInstance() : common$TextContent;
    }

    public boolean hasAnimationOptions() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasClientLogo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasGlowArcConfiguration() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasHeaderText() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasPlaidLogo() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSubheader() {
        return (this.bitField0_ & 4) != 0;
    }

    public static C6387a newBuilder(Common$AnimatedCoBrandedHeader common$AnimatedCoBrandedHeader) {
        return DEFAULT_INSTANCE.createBuilder(common$AnimatedCoBrandedHeader);
    }

    public static Common$AnimatedCoBrandedHeader parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AnimatedCoBrandedHeader) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$AnimatedCoBrandedHeader parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AnimatedCoBrandedHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$AnimatedCoBrandedHeader parseFrom(CodedInputStream codedInputStream) {
        return (Common$AnimatedCoBrandedHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$AnimatedCoBrandedHeader parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AnimatedCoBrandedHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$AnimatedCoBrandedHeader parseFrom(InputStream inputStream) {
        return (Common$AnimatedCoBrandedHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$AnimatedCoBrandedHeader parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AnimatedCoBrandedHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$AnimatedCoBrandedHeader parseFrom(ByteBuffer byteBuffer) {
        return (Common$AnimatedCoBrandedHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$AnimatedCoBrandedHeader parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AnimatedCoBrandedHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$AnimatedCoBrandedHeader parseFrom(byte[] bArr) {
        return (Common$AnimatedCoBrandedHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$AnimatedCoBrandedHeader parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AnimatedCoBrandedHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
