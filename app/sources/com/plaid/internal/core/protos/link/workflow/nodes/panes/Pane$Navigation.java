package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.EnumC7081g;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Banner;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Transition;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class Pane$Navigation extends GeneratedMessageLite<Pane$Navigation, C6727a> implements MessageLiteOrBuilder {
    public static final int BACK_BUTTON_TITLE_FIELD_NUMBER = 8;
    public static final int BACK_STACK_BEHAVIOR_FIELD_NUMBER = 3;
    public static final int BACK_VISIBLE_FIELD_NUMBER = 2;
    public static final int BADGE_FIELD_NUMBER = 9;
    public static final int BANNER_FIELD_NUMBER = 13;
    private static final Pane$Navigation DEFAULT_INSTANCE;
    public static final int DIVIDER_VISIBLE_FIELD_NUMBER = 16;
    public static final int EXIT_ACTION_OVERRIDE_FIELD_NUMBER = 17;
    public static final int EXIT_BUTTON_TITLE_FIELD_NUMBER = 7;
    public static final int EXIT_VISIBLE_FIELD_NUMBER = 1;
    public static final int FALLBACK_TRANSITION_FIELD_NUMBER = 14;
    public static final int FOOTER_FIELD_NUMBER = 15;
    public static final int LEADING_BADGE_FIELD_NUMBER = 11;
    public static final int LEADING_LOGO_APPEARANCE_FIELD_NUMBER = 10;
    public static final int LOGO_APPEARANCE_FIELD_NUMBER = 6;
    public static final int LOGO_FIELD_NUMBER = 5;
    public static final int NOTE_FIELD_NUMBER = 12;
    private static volatile Parser<Pane$Navigation> PARSER = null;
    public static final int TRANSITION_FIELD_NUMBER = 4;
    private Common$LocalizedString backButtonTitle_;
    private int backStackBehavior_;
    private boolean backVisible_;
    private Common$Banner banner_;
    private int bitField0_;
    private Object centerContent_;
    private boolean dividerVisible_;
    private Common$LocalAction exitActionOverride_;
    private Common$LocalizedString exitButtonTitle_;
    private boolean exitVisible_;
    private Common$Transition fallbackTransition_;
    private Footer footer_;
    private Object leadingContent_;
    private int logo_;
    private Common$Transition transition_;
    private int centerContentCase_ = 0;
    private int leadingContentCase_ = 0;

    public static final class Badge extends GeneratedMessageLite<Badge, C6722a> implements MessageLiteOrBuilder {
        public static final int ASSET_FIELD_NUMBER = 3;
        private static final Badge DEFAULT_INSTANCE;
        public static final int LEADING_ASSET_FIELD_NUMBER = 2;
        public static final int PANE_BRANDING_FIELD_NUMBER = 4;
        private static volatile Parser<Badge> PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        private int bitField0_;
        private Common$RenderedAssetAppearance leadingAsset_;
        private int styleCase_ = 0;
        private Object style_;
        private Common$LocalizedString text_;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation$Badge$a */
        public static final class C6722a extends GeneratedMessageLite.Builder<Badge, C6722a> implements MessageLiteOrBuilder {
            public C6722a() {
                super(Badge.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation$Badge$b */
        public enum EnumC6723b {
            ASSET(3),
            PANE_BRANDING(4),
            STYLE_NOT_SET(0);


            /* renamed from: a */
            public final int f2417a;

            EnumC6723b(int i) {
                this.f2417a = i;
            }

            public static EnumC6723b forNumber(int i) {
                if (i == 0) {
                    return STYLE_NOT_SET;
                }
                if (i == 3) {
                    return ASSET;
                }
                if (i != 4) {
                    return null;
                }
                return PANE_BRANDING;
            }

            public int getNumber() {
                return this.f2417a;
            }

            @Deprecated
            public static EnumC6723b valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            Badge badge = new Badge();
            DEFAULT_INSTANCE = badge;
            GeneratedMessageLite.registerDefaultInstance(Badge.class, badge);
        }

        private Badge() {
        }

        private void clearAsset() {
            if (this.styleCase_ == 3) {
                this.styleCase_ = 0;
                this.style_ = null;
            }
        }

        private void clearLeadingAsset() {
            this.leadingAsset_ = null;
            this.bitField0_ &= -3;
        }

        private void clearPaneBranding() {
            if (this.styleCase_ == 4) {
                this.styleCase_ = 0;
                this.style_ = null;
            }
        }

        private void clearStyle() {
            this.styleCase_ = 0;
            this.style_ = null;
        }

        private void clearText() {
            this.text_ = null;
            this.bitField0_ &= -2;
        }

        public static Badge getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            common$RenderedAssetAppearance.getClass();
            if (this.styleCase_ != 3 || this.style_ == Common$RenderedAssetAppearance.getDefaultInstance()) {
                this.style_ = common$RenderedAssetAppearance;
            } else {
                this.style_ = Common$RenderedAssetAppearance.newBuilder((Common$RenderedAssetAppearance) this.style_).mergeFrom((Common$RenderedAssetAppearance.C6475a) common$RenderedAssetAppearance).buildPartial();
            }
            this.styleCase_ = 3;
        }

        private void mergeLeadingAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            common$RenderedAssetAppearance.getClass();
            Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.leadingAsset_;
            if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == Common$RenderedAssetAppearance.getDefaultInstance()) {
                this.leadingAsset_ = common$RenderedAssetAppearance;
            } else {
                this.leadingAsset_ = Common$RenderedAssetAppearance.newBuilder(this.leadingAsset_).mergeFrom((Common$RenderedAssetAppearance.C6475a) common$RenderedAssetAppearance).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergeText(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            Common$LocalizedString common$LocalizedString2 = this.text_;
            if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
                this.text_ = common$LocalizedString;
            } else {
                this.text_ = Common$LocalizedString.newBuilder(this.text_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static C6722a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Badge parseDelimitedFrom(InputStream inputStream) {
            return (Badge) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Badge parseFrom(ByteBuffer byteBuffer) {
            return (Badge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Badge> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            common$RenderedAssetAppearance.getClass();
            this.style_ = common$RenderedAssetAppearance;
            this.styleCase_ = 3;
        }

        private void setLeadingAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            common$RenderedAssetAppearance.getClass();
            this.leadingAsset_ = common$RenderedAssetAppearance;
            this.bitField0_ |= 2;
        }

        private void setPaneBranding(EnumC6639I enumC6639I) {
            this.style_ = Integer.valueOf(enumC6639I.getNumber());
            this.styleCase_ = 4;
        }

        private void setPaneBrandingValue(int i) {
            this.styleCase_ = 4;
            this.style_ = Integer.valueOf(i);
        }

        private void setText(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            this.text_ = common$LocalizedString;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6924m0.f2570a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Badge();
                case 2:
                    return new C6722a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003<\u0000\u0004?\u0000", new Object[]{"style_", "styleCase_", "bitField0_", "text_", "leadingAsset_", Common$RenderedAssetAppearance.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Badge> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Badge.class) {
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

        public Common$RenderedAssetAppearance getAsset() {
            return this.styleCase_ == 3 ? (Common$RenderedAssetAppearance) this.style_ : Common$RenderedAssetAppearance.getDefaultInstance();
        }

        public Common$RenderedAssetAppearance getLeadingAsset() {
            Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.leadingAsset_;
            return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
        }

        public EnumC6639I getPaneBranding() {
            if (this.styleCase_ != 4) {
                return EnumC6639I.PANE_BRANDING_UNKNOWN;
            }
            EnumC6639I enumC6639IForNumber = EnumC6639I.forNumber(((Integer) this.style_).intValue());
            return enumC6639IForNumber == null ? EnumC6639I.UNRECOGNIZED : enumC6639IForNumber;
        }

        public int getPaneBrandingValue() {
            if (this.styleCase_ == 4) {
                return ((Integer) this.style_).intValue();
            }
            return 0;
        }

        public EnumC6723b getStyleCase() {
            return EnumC6723b.forNumber(this.styleCase_);
        }

        public Common$LocalizedString getText() {
            Common$LocalizedString common$LocalizedString = this.text_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public boolean hasAsset() {
            return this.styleCase_ == 3;
        }

        public boolean hasLeadingAsset() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasPaneBranding() {
            return this.styleCase_ == 4;
        }

        public boolean hasText() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C6722a newBuilder(Badge badge) {
            return DEFAULT_INSTANCE.createBuilder(badge);
        }

        public static Badge parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Badge) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Badge parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Badge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Badge parseFrom(ByteString byteString) {
            return (Badge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Badge parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Badge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Badge parseFrom(byte[] bArr) {
            return (Badge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Badge parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Badge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Badge parseFrom(InputStream inputStream) {
            return (Badge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Badge parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Badge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Badge parseFrom(CodedInputStream codedInputStream) {
            return (Badge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Badge parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Badge) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Footer extends GeneratedMessageLite<Footer, C6725b> implements MessageLiteOrBuilder {
        public static final int BACKGROUND_CONTRAST_FIELD_NUMBER = 2;
        public static final int COMPONENTS_FIELD_NUMBER = 1;
        private static final Footer DEFAULT_INSTANCE;
        public static final int FADE_TYPE_FIELD_NUMBER = 4;
        private static volatile Parser<Footer> PARSER = null;
        public static final int SPACING_FIELD_NUMBER = 3;
        private int backgroundContrast_;
        private int bitField0_;
        private Internal.ProtobufList<Common$FlexibleComponent> components_ = GeneratedMessageLite.emptyProtobufList();
        private int fadeType_;
        private Common$FlexibleComponent.Spacing spacing_;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation$Footer$a */
        public enum EnumC6724a implements Internal.EnumLite {
            BACKGROUND_CONTRAST_UNKNOWN(0),
            BACKGROUND_CONTRAST_NONE(1),
            BACKGROUND_CONTRAST_MEDIUM(2),
            UNRECOGNIZED(-1);

            public static final int BACKGROUND_CONTRAST_MEDIUM_VALUE = 2;
            public static final int BACKGROUND_CONTRAST_NONE_VALUE = 1;
            public static final int BACKGROUND_CONTRAST_UNKNOWN_VALUE = 0;

            /* renamed from: b */
            public static final a f2418b = new a();

            /* renamed from: a */
            public final int f2420a;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation$Footer$a$a */
            public class a implements Internal.EnumLiteMap<EnumC6724a> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final Internal.EnumLite findValueByNumber(int i) {
                    return EnumC6724a.forNumber(i);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation$Footer$a$b */
            public static final class b implements Internal.EnumVerifier {

                /* renamed from: a */
                public static final b f2421a = new b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return EnumC6724a.forNumber(i) != null;
                }
            }

            EnumC6724a(int i) {
                this.f2420a = i;
            }

            public static EnumC6724a forNumber(int i) {
                if (i == 0) {
                    return BACKGROUND_CONTRAST_UNKNOWN;
                }
                if (i == 1) {
                    return BACKGROUND_CONTRAST_NONE;
                }
                if (i != 2) {
                    return null;
                }
                return BACKGROUND_CONTRAST_MEDIUM;
            }

            public static Internal.EnumLiteMap<EnumC6724a> internalGetValueMap() {
                return f2418b;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return b.f2421a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f2420a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static EnumC6724a valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation$Footer$b */
        public static final class C6725b extends GeneratedMessageLite.Builder<Footer, C6725b> implements MessageLiteOrBuilder {
            public C6725b() {
                super(Footer.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation$Footer$c */
        public enum EnumC6726c implements Internal.EnumLite {
            FADE_TYPE_UNKNOWN(0),
            FADE_TYPE_NONE(1),
            FADE_TYPE_DIVIDER(2),
            UNRECOGNIZED(-1);

            public static final int FADE_TYPE_DIVIDER_VALUE = 2;
            public static final int FADE_TYPE_NONE_VALUE = 1;
            public static final int FADE_TYPE_UNKNOWN_VALUE = 0;

            /* renamed from: b */
            public static final a f2422b = new a();

            /* renamed from: a */
            public final int f2424a;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation$Footer$c$a */
            public class a implements Internal.EnumLiteMap<EnumC6726c> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final Internal.EnumLite findValueByNumber(int i) {
                    return EnumC6726c.forNumber(i);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation$Footer$c$b */
            public static final class b implements Internal.EnumVerifier {

                /* renamed from: a */
                public static final b f2425a = new b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return EnumC6726c.forNumber(i) != null;
                }
            }

            EnumC6726c(int i) {
                this.f2424a = i;
            }

            public static EnumC6726c forNumber(int i) {
                if (i == 0) {
                    return FADE_TYPE_UNKNOWN;
                }
                if (i == 1) {
                    return FADE_TYPE_NONE;
                }
                if (i != 2) {
                    return null;
                }
                return FADE_TYPE_DIVIDER;
            }

            public static Internal.EnumLiteMap<EnumC6726c> internalGetValueMap() {
                return f2422b;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return b.f2425a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f2424a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static EnumC6726c valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            Footer footer = new Footer();
            DEFAULT_INSTANCE = footer;
            GeneratedMessageLite.registerDefaultInstance(Footer.class, footer);
        }

        private Footer() {
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

        private void clearBackgroundContrast() {
            this.backgroundContrast_ = 0;
        }

        private void clearComponents() {
            this.components_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearFadeType() {
            this.fadeType_ = 0;
        }

        private void clearSpacing() {
            this.spacing_ = null;
            this.bitField0_ &= -2;
        }

        private void ensureComponentsIsMutable() {
            Internal.ProtobufList<Common$FlexibleComponent> protobufList = this.components_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.components_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static Footer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeSpacing(Common$FlexibleComponent.Spacing spacing) {
            spacing.getClass();
            Common$FlexibleComponent.Spacing spacing2 = this.spacing_;
            if (spacing2 == null || spacing2 == Common$FlexibleComponent.Spacing.getDefaultInstance()) {
                this.spacing_ = spacing;
            } else {
                this.spacing_ = Common$FlexibleComponent.Spacing.newBuilder(this.spacing_).mergeFrom((Common$FlexibleComponent.Spacing.C6423a) spacing).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static C6725b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Footer parseDelimitedFrom(InputStream inputStream) {
            return (Footer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Footer parseFrom(ByteBuffer byteBuffer) {
            return (Footer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Footer> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeComponents(int i) {
            ensureComponentsIsMutable();
            this.components_.remove(i);
        }

        private void setBackgroundContrast(EnumC6724a enumC6724a) {
            this.backgroundContrast_ = enumC6724a.getNumber();
        }

        private void setBackgroundContrastValue(int i) {
            this.backgroundContrast_ = i;
        }

        private void setComponents(int i, Common$FlexibleComponent common$FlexibleComponent) {
            common$FlexibleComponent.getClass();
            ensureComponentsIsMutable();
            this.components_.set(i, common$FlexibleComponent);
        }

        private void setFadeType(EnumC6726c enumC6726c) {
            this.fadeType_ = enumC6726c.getNumber();
        }

        private void setFadeTypeValue(int i) {
            this.fadeType_ = i;
        }

        private void setSpacing(Common$FlexibleComponent.Spacing spacing) {
            spacing.getClass();
            this.spacing_ = spacing;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6924m0.f2570a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Footer();
                case 2:
                    return new C6725b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002\f\u0003ဉ\u0000\u0004\f", new Object[]{"bitField0_", "components_", Common$FlexibleComponent.class, "backgroundContrast_", "spacing_", "fadeType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Footer> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Footer.class) {
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

        public EnumC6724a getBackgroundContrast() {
            EnumC6724a enumC6724aForNumber = EnumC6724a.forNumber(this.backgroundContrast_);
            return enumC6724aForNumber == null ? EnumC6724a.UNRECOGNIZED : enumC6724aForNumber;
        }

        public int getBackgroundContrastValue() {
            return this.backgroundContrast_;
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

        public EnumC6726c getFadeType() {
            EnumC6726c enumC6726cForNumber = EnumC6726c.forNumber(this.fadeType_);
            return enumC6726cForNumber == null ? EnumC6726c.UNRECOGNIZED : enumC6726cForNumber;
        }

        public int getFadeTypeValue() {
            return this.fadeType_;
        }

        public Common$FlexibleComponent.Spacing getSpacing() {
            Common$FlexibleComponent.Spacing spacing = this.spacing_;
            return spacing == null ? Common$FlexibleComponent.Spacing.getDefaultInstance() : spacing;
        }

        public boolean hasSpacing() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C6725b newBuilder(Footer footer) {
            return DEFAULT_INSTANCE.createBuilder(footer);
        }

        public static Footer parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Footer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Footer parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Footer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Footer parseFrom(ByteString byteString) {
            return (Footer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void addComponents(int i, Common$FlexibleComponent common$FlexibleComponent) {
            common$FlexibleComponent.getClass();
            ensureComponentsIsMutable();
            this.components_.add(i, common$FlexibleComponent);
        }

        public static Footer parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Footer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Footer parseFrom(byte[] bArr) {
            return (Footer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Footer parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Footer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Footer parseFrom(InputStream inputStream) {
            return (Footer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Footer parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Footer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Footer parseFrom(CodedInputStream codedInputStream) {
            return (Footer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Footer parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Footer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation$a */
    public static final class C6727a extends GeneratedMessageLite.Builder<Pane$Navigation, C6727a> implements MessageLiteOrBuilder {
        public C6727a() {
            super(Pane$Navigation.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation$b */
    public enum EnumC6728b {
        LOGO_APPEARANCE(6),
        BADGE(9),
        NOTE(12),
        CENTERCONTENT_NOT_SET(0);


        /* renamed from: a */
        public final int f2427a;

        EnumC6728b(int i) {
            this.f2427a = i;
        }

        public static EnumC6728b forNumber(int i) {
            if (i == 0) {
                return CENTERCONTENT_NOT_SET;
            }
            if (i == 6) {
                return LOGO_APPEARANCE;
            }
            if (i == 9) {
                return BADGE;
            }
            if (i != 12) {
                return null;
            }
            return NOTE;
        }

        public int getNumber() {
            return this.f2427a;
        }

        @Deprecated
        public static EnumC6728b valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation$c */
    public enum EnumC6729c {
        LEADING_LOGO_APPEARANCE(10),
        LEADING_BADGE(11),
        LEADINGCONTENT_NOT_SET(0);


        /* renamed from: a */
        public final int f2429a;

        EnumC6729c(int i) {
            this.f2429a = i;
        }

        public static EnumC6729c forNumber(int i) {
            if (i == 0) {
                return LEADINGCONTENT_NOT_SET;
            }
            if (i == 10) {
                return LEADING_LOGO_APPEARANCE;
            }
            if (i != 11) {
                return null;
            }
            return LEADING_BADGE;
        }

        public int getNumber() {
            return this.f2429a;
        }

        @Deprecated
        public static EnumC6729c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        Pane$Navigation pane$Navigation = new Pane$Navigation();
        DEFAULT_INSTANCE = pane$Navigation;
        GeneratedMessageLite.registerDefaultInstance(Pane$Navigation.class, pane$Navigation);
    }

    private Pane$Navigation() {
    }

    private void clearBackButtonTitle() {
        this.backButtonTitle_ = null;
        this.bitField0_ &= -5;
    }

    private void clearBackStackBehavior() {
        this.backStackBehavior_ = 0;
    }

    private void clearBackVisible() {
        this.backVisible_ = false;
    }

    private void clearBadge() {
        if (this.centerContentCase_ == 9) {
            this.centerContentCase_ = 0;
            this.centerContent_ = null;
        }
    }

    private void clearBanner() {
        this.banner_ = null;
        this.bitField0_ &= -33;
    }

    private void clearCenterContent() {
        this.centerContentCase_ = 0;
        this.centerContent_ = null;
    }

    private void clearDividerVisible() {
        this.dividerVisible_ = false;
    }

    private void clearExitActionOverride() {
        this.exitActionOverride_ = null;
        this.bitField0_ &= -3;
    }

    private void clearExitButtonTitle() {
        this.exitButtonTitle_ = null;
        this.bitField0_ &= -2;
    }

    private void clearExitVisible() {
        this.exitVisible_ = false;
    }

    private void clearFallbackTransition() {
        this.fallbackTransition_ = null;
        this.bitField0_ &= -17;
    }

    private void clearFooter() {
        this.footer_ = null;
        this.bitField0_ &= -65;
    }

    private void clearLeadingBadge() {
        if (this.leadingContentCase_ == 11) {
            this.leadingContentCase_ = 0;
            this.leadingContent_ = null;
        }
    }

    private void clearLeadingContent() {
        this.leadingContentCase_ = 0;
        this.leadingContent_ = null;
    }

    private void clearLeadingLogoAppearance() {
        if (this.leadingContentCase_ == 10) {
            this.leadingContentCase_ = 0;
            this.leadingContent_ = null;
        }
    }

    private void clearLogo() {
        this.logo_ = 0;
    }

    private void clearLogoAppearance() {
        if (this.centerContentCase_ == 6) {
            this.centerContentCase_ = 0;
            this.centerContent_ = null;
        }
    }

    private void clearNote() {
        if (this.centerContentCase_ == 12) {
            this.centerContentCase_ = 0;
            this.centerContent_ = null;
        }
    }

    private void clearTransition() {
        this.transition_ = null;
        this.bitField0_ &= -9;
    }

    public static Pane$Navigation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeBackButtonTitle(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.backButtonTitle_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
            this.backButtonTitle_ = common$LocalizedString;
        } else {
            this.backButtonTitle_ = Common$LocalizedString.newBuilder(this.backButtonTitle_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    private void mergeBadge(Badge badge) {
        badge.getClass();
        if (this.centerContentCase_ != 9 || this.centerContent_ == Badge.getDefaultInstance()) {
            this.centerContent_ = badge;
        } else {
            this.centerContent_ = Badge.newBuilder((Badge) this.centerContent_).mergeFrom((Badge.C6722a) badge).buildPartial();
        }
        this.centerContentCase_ = 9;
    }

    private void mergeBanner(Common$Banner common$Banner) {
        common$Banner.getClass();
        Common$Banner common$Banner2 = this.banner_;
        if (common$Banner2 == null || common$Banner2 == Common$Banner.getDefaultInstance()) {
            this.banner_ = common$Banner;
        } else {
            this.banner_ = Common$Banner.newBuilder(this.banner_).mergeFrom((Common$Banner.C6398a) common$Banner).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    private void mergeExitActionOverride(Common$LocalAction common$LocalAction) {
        common$LocalAction.getClass();
        Common$LocalAction common$LocalAction2 = this.exitActionOverride_;
        if (common$LocalAction2 == null || common$LocalAction2 == Common$LocalAction.getDefaultInstance()) {
            this.exitActionOverride_ = common$LocalAction;
        } else {
            this.exitActionOverride_ = Common$LocalAction.newBuilder(this.exitActionOverride_).mergeFrom((Common$LocalAction.C6441b) common$LocalAction).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeExitButtonTitle(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.exitButtonTitle_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
            this.exitButtonTitle_ = common$LocalizedString;
        } else {
            this.exitButtonTitle_ = Common$LocalizedString.newBuilder(this.exitButtonTitle_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergeFallbackTransition(Common$Transition common$Transition) {
        common$Transition.getClass();
        Common$Transition common$Transition2 = this.fallbackTransition_;
        if (common$Transition2 == null || common$Transition2 == Common$Transition.getDefaultInstance()) {
            this.fallbackTransition_ = common$Transition;
        } else {
            this.fallbackTransition_ = Common$Transition.newBuilder(this.fallbackTransition_).mergeFrom((Common$Transition.C6542a) common$Transition).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    private void mergeFooter(Footer footer) {
        footer.getClass();
        Footer footer2 = this.footer_;
        if (footer2 == null || footer2 == Footer.getDefaultInstance()) {
            this.footer_ = footer;
        } else {
            this.footer_ = Footer.newBuilder(this.footer_).mergeFrom((Footer.C6725b) footer).buildPartial();
        }
        this.bitField0_ |= 64;
    }

    private void mergeLeadingBadge(Badge badge) {
        badge.getClass();
        if (this.leadingContentCase_ != 11 || this.leadingContent_ == Badge.getDefaultInstance()) {
            this.leadingContent_ = badge;
        } else {
            this.leadingContent_ = Badge.newBuilder((Badge) this.leadingContent_).mergeFrom((Badge.C6722a) badge).buildPartial();
        }
        this.leadingContentCase_ = 11;
    }

    private void mergeLeadingLogoAppearance(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        if (this.leadingContentCase_ != 10 || this.leadingContent_ == Common$RenderedAssetAppearance.getDefaultInstance()) {
            this.leadingContent_ = common$RenderedAssetAppearance;
        } else {
            this.leadingContent_ = Common$RenderedAssetAppearance.newBuilder((Common$RenderedAssetAppearance) this.leadingContent_).mergeFrom((Common$RenderedAssetAppearance.C6475a) common$RenderedAssetAppearance).buildPartial();
        }
        this.leadingContentCase_ = 10;
    }

    private void mergeLogoAppearance(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        if (this.centerContentCase_ != 6 || this.centerContent_ == Common$RenderedAssetAppearance.getDefaultInstance()) {
            this.centerContent_ = common$RenderedAssetAppearance;
        } else {
            this.centerContent_ = Common$RenderedAssetAppearance.newBuilder((Common$RenderedAssetAppearance) this.centerContent_).mergeFrom((Common$RenderedAssetAppearance.C6475a) common$RenderedAssetAppearance).buildPartial();
        }
        this.centerContentCase_ = 6;
    }

    private void mergeNote(Common$Note common$Note) {
        common$Note.getClass();
        if (this.centerContentCase_ != 12 || this.centerContent_ == Common$Note.getDefaultInstance()) {
            this.centerContent_ = common$Note;
        } else {
            this.centerContent_ = Common$Note.newBuilder((Common$Note) this.centerContent_).mergeFrom((Common$Note.C6447a) common$Note).buildPartial();
        }
        this.centerContentCase_ = 12;
    }

    private void mergeTransition(Common$Transition common$Transition) {
        common$Transition.getClass();
        Common$Transition common$Transition2 = this.transition_;
        if (common$Transition2 == null || common$Transition2 == Common$Transition.getDefaultInstance()) {
            this.transition_ = common$Transition;
        } else {
            this.transition_ = Common$Transition.newBuilder(this.transition_).mergeFrom((Common$Transition.C6542a) common$Transition).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    public static C6727a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Pane$Navigation parseDelimitedFrom(InputStream inputStream) {
        return (Pane$Navigation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Pane$Navigation parseFrom(ByteBuffer byteBuffer) {
        return (Pane$Navigation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Pane$Navigation> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setBackButtonTitle(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.backButtonTitle_ = common$LocalizedString;
        this.bitField0_ |= 4;
    }

    private void setBackStackBehavior(EnumC6926n0 enumC6926n0) {
        this.backStackBehavior_ = enumC6926n0.getNumber();
    }

    private void setBackStackBehaviorValue(int i) {
        this.backStackBehavior_ = i;
    }

    private void setBackVisible(boolean z) {
        this.backVisible_ = z;
    }

    private void setBadge(Badge badge) {
        badge.getClass();
        this.centerContent_ = badge;
        this.centerContentCase_ = 9;
    }

    private void setBanner(Common$Banner common$Banner) {
        common$Banner.getClass();
        this.banner_ = common$Banner;
        this.bitField0_ |= 32;
    }

    private void setDividerVisible(boolean z) {
        this.dividerVisible_ = z;
    }

    private void setExitActionOverride(Common$LocalAction common$LocalAction) {
        common$LocalAction.getClass();
        this.exitActionOverride_ = common$LocalAction;
        this.bitField0_ |= 2;
    }

    private void setExitButtonTitle(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.exitButtonTitle_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void setExitVisible(boolean z) {
        this.exitVisible_ = z;
    }

    private void setFallbackTransition(Common$Transition common$Transition) {
        common$Transition.getClass();
        this.fallbackTransition_ = common$Transition;
        this.bitField0_ |= 16;
    }

    private void setFooter(Footer footer) {
        footer.getClass();
        this.footer_ = footer;
        this.bitField0_ |= 64;
    }

    private void setLeadingBadge(Badge badge) {
        badge.getClass();
        this.leadingContent_ = badge;
        this.leadingContentCase_ = 11;
    }

    private void setLeadingLogoAppearance(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.leadingContent_ = common$RenderedAssetAppearance;
        this.leadingContentCase_ = 10;
    }

    private void setLogo(EnumC7081g enumC7081g) {
        this.logo_ = enumC7081g.getNumber();
    }

    private void setLogoAppearance(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.centerContent_ = common$RenderedAssetAppearance;
        this.centerContentCase_ = 6;
    }

    private void setLogoValue(int i) {
        this.logo_ = i;
    }

    private void setNote(Common$Note common$Note) {
        common$Note.getClass();
        this.centerContent_ = common$Note;
        this.centerContentCase_ = 12;
    }

    private void setTransition(Common$Transition common$Transition) {
        common$Transition.getClass();
        this.transition_ = common$Transition;
        this.bitField0_ |= 8;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6924m0.f2570a[methodToInvoke.ordinal()]) {
            case 1:
                return new Pane$Navigation();
            case 2:
                return new C6727a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0002\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\f\u0004ဉ\u0003\u0005\f\u0006<\u0000\u0007ဉ\u0000\bဉ\u0002\t<\u0000\n<\u0001\u000b<\u0001\f<\u0000\rဉ\u0005\u000eဉ\u0004\u000fဉ\u0006\u0010\u0007\u0011ဉ\u0001", new Object[]{"centerContent_", "centerContentCase_", "leadingContent_", "leadingContentCase_", "bitField0_", "exitVisible_", "backVisible_", "backStackBehavior_", "transition_", "logo_", Common$RenderedAssetAppearance.class, "exitButtonTitle_", "backButtonTitle_", Badge.class, Common$RenderedAssetAppearance.class, Badge.class, Common$Note.class, "banner_", "fallbackTransition_", "footer_", "dividerVisible_", "exitActionOverride_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Pane$Navigation> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Pane$Navigation.class) {
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

    public Common$LocalizedString getBackButtonTitle() {
        Common$LocalizedString common$LocalizedString = this.backButtonTitle_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public EnumC6926n0 getBackStackBehavior() {
        EnumC6926n0 enumC6926n0ForNumber = EnumC6926n0.forNumber(this.backStackBehavior_);
        return enumC6926n0ForNumber == null ? EnumC6926n0.UNRECOGNIZED : enumC6926n0ForNumber;
    }

    public int getBackStackBehaviorValue() {
        return this.backStackBehavior_;
    }

    public boolean getBackVisible() {
        return this.backVisible_;
    }

    public Badge getBadge() {
        return this.centerContentCase_ == 9 ? (Badge) this.centerContent_ : Badge.getDefaultInstance();
    }

    public Common$Banner getBanner() {
        Common$Banner common$Banner = this.banner_;
        return common$Banner == null ? Common$Banner.getDefaultInstance() : common$Banner;
    }

    public EnumC6728b getCenterContentCase() {
        return EnumC6728b.forNumber(this.centerContentCase_);
    }

    public boolean getDividerVisible() {
        return this.dividerVisible_;
    }

    public Common$LocalAction getExitActionOverride() {
        Common$LocalAction common$LocalAction = this.exitActionOverride_;
        return common$LocalAction == null ? Common$LocalAction.getDefaultInstance() : common$LocalAction;
    }

    public Common$LocalizedString getExitButtonTitle() {
        Common$LocalizedString common$LocalizedString = this.exitButtonTitle_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public boolean getExitVisible() {
        return this.exitVisible_;
    }

    public Common$Transition getFallbackTransition() {
        Common$Transition common$Transition = this.fallbackTransition_;
        return common$Transition == null ? Common$Transition.getDefaultInstance() : common$Transition;
    }

    public Footer getFooter() {
        Footer footer = this.footer_;
        return footer == null ? Footer.getDefaultInstance() : footer;
    }

    public Badge getLeadingBadge() {
        return this.leadingContentCase_ == 11 ? (Badge) this.leadingContent_ : Badge.getDefaultInstance();
    }

    public EnumC6729c getLeadingContentCase() {
        return EnumC6729c.forNumber(this.leadingContentCase_);
    }

    public Common$RenderedAssetAppearance getLeadingLogoAppearance() {
        return this.leadingContentCase_ == 10 ? (Common$RenderedAssetAppearance) this.leadingContent_ : Common$RenderedAssetAppearance.getDefaultInstance();
    }

    public EnumC7081g getLogo() {
        EnumC7081g enumC7081gForNumber = EnumC7081g.forNumber(this.logo_);
        return enumC7081gForNumber == null ? EnumC7081g.UNRECOGNIZED : enumC7081gForNumber;
    }

    public Common$RenderedAssetAppearance getLogoAppearance() {
        return this.centerContentCase_ == 6 ? (Common$RenderedAssetAppearance) this.centerContent_ : Common$RenderedAssetAppearance.getDefaultInstance();
    }

    public int getLogoValue() {
        return this.logo_;
    }

    public Common$Note getNote() {
        return this.centerContentCase_ == 12 ? (Common$Note) this.centerContent_ : Common$Note.getDefaultInstance();
    }

    public Common$Transition getTransition() {
        Common$Transition common$Transition = this.transition_;
        return common$Transition == null ? Common$Transition.getDefaultInstance() : common$Transition;
    }

    public boolean hasBackButtonTitle() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasBadge() {
        return this.centerContentCase_ == 9;
    }

    public boolean hasBanner() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasExitActionOverride() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasExitButtonTitle() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasFallbackTransition() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasFooter() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasLeadingBadge() {
        return this.leadingContentCase_ == 11;
    }

    public boolean hasLeadingLogoAppearance() {
        return this.leadingContentCase_ == 10;
    }

    public boolean hasLogoAppearance() {
        return this.centerContentCase_ == 6;
    }

    public boolean hasNote() {
        return this.centerContentCase_ == 12;
    }

    public boolean hasTransition() {
        return (this.bitField0_ & 8) != 0;
    }

    public static C6727a newBuilder(Pane$Navigation pane$Navigation) {
        return DEFAULT_INSTANCE.createBuilder(pane$Navigation);
    }

    public static Pane$Navigation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$Navigation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Pane$Navigation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$Navigation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Pane$Navigation parseFrom(ByteString byteString) {
        return (Pane$Navigation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Pane$Navigation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$Navigation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Pane$Navigation parseFrom(byte[] bArr) {
        return (Pane$Navigation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Pane$Navigation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$Navigation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Pane$Navigation parseFrom(InputStream inputStream) {
        return (Pane$Navigation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Pane$Navigation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$Navigation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Pane$Navigation parseFrom(CodedInputStream codedInputStream) {
        return (Pane$Navigation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Pane$Navigation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$Navigation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
