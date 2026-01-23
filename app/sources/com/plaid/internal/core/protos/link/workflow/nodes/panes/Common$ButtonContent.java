package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Common$ButtonContent extends GeneratedMessageLite<Common$ButtonContent, C6409a> implements MessageLiteOrBuilder {
    public static final int ACTION_OVERRIDE_FIELD_NUMBER = 6;
    public static final int CLIENT_CUSTOMIZATIONS_FIELD_NUMBER = 10;
    private static final Common$ButtonContent DEFAULT_INSTANCE;
    public static final int DISABLE_FOR_FIELD_NUMBER = 11;
    public static final int ICON_FIELD_NUMBER = 5;
    private static volatile Parser<Common$ButtonContent> PARSER = null;
    public static final int SECONDARY_TEXT_FIELD_NUMBER = 4;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_ALIGNMENT_IS_LEADING_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int TRAILING_ICON_FIELD_NUMBER = 9;
    public static final int WEIGHT_FIELD_NUMBER = 8;
    private Common$LocalAction actionOverride_;
    private int bitField0_;
    private ClientCustomizations clientCustomizations_;
    private DisableFor disableFor_;
    private Common$RenderedAssetAppearance icon_;
    private Common$LocalizedString secondaryText_;
    private Common$LocalizedString subtitle_;
    private boolean titleAlignmentIsLeading_;
    private Common$LocalizedString title_;
    private Common$RenderedAssetAppearance trailingIcon_;
    private int weight_;

    public static final class ClientCustomizations extends GeneratedMessageLite<ClientCustomizations, C6406a> implements MessageLiteOrBuilder {
        public static final int BORDER_RADIUS_FIELD_NUMBER = 2;
        public static final int COLOR_DARK_APPEARANCE_FIELD_NUMBER = 12;
        public static final int COLOR_FIELD_NUMBER = 1;
        public static final int COLOR_HOVER_DARK_APPEARANCE_FIELD_NUMBER = 13;
        public static final int COLOR_HOVER_FIELD_NUMBER = 3;
        private static final ClientCustomizations DEFAULT_INSTANCE;
        public static final int FONT_WEIGHT_FIELD_NUMBER = 5;
        private static volatile Parser<ClientCustomizations> PARSER = null;
        public static final int TEXT_COLOR_DARK_APPEARANCE_FIELD_NUMBER = 14;
        public static final int TEXT_COLOR_FIELD_NUMBER = 4;
        public static final int TEXT_FONT_WEIGHT_FIELD_NUMBER = 6;
        private int bitField0_;
        private BorderRadius borderRadius_;
        private int fontWeight_;
        private int textFontWeight_;
        private String color_ = "";
        private String colorDarkAppearance_ = "";
        private String colorHover_ = "";
        private String colorHoverDarkAppearance_ = "";
        private String textColor_ = "";
        private String textColorDarkAppearance_ = "";

        public static final class BorderRadius extends GeneratedMessageLite<BorderRadius, C6405a> implements MessageLiteOrBuilder {
            private static final BorderRadius DEFAULT_INSTANCE;
            private static volatile Parser<BorderRadius> PARSER = null;
            public static final int SIZE_FIELD_NUMBER = 1;
            private int size_;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent$ClientCustomizations$BorderRadius$a */
            public static final class C6405a extends GeneratedMessageLite.Builder<BorderRadius, C6405a> implements MessageLiteOrBuilder {
                public C6405a() {
                    super(BorderRadius.DEFAULT_INSTANCE);
                }
            }

            static {
                BorderRadius borderRadius = new BorderRadius();
                DEFAULT_INSTANCE = borderRadius;
                GeneratedMessageLite.registerDefaultInstance(BorderRadius.class, borderRadius);
            }

            private BorderRadius() {
            }

            private void clearSize() {
                this.size_ = 0;
            }

            public static BorderRadius getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6405a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static BorderRadius parseDelimitedFrom(InputStream inputStream) {
                return (BorderRadius) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static BorderRadius parseFrom(ByteBuffer byteBuffer) {
                return (BorderRadius) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<BorderRadius> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setSize(int i) {
                this.size_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new BorderRadius();
                    case 2:
                        return new C6405a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"size_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<BorderRadius> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (BorderRadius.class) {
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

            public int getSize() {
                return this.size_;
            }

            public static C6405a newBuilder(BorderRadius borderRadius) {
                return DEFAULT_INSTANCE.createBuilder(borderRadius);
            }

            public static BorderRadius parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (BorderRadius) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static BorderRadius parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (BorderRadius) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static BorderRadius parseFrom(ByteString byteString) {
                return (BorderRadius) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static BorderRadius parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (BorderRadius) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static BorderRadius parseFrom(byte[] bArr) {
                return (BorderRadius) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static BorderRadius parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (BorderRadius) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static BorderRadius parseFrom(InputStream inputStream) {
                return (BorderRadius) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static BorderRadius parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (BorderRadius) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static BorderRadius parseFrom(CodedInputStream codedInputStream) {
                return (BorderRadius) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static BorderRadius parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (BorderRadius) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent$ClientCustomizations$a */
        public static final class C6406a extends GeneratedMessageLite.Builder<ClientCustomizations, C6406a> implements MessageLiteOrBuilder {
            public C6406a() {
                super(ClientCustomizations.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent$ClientCustomizations$b */
        public enum EnumC6407b implements Internal.EnumLite {
            FONT_WEIGHT_UNKNOWN(0),
            FONT_WEIGHT_NORMAL(1),
            FONT_WEIGHT_BOLD(2),
            FONT_WEIGHT_MEDIUM(3),
            FONT_WEIGHT_SEMI_BOLD(4),
            FONT_WEIGHT_EXTRA_BOLD(5),
            UNRECOGNIZED(-1);

            public static final int FONT_WEIGHT_BOLD_VALUE = 2;
            public static final int FONT_WEIGHT_EXTRA_BOLD_VALUE = 5;
            public static final int FONT_WEIGHT_MEDIUM_VALUE = 3;
            public static final int FONT_WEIGHT_NORMAL_VALUE = 1;
            public static final int FONT_WEIGHT_SEMI_BOLD_VALUE = 4;
            public static final int FONT_WEIGHT_UNKNOWN_VALUE = 0;

            /* renamed from: b */
            public static final a f2224b = new a();

            /* renamed from: a */
            public final int f2226a;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent$ClientCustomizations$b$a */
            public class a implements Internal.EnumLiteMap<EnumC6407b> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final Internal.EnumLite findValueByNumber(int i) {
                    return EnumC6407b.forNumber(i);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent$ClientCustomizations$b$b */
            public static final class b implements Internal.EnumVerifier {

                /* renamed from: a */
                public static final b f2227a = new b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return EnumC6407b.forNumber(i) != null;
                }
            }

            EnumC6407b(int i) {
                this.f2226a = i;
            }

            public static EnumC6407b forNumber(int i) {
                if (i == 0) {
                    return FONT_WEIGHT_UNKNOWN;
                }
                if (i == 1) {
                    return FONT_WEIGHT_NORMAL;
                }
                if (i == 2) {
                    return FONT_WEIGHT_BOLD;
                }
                if (i == 3) {
                    return FONT_WEIGHT_MEDIUM;
                }
                if (i == 4) {
                    return FONT_WEIGHT_SEMI_BOLD;
                }
                if (i != 5) {
                    return null;
                }
                return FONT_WEIGHT_EXTRA_BOLD;
            }

            public static Internal.EnumLiteMap<EnumC6407b> internalGetValueMap() {
                return f2224b;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return b.f2227a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f2226a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static EnumC6407b valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            ClientCustomizations clientCustomizations = new ClientCustomizations();
            DEFAULT_INSTANCE = clientCustomizations;
            GeneratedMessageLite.registerDefaultInstance(ClientCustomizations.class, clientCustomizations);
        }

        private ClientCustomizations() {
        }

        private void clearBorderRadius() {
            this.borderRadius_ = null;
            this.bitField0_ &= -2;
        }

        private void clearColor() {
            this.color_ = getDefaultInstance().getColor();
        }

        private void clearColorDarkAppearance() {
            this.colorDarkAppearance_ = getDefaultInstance().getColorDarkAppearance();
        }

        private void clearColorHover() {
            this.colorHover_ = getDefaultInstance().getColorHover();
        }

        private void clearColorHoverDarkAppearance() {
            this.colorHoverDarkAppearance_ = getDefaultInstance().getColorHoverDarkAppearance();
        }

        private void clearFontWeight() {
            this.fontWeight_ = 0;
        }

        private void clearTextColor() {
            this.textColor_ = getDefaultInstance().getTextColor();
        }

        private void clearTextColorDarkAppearance() {
            this.textColorDarkAppearance_ = getDefaultInstance().getTextColorDarkAppearance();
        }

        private void clearTextFontWeight() {
            this.textFontWeight_ = 0;
        }

        public static ClientCustomizations getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeBorderRadius(BorderRadius borderRadius) {
            borderRadius.getClass();
            BorderRadius borderRadius2 = this.borderRadius_;
            if (borderRadius2 == null || borderRadius2 == BorderRadius.getDefaultInstance()) {
                this.borderRadius_ = borderRadius;
            } else {
                this.borderRadius_ = BorderRadius.newBuilder(this.borderRadius_).mergeFrom((BorderRadius.C6405a) borderRadius).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static C6406a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ClientCustomizations parseDelimitedFrom(InputStream inputStream) {
            return (ClientCustomizations) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClientCustomizations parseFrom(ByteBuffer byteBuffer) {
            return (ClientCustomizations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ClientCustomizations> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setBorderRadius(BorderRadius borderRadius) {
            borderRadius.getClass();
            this.borderRadius_ = borderRadius;
            this.bitField0_ |= 1;
        }

        private void setColor(String str) {
            str.getClass();
            this.color_ = str;
        }

        private void setColorBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.color_ = byteString.toStringUtf8();
        }

        private void setColorDarkAppearance(String str) {
            str.getClass();
            this.colorDarkAppearance_ = str;
        }

        private void setColorDarkAppearanceBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.colorDarkAppearance_ = byteString.toStringUtf8();
        }

        private void setColorHover(String str) {
            str.getClass();
            this.colorHover_ = str;
        }

        private void setColorHoverBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.colorHover_ = byteString.toStringUtf8();
        }

        private void setColorHoverDarkAppearance(String str) {
            str.getClass();
            this.colorHoverDarkAppearance_ = str;
        }

        private void setColorHoverDarkAppearanceBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.colorHoverDarkAppearance_ = byteString.toStringUtf8();
        }

        private void setFontWeight(Common$TextContent.EnumC6513g enumC6513g) {
            this.fontWeight_ = enumC6513g.getNumber();
        }

        private void setFontWeightValue(int i) {
            this.fontWeight_ = i;
        }

        private void setTextColor(String str) {
            str.getClass();
            this.textColor_ = str;
        }

        private void setTextColorBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.textColor_ = byteString.toStringUtf8();
        }

        private void setTextColorDarkAppearance(String str) {
            str.getClass();
            this.textColorDarkAppearance_ = str;
        }

        private void setTextColorDarkAppearanceBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.textColorDarkAppearance_ = byteString.toStringUtf8();
        }

        private void setTextFontWeight(EnumC6407b enumC6407b) {
            this.textFontWeight_ = enumC6407b.getNumber();
        }

        private void setTextFontWeightValue(int i) {
            this.textFontWeight_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ClientCustomizations();
                case 2:
                    return new C6406a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\u000e\t\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004Ȉ\u0005\f\u0006\f\fȈ\rȈ\u000eȈ", new Object[]{"bitField0_", "color_", "borderRadius_", "colorHover_", "textColor_", "fontWeight_", "textFontWeight_", "colorDarkAppearance_", "colorHoverDarkAppearance_", "textColorDarkAppearance_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ClientCustomizations> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ClientCustomizations.class) {
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

        public BorderRadius getBorderRadius() {
            BorderRadius borderRadius = this.borderRadius_;
            return borderRadius == null ? BorderRadius.getDefaultInstance() : borderRadius;
        }

        public String getColor() {
            return this.color_;
        }

        public ByteString getColorBytes() {
            return ByteString.copyFromUtf8(this.color_);
        }

        public String getColorDarkAppearance() {
            return this.colorDarkAppearance_;
        }

        public ByteString getColorDarkAppearanceBytes() {
            return ByteString.copyFromUtf8(this.colorDarkAppearance_);
        }

        public String getColorHover() {
            return this.colorHover_;
        }

        public ByteString getColorHoverBytes() {
            return ByteString.copyFromUtf8(this.colorHover_);
        }

        public String getColorHoverDarkAppearance() {
            return this.colorHoverDarkAppearance_;
        }

        public ByteString getColorHoverDarkAppearanceBytes() {
            return ByteString.copyFromUtf8(this.colorHoverDarkAppearance_);
        }

        public Common$TextContent.EnumC6513g getFontWeight() {
            Common$TextContent.EnumC6513g enumC6513gForNumber = Common$TextContent.EnumC6513g.forNumber(this.fontWeight_);
            return enumC6513gForNumber == null ? Common$TextContent.EnumC6513g.UNRECOGNIZED : enumC6513gForNumber;
        }

        public int getFontWeightValue() {
            return this.fontWeight_;
        }

        public String getTextColor() {
            return this.textColor_;
        }

        public ByteString getTextColorBytes() {
            return ByteString.copyFromUtf8(this.textColor_);
        }

        public String getTextColorDarkAppearance() {
            return this.textColorDarkAppearance_;
        }

        public ByteString getTextColorDarkAppearanceBytes() {
            return ByteString.copyFromUtf8(this.textColorDarkAppearance_);
        }

        public EnumC6407b getTextFontWeight() {
            EnumC6407b enumC6407bForNumber = EnumC6407b.forNumber(this.textFontWeight_);
            return enumC6407bForNumber == null ? EnumC6407b.UNRECOGNIZED : enumC6407bForNumber;
        }

        public int getTextFontWeightValue() {
            return this.textFontWeight_;
        }

        public boolean hasBorderRadius() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C6406a newBuilder(ClientCustomizations clientCustomizations) {
            return DEFAULT_INSTANCE.createBuilder(clientCustomizations);
        }

        public static ClientCustomizations parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClientCustomizations) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClientCustomizations parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ClientCustomizations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ClientCustomizations parseFrom(ByteString byteString) {
            return (ClientCustomizations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ClientCustomizations parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ClientCustomizations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ClientCustomizations parseFrom(byte[] bArr) {
            return (ClientCustomizations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ClientCustomizations parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ClientCustomizations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ClientCustomizations parseFrom(InputStream inputStream) {
            return (ClientCustomizations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClientCustomizations parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClientCustomizations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClientCustomizations parseFrom(CodedInputStream codedInputStream) {
            return (ClientCustomizations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ClientCustomizations parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClientCustomizations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DisableFor extends GeneratedMessageLite<DisableFor, C6408a> implements MessageLiteOrBuilder {
        private static final DisableFor DEFAULT_INSTANCE;
        private static volatile Parser<DisableFor> PARSER = null;
        public static final int SECONDS_FIELD_NUMBER = 1;
        public static final int SHOW_COUNTDOWN_TIMER_FIELD_NUMBER = 2;
        private int seconds_;
        private boolean showCountdownTimer_;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent$DisableFor$a */
        public static final class C6408a extends GeneratedMessageLite.Builder<DisableFor, C6408a> implements MessageLiteOrBuilder {
            public C6408a() {
                super(DisableFor.DEFAULT_INSTANCE);
            }
        }

        static {
            DisableFor disableFor = new DisableFor();
            DEFAULT_INSTANCE = disableFor;
            GeneratedMessageLite.registerDefaultInstance(DisableFor.class, disableFor);
        }

        private DisableFor() {
        }

        private void clearSeconds() {
            this.seconds_ = 0;
        }

        private void clearShowCountdownTimer() {
            this.showCountdownTimer_ = false;
        }

        public static DisableFor getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6408a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DisableFor parseDelimitedFrom(InputStream inputStream) {
            return (DisableFor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DisableFor parseFrom(ByteBuffer byteBuffer) {
            return (DisableFor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<DisableFor> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setSeconds(int i) {
            this.seconds_ = i;
        }

        private void setShowCountdownTimer(boolean z) {
            this.showCountdownTimer_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                case 1:
                    return new DisableFor();
                case 2:
                    return new C6408a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u0007", new Object[]{"seconds_", "showCountdownTimer_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DisableFor> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (DisableFor.class) {
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

        public int getSeconds() {
            return this.seconds_;
        }

        public boolean getShowCountdownTimer() {
            return this.showCountdownTimer_;
        }

        public static C6408a newBuilder(DisableFor disableFor) {
            return DEFAULT_INSTANCE.createBuilder(disableFor);
        }

        public static DisableFor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DisableFor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DisableFor parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (DisableFor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DisableFor parseFrom(ByteString byteString) {
            return (DisableFor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DisableFor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (DisableFor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DisableFor parseFrom(byte[] bArr) {
            return (DisableFor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DisableFor parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (DisableFor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DisableFor parseFrom(InputStream inputStream) {
            return (DisableFor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DisableFor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DisableFor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DisableFor parseFrom(CodedInputStream codedInputStream) {
            return (DisableFor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DisableFor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DisableFor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent$a */
    public static final class C6409a extends GeneratedMessageLite.Builder<Common$ButtonContent, C6409a> implements MessageLiteOrBuilder {
        public C6409a() {
            super(Common$ButtonContent.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$ButtonContent common$ButtonContent = new Common$ButtonContent();
        DEFAULT_INSTANCE = common$ButtonContent;
        GeneratedMessageLite.registerDefaultInstance(Common$ButtonContent.class, common$ButtonContent);
    }

    private Common$ButtonContent() {
    }

    private void clearActionOverride() {
        this.actionOverride_ = null;
        this.bitField0_ &= -33;
    }

    private void clearClientCustomizations() {
        this.clientCustomizations_ = null;
        this.bitField0_ &= -65;
    }

    private void clearDisableFor() {
        this.disableFor_ = null;
        this.bitField0_ &= -129;
    }

    private void clearIcon() {
        this.icon_ = null;
        this.bitField0_ &= -9;
    }

    private void clearSecondaryText() {
        this.secondaryText_ = null;
        this.bitField0_ &= -5;
    }

    private void clearSubtitle() {
        this.subtitle_ = null;
        this.bitField0_ &= -3;
    }

    private void clearTitle() {
        this.title_ = null;
        this.bitField0_ &= -2;
    }

    private void clearTitleAlignmentIsLeading() {
        this.titleAlignmentIsLeading_ = false;
    }

    private void clearTrailingIcon() {
        this.trailingIcon_ = null;
        this.bitField0_ &= -17;
    }

    private void clearWeight() {
        this.weight_ = 0;
    }

    public static Common$ButtonContent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeActionOverride(Common$LocalAction common$LocalAction) {
        common$LocalAction.getClass();
        Common$LocalAction common$LocalAction2 = this.actionOverride_;
        if (common$LocalAction2 == null || common$LocalAction2 == Common$LocalAction.getDefaultInstance()) {
            this.actionOverride_ = common$LocalAction;
        } else {
            this.actionOverride_ = Common$LocalAction.newBuilder(this.actionOverride_).mergeFrom((Common$LocalAction.C6441b) common$LocalAction).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    private void mergeClientCustomizations(ClientCustomizations clientCustomizations) {
        clientCustomizations.getClass();
        ClientCustomizations clientCustomizations2 = this.clientCustomizations_;
        if (clientCustomizations2 == null || clientCustomizations2 == ClientCustomizations.getDefaultInstance()) {
            this.clientCustomizations_ = clientCustomizations;
        } else {
            this.clientCustomizations_ = ClientCustomizations.newBuilder(this.clientCustomizations_).mergeFrom((ClientCustomizations.C6406a) clientCustomizations).buildPartial();
        }
        this.bitField0_ |= 64;
    }

    private void mergeDisableFor(DisableFor disableFor) {
        disableFor.getClass();
        DisableFor disableFor2 = this.disableFor_;
        if (disableFor2 == null || disableFor2 == DisableFor.getDefaultInstance()) {
            this.disableFor_ = disableFor;
        } else {
            this.disableFor_ = DisableFor.newBuilder(this.disableFor_).mergeFrom((DisableFor.C6408a) disableFor).buildPartial();
        }
        this.bitField0_ |= 128;
    }

    private void mergeIcon(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.icon_;
        if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == Common$RenderedAssetAppearance.getDefaultInstance()) {
            this.icon_ = common$RenderedAssetAppearance;
        } else {
            this.icon_ = Common$RenderedAssetAppearance.newBuilder(this.icon_).mergeFrom((Common$RenderedAssetAppearance.C6475a) common$RenderedAssetAppearance).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    private void mergeSecondaryText(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.secondaryText_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
            this.secondaryText_ = common$LocalizedString;
        } else {
            this.secondaryText_ = Common$LocalizedString.newBuilder(this.secondaryText_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    private void mergeSubtitle(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.subtitle_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
            this.subtitle_ = common$LocalizedString;
        } else {
            this.subtitle_ = Common$LocalizedString.newBuilder(this.subtitle_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeTitle(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.title_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
            this.title_ = common$LocalizedString;
        } else {
            this.title_ = Common$LocalizedString.newBuilder(this.title_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergeTrailingIcon(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.trailingIcon_;
        if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == Common$RenderedAssetAppearance.getDefaultInstance()) {
            this.trailingIcon_ = common$RenderedAssetAppearance;
        } else {
            this.trailingIcon_ = Common$RenderedAssetAppearance.newBuilder(this.trailingIcon_).mergeFrom((Common$RenderedAssetAppearance.C6475a) common$RenderedAssetAppearance).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    public static C6409a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$ButtonContent parseDelimitedFrom(InputStream inputStream) {
        return (Common$ButtonContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$ButtonContent parseFrom(ByteBuffer byteBuffer) {
        return (Common$ButtonContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$ButtonContent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setActionOverride(Common$LocalAction common$LocalAction) {
        common$LocalAction.getClass();
        this.actionOverride_ = common$LocalAction;
        this.bitField0_ |= 32;
    }

    private void setClientCustomizations(ClientCustomizations clientCustomizations) {
        clientCustomizations.getClass();
        this.clientCustomizations_ = clientCustomizations;
        this.bitField0_ |= 64;
    }

    private void setDisableFor(DisableFor disableFor) {
        disableFor.getClass();
        this.disableFor_ = disableFor;
        this.bitField0_ |= 128;
    }

    private void setIcon(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.icon_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 8;
    }

    private void setSecondaryText(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.secondaryText_ = common$LocalizedString;
        this.bitField0_ |= 4;
    }

    private void setSubtitle(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.subtitle_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    private void setTitle(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.title_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void setTitleAlignmentIsLeading(boolean z) {
        this.titleAlignmentIsLeading_ = z;
    }

    private void setTrailingIcon(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.trailingIcon_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 16;
    }

    private void setWeight(EnumC6931q enumC6931q) {
        this.weight_ = enumC6931q.getNumber();
    }

    private void setWeightValue(int i) {
        this.weight_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$ButtonContent();
            case 2:
                return new C6409a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u0007\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0005\b\f\tဉ\u0004\nဉ\u0006\u000bဉ\u0007", new Object[]{"bitField0_", "title_", "subtitle_", "titleAlignmentIsLeading_", "secondaryText_", "icon_", "actionOverride_", "weight_", "trailingIcon_", "clientCustomizations_", "disableFor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$ButtonContent> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$ButtonContent.class) {
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

    public Common$LocalAction getActionOverride() {
        Common$LocalAction common$LocalAction = this.actionOverride_;
        return common$LocalAction == null ? Common$LocalAction.getDefaultInstance() : common$LocalAction;
    }

    public ClientCustomizations getClientCustomizations() {
        ClientCustomizations clientCustomizations = this.clientCustomizations_;
        return clientCustomizations == null ? ClientCustomizations.getDefaultInstance() : clientCustomizations;
    }

    public DisableFor getDisableFor() {
        DisableFor disableFor = this.disableFor_;
        return disableFor == null ? DisableFor.getDefaultInstance() : disableFor;
    }

    public Common$RenderedAssetAppearance getIcon() {
        Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.icon_;
        return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public Common$LocalizedString getSecondaryText() {
        Common$LocalizedString common$LocalizedString = this.secondaryText_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public Common$LocalizedString getSubtitle() {
        Common$LocalizedString common$LocalizedString = this.subtitle_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public Common$LocalizedString getTitle() {
        Common$LocalizedString common$LocalizedString = this.title_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public boolean getTitleAlignmentIsLeading() {
        return this.titleAlignmentIsLeading_;
    }

    public Common$RenderedAssetAppearance getTrailingIcon() {
        Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.trailingIcon_;
        return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public EnumC6931q getWeight() {
        EnumC6931q enumC6931qForNumber = EnumC6931q.forNumber(this.weight_);
        return enumC6931qForNumber == null ? EnumC6931q.UNRECOGNIZED : enumC6931qForNumber;
    }

    public int getWeightValue() {
        return this.weight_;
    }

    public boolean hasActionOverride() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasClientCustomizations() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasDisableFor() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasIcon() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSecondaryText() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSubtitle() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTitle() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTrailingIcon() {
        return (this.bitField0_ & 16) != 0;
    }

    public static C6409a newBuilder(Common$ButtonContent common$ButtonContent) {
        return DEFAULT_INSTANCE.createBuilder(common$ButtonContent);
    }

    public static Common$ButtonContent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ButtonContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$ButtonContent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ButtonContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$ButtonContent parseFrom(ByteString byteString) {
        return (Common$ButtonContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$ButtonContent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ButtonContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$ButtonContent parseFrom(byte[] bArr) {
        return (Common$ButtonContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$ButtonContent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ButtonContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$ButtonContent parseFrom(InputStream inputStream) {
        return (Common$ButtonContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$ButtonContent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ButtonContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$ButtonContent parseFrom(CodedInputStream codedInputStream) {
        return (Common$ButtonContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$ButtonContent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ButtonContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
