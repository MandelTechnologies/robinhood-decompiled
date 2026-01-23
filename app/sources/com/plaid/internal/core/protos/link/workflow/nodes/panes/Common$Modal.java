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
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class Common$Modal extends GeneratedMessageLite<Common$Modal, C6446a> implements MessageLiteOrBuilder {
    public static final int ATTRIBUTED_CONTENT_FIELD_NUMBER = 6;
    public static final int BUTTON_FIELD_NUMBER = 3;
    public static final int CLOSE_ICON_BUTTON_FIELD_NUMBER = 12;
    public static final int CONTENT_FIELD_NUMBER = 2;
    private static final Common$Modal DEFAULT_INSTANCE;
    public static final int DISCLAIMER_TEXT_FIELD_NUMBER = 10;
    public static final int DISCLAIMER_TEXT_PLACEMENT_FIELD_NUMBER = 9;
    public static final int FLEXIBLE_COMPONENTS_FIELD_NUMBER = 7;
    public static final int IMAGE_FIELD_NUMBER = 5;
    public static final int PANE_BRANDING_FIELD_NUMBER = 13;
    private static volatile Parser<Common$Modal> PARSER = null;
    public static final int SECONDARY_BUTTON_FIELD_NUMBER = 4;
    public static final int TERTIARY_BUTTON_FIELD_NUMBER = 8;
    public static final int TITLE_FIELD_NUMBER = 1;
    private Common$AttributedLocalizedString attributedContent_;
    private int bitField0_;
    private Common$ButtonContent button_;
    private CloseIconButton closeIconButton_;
    private Common$LocalizedString content_;
    private int disclaimerTextPlacement_;
    private Common$AttributedLocalizedString disclaimerText_;
    private Internal.ProtobufList<Common$FlexibleComponent> flexibleComponents_ = GeneratedMessageLite.emptyProtobufList();
    private Common$RenderedAssetAppearance image_;
    private int paneBranding_;
    private Common$ButtonContent secondaryButton_;
    private Common$ButtonContent tertiaryButton_;
    private Common$LocalizedString title_;

    public static final class CloseIconButton extends GeneratedMessageLite<CloseIconButton, C6445b> implements MessageLiteOrBuilder {
        public static final int ADDITIONAL_ACTION_FIELD_NUMBER = 2;
        private static final CloseIconButton DEFAULT_INSTANCE;
        public static final int IS_VISIBLE_FIELD_NUMBER = 1;
        private static volatile Parser<CloseIconButton> PARSER;
        private int additionalAction_;
        private boolean isVisible_;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal$CloseIconButton$a */
        public enum EnumC6444a implements Internal.EnumLite {
            ADDITIONAL_ACTION_UNKNOWN(0),
            ADDITIONAL_ACTION_PRIMARY_BUTTON_TAP(1),
            ADDITIONAL_ACTION_SECONDARY_BUTTON_TAP(2),
            ADDITIONAL_ACTION_TERTIARY_BUTTON_TAP(3),
            UNRECOGNIZED(-1);

            public static final int ADDITIONAL_ACTION_PRIMARY_BUTTON_TAP_VALUE = 1;
            public static final int ADDITIONAL_ACTION_SECONDARY_BUTTON_TAP_VALUE = 2;
            public static final int ADDITIONAL_ACTION_TERTIARY_BUTTON_TAP_VALUE = 3;
            public static final int ADDITIONAL_ACTION_UNKNOWN_VALUE = 0;

            /* renamed from: b */
            public static final a f2244b = new a();

            /* renamed from: a */
            public final int f2246a;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal$CloseIconButton$a$a */
            public class a implements Internal.EnumLiteMap<EnumC6444a> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final Internal.EnumLite findValueByNumber(int i) {
                    return EnumC6444a.forNumber(i);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal$CloseIconButton$a$b */
            public static final class b implements Internal.EnumVerifier {

                /* renamed from: a */
                public static final b f2247a = new b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return EnumC6444a.forNumber(i) != null;
                }
            }

            EnumC6444a(int i) {
                this.f2246a = i;
            }

            public static EnumC6444a forNumber(int i) {
                if (i == 0) {
                    return ADDITIONAL_ACTION_UNKNOWN;
                }
                if (i == 1) {
                    return ADDITIONAL_ACTION_PRIMARY_BUTTON_TAP;
                }
                if (i == 2) {
                    return ADDITIONAL_ACTION_SECONDARY_BUTTON_TAP;
                }
                if (i != 3) {
                    return null;
                }
                return ADDITIONAL_ACTION_TERTIARY_BUTTON_TAP;
            }

            public static Internal.EnumLiteMap<EnumC6444a> internalGetValueMap() {
                return f2244b;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return b.f2247a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f2246a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static EnumC6444a valueOf(int i) {
                return forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal$CloseIconButton$b */
        public static final class C6445b extends GeneratedMessageLite.Builder<CloseIconButton, C6445b> implements MessageLiteOrBuilder {
            public C6445b() {
                super(CloseIconButton.DEFAULT_INSTANCE);
            }
        }

        static {
            CloseIconButton closeIconButton = new CloseIconButton();
            DEFAULT_INSTANCE = closeIconButton;
            GeneratedMessageLite.registerDefaultInstance(CloseIconButton.class, closeIconButton);
        }

        private CloseIconButton() {
        }

        private void clearAdditionalAction() {
            this.additionalAction_ = 0;
        }

        private void clearIsVisible() {
            this.isVisible_ = false;
        }

        public static CloseIconButton getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6445b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CloseIconButton parseDelimitedFrom(InputStream inputStream) {
            return (CloseIconButton) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CloseIconButton parseFrom(ByteBuffer byteBuffer) {
            return (CloseIconButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CloseIconButton> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdditionalAction(EnumC6444a enumC6444a) {
            this.additionalAction_ = enumC6444a.getNumber();
        }

        private void setAdditionalActionValue(int i) {
            this.additionalAction_ = i;
        }

        private void setIsVisible(boolean z) {
            this.isVisible_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                case 1:
                    return new CloseIconButton();
                case 2:
                    return new C6445b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\f", new Object[]{"isVisible_", "additionalAction_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<CloseIconButton> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (CloseIconButton.class) {
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

        public EnumC6444a getAdditionalAction() {
            EnumC6444a enumC6444aForNumber = EnumC6444a.forNumber(this.additionalAction_);
            return enumC6444aForNumber == null ? EnumC6444a.UNRECOGNIZED : enumC6444aForNumber;
        }

        public int getAdditionalActionValue() {
            return this.additionalAction_;
        }

        public boolean getIsVisible() {
            return this.isVisible_;
        }

        public static C6445b newBuilder(CloseIconButton closeIconButton) {
            return DEFAULT_INSTANCE.createBuilder(closeIconButton);
        }

        public static CloseIconButton parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CloseIconButton) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CloseIconButton parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (CloseIconButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CloseIconButton parseFrom(ByteString byteString) {
            return (CloseIconButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CloseIconButton parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CloseIconButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CloseIconButton parseFrom(byte[] bArr) {
            return (CloseIconButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CloseIconButton parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CloseIconButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CloseIconButton parseFrom(InputStream inputStream) {
            return (CloseIconButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CloseIconButton parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CloseIconButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CloseIconButton parseFrom(CodedInputStream codedInputStream) {
            return (CloseIconButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CloseIconButton parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CloseIconButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal$a */
    public static final class C6446a extends GeneratedMessageLite.Builder<Common$Modal, C6446a> implements MessageLiteOrBuilder {
        public C6446a() {
            super(Common$Modal.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$Modal common$Modal = new Common$Modal();
        DEFAULT_INSTANCE = common$Modal;
        GeneratedMessageLite.registerDefaultInstance(Common$Modal.class, common$Modal);
    }

    private Common$Modal() {
    }

    private void addAllFlexibleComponents(Iterable<? extends Common$FlexibleComponent> iterable) {
        ensureFlexibleComponentsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.flexibleComponents_);
    }

    private void addFlexibleComponents(Common$FlexibleComponent common$FlexibleComponent) {
        common$FlexibleComponent.getClass();
        ensureFlexibleComponentsIsMutable();
        this.flexibleComponents_.add(common$FlexibleComponent);
    }

    private void clearAttributedContent() {
        this.attributedContent_ = null;
        this.bitField0_ &= -5;
    }

    private void clearButton() {
        this.button_ = null;
        this.bitField0_ &= -9;
    }

    private void clearCloseIconButton() {
        this.closeIconButton_ = null;
        this.bitField0_ &= -257;
    }

    private void clearContent() {
        this.content_ = null;
        this.bitField0_ &= -3;
    }

    private void clearDisclaimerText() {
        this.disclaimerText_ = null;
        this.bitField0_ &= -65;
    }

    private void clearDisclaimerTextPlacement() {
        this.disclaimerTextPlacement_ = 0;
    }

    private void clearFlexibleComponents() {
        this.flexibleComponents_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearImage() {
        this.image_ = null;
        this.bitField0_ &= -129;
    }

    private void clearPaneBranding() {
        this.paneBranding_ = 0;
    }

    private void clearSecondaryButton() {
        this.secondaryButton_ = null;
        this.bitField0_ &= -17;
    }

    private void clearTertiaryButton() {
        this.tertiaryButton_ = null;
        this.bitField0_ &= -33;
    }

    private void clearTitle() {
        this.title_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureFlexibleComponentsIsMutable() {
        Internal.ProtobufList<Common$FlexibleComponent> protobufList = this.flexibleComponents_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.flexibleComponents_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Common$Modal getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeAttributedContent(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.attributedContent_;
        if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
            this.attributedContent_ = common$AttributedLocalizedString;
        } else {
            this.attributedContent_ = Common$AttributedLocalizedString.newBuilder(this.attributedContent_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    private void mergeButton(Common$ButtonContent common$ButtonContent) {
        common$ButtonContent.getClass();
        Common$ButtonContent common$ButtonContent2 = this.button_;
        if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
            this.button_ = common$ButtonContent;
        } else {
            this.button_ = Common$ButtonContent.newBuilder(this.button_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    private void mergeCloseIconButton(CloseIconButton closeIconButton) {
        closeIconButton.getClass();
        CloseIconButton closeIconButton2 = this.closeIconButton_;
        if (closeIconButton2 == null || closeIconButton2 == CloseIconButton.getDefaultInstance()) {
            this.closeIconButton_ = closeIconButton;
        } else {
            this.closeIconButton_ = CloseIconButton.newBuilder(this.closeIconButton_).mergeFrom((CloseIconButton.C6445b) closeIconButton).buildPartial();
        }
        this.bitField0_ |= 256;
    }

    private void mergeContent(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.content_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
            this.content_ = common$LocalizedString;
        } else {
            this.content_ = Common$LocalizedString.newBuilder(this.content_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeDisclaimerText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.disclaimerText_;
        if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
            this.disclaimerText_ = common$AttributedLocalizedString;
        } else {
            this.disclaimerText_ = Common$AttributedLocalizedString.newBuilder(this.disclaimerText_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
        }
        this.bitField0_ |= 64;
    }

    private void mergeImage(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.image_;
        if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == Common$RenderedAssetAppearance.getDefaultInstance()) {
            this.image_ = common$RenderedAssetAppearance;
        } else {
            this.image_ = Common$RenderedAssetAppearance.newBuilder(this.image_).mergeFrom((Common$RenderedAssetAppearance.C6475a) common$RenderedAssetAppearance).buildPartial();
        }
        this.bitField0_ |= 128;
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

    private void mergeTertiaryButton(Common$ButtonContent common$ButtonContent) {
        common$ButtonContent.getClass();
        Common$ButtonContent common$ButtonContent2 = this.tertiaryButton_;
        if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
            this.tertiaryButton_ = common$ButtonContent;
        } else {
            this.tertiaryButton_ = Common$ButtonContent.newBuilder(this.tertiaryButton_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
        }
        this.bitField0_ |= 32;
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

    public static C6446a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$Modal parseDelimitedFrom(InputStream inputStream) {
        return (Common$Modal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$Modal parseFrom(ByteBuffer byteBuffer) {
        return (Common$Modal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$Modal> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeFlexibleComponents(int i) {
        ensureFlexibleComponentsIsMutable();
        this.flexibleComponents_.remove(i);
    }

    private void setAttributedContent(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        this.attributedContent_ = common$AttributedLocalizedString;
        this.bitField0_ |= 4;
    }

    private void setButton(Common$ButtonContent common$ButtonContent) {
        common$ButtonContent.getClass();
        this.button_ = common$ButtonContent;
        this.bitField0_ |= 8;
    }

    private void setCloseIconButton(CloseIconButton closeIconButton) {
        closeIconButton.getClass();
        this.closeIconButton_ = closeIconButton;
        this.bitField0_ |= 256;
    }

    private void setContent(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.content_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    private void setDisclaimerText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        this.disclaimerText_ = common$AttributedLocalizedString;
        this.bitField0_ |= 64;
    }

    private void setDisclaimerTextPlacement(EnumC6937t enumC6937t) {
        this.disclaimerTextPlacement_ = enumC6937t.getNumber();
    }

    private void setDisclaimerTextPlacementValue(int i) {
        this.disclaimerTextPlacement_ = i;
    }

    private void setFlexibleComponents(int i, Common$FlexibleComponent common$FlexibleComponent) {
        common$FlexibleComponent.getClass();
        ensureFlexibleComponentsIsMutable();
        this.flexibleComponents_.set(i, common$FlexibleComponent);
    }

    private void setImage(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.image_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 128;
    }

    private void setPaneBranding(EnumC6639I enumC6639I) {
        this.paneBranding_ = enumC6639I.getNumber();
    }

    private void setPaneBrandingValue(int i) {
        this.paneBranding_ = i;
    }

    private void setSecondaryButton(Common$ButtonContent common$ButtonContent) {
        common$ButtonContent.getClass();
        this.secondaryButton_ = common$ButtonContent;
        this.bitField0_ |= 16;
    }

    private void setTertiaryButton(Common$ButtonContent common$ButtonContent) {
        common$ButtonContent.getClass();
        this.tertiaryButton_ = common$ButtonContent;
        this.bitField0_ |= 32;
    }

    private void setTitle(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.title_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$Modal();
            case 2:
                return new C6446a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\r\f\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဉ\u0007\u0006ဉ\u0002\u0007\u001b\bဉ\u0005\t\f\nဉ\u0006\fဉ\b\r\f", new Object[]{"bitField0_", "title_", "content_", "button_", "secondaryButton_", "image_", "attributedContent_", "flexibleComponents_", Common$FlexibleComponent.class, "tertiaryButton_", "disclaimerTextPlacement_", "disclaimerText_", "closeIconButton_", "paneBranding_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$Modal> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$Modal.class) {
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

    public Common$AttributedLocalizedString getAttributedContent() {
        Common$AttributedLocalizedString common$AttributedLocalizedString = this.attributedContent_;
        return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
    }

    public Common$ButtonContent getButton() {
        Common$ButtonContent common$ButtonContent = this.button_;
        return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
    }

    public CloseIconButton getCloseIconButton() {
        CloseIconButton closeIconButton = this.closeIconButton_;
        return closeIconButton == null ? CloseIconButton.getDefaultInstance() : closeIconButton;
    }

    public Common$LocalizedString getContent() {
        Common$LocalizedString common$LocalizedString = this.content_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public Common$AttributedLocalizedString getDisclaimerText() {
        Common$AttributedLocalizedString common$AttributedLocalizedString = this.disclaimerText_;
        return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
    }

    public EnumC6937t getDisclaimerTextPlacement() {
        EnumC6937t enumC6937tForNumber = EnumC6937t.forNumber(this.disclaimerTextPlacement_);
        return enumC6937tForNumber == null ? EnumC6937t.UNRECOGNIZED : enumC6937tForNumber;
    }

    public int getDisclaimerTextPlacementValue() {
        return this.disclaimerTextPlacement_;
    }

    public Common$FlexibleComponent getFlexibleComponents(int i) {
        return this.flexibleComponents_.get(i);
    }

    public int getFlexibleComponentsCount() {
        return this.flexibleComponents_.size();
    }

    public List<Common$FlexibleComponent> getFlexibleComponentsList() {
        return this.flexibleComponents_;
    }

    public InterfaceC6943w getFlexibleComponentsOrBuilder(int i) {
        return this.flexibleComponents_.get(i);
    }

    public List<? extends InterfaceC6943w> getFlexibleComponentsOrBuilderList() {
        return this.flexibleComponents_;
    }

    public Common$RenderedAssetAppearance getImage() {
        Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.image_;
        return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public EnumC6639I getPaneBranding() {
        EnumC6639I enumC6639IForNumber = EnumC6639I.forNumber(this.paneBranding_);
        return enumC6639IForNumber == null ? EnumC6639I.UNRECOGNIZED : enumC6639IForNumber;
    }

    public int getPaneBrandingValue() {
        return this.paneBranding_;
    }

    public Common$ButtonContent getSecondaryButton() {
        Common$ButtonContent common$ButtonContent = this.secondaryButton_;
        return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
    }

    public Common$ButtonContent getTertiaryButton() {
        Common$ButtonContent common$ButtonContent = this.tertiaryButton_;
        return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
    }

    public Common$LocalizedString getTitle() {
        Common$LocalizedString common$LocalizedString = this.title_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public boolean hasAttributedContent() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasButton() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasCloseIconButton() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasContent() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDisclaimerText() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasImage() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasSecondaryButton() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasTertiaryButton() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasTitle() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C6446a newBuilder(Common$Modal common$Modal) {
        return DEFAULT_INSTANCE.createBuilder(common$Modal);
    }

    public static Common$Modal parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Modal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$Modal parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Modal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$Modal parseFrom(ByteString byteString) {
        return (Common$Modal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addFlexibleComponents(int i, Common$FlexibleComponent common$FlexibleComponent) {
        common$FlexibleComponent.getClass();
        ensureFlexibleComponentsIsMutable();
        this.flexibleComponents_.add(i, common$FlexibleComponent);
    }

    public static Common$Modal parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Modal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$Modal parseFrom(byte[] bArr) {
        return (Common$Modal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$Modal parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Modal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$Modal parseFrom(InputStream inputStream) {
        return (Common$Modal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$Modal parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Modal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$Modal parseFrom(CodedInputStream codedInputStream) {
        return (Common$Modal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$Modal parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Modal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
