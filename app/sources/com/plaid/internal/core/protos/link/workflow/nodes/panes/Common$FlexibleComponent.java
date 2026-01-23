package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Accordion;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedAsset;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Disclaimer;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListGroup;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedList;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PassportModal;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Table;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ThreadsListItem;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Common$FlexibleComponent extends GeneratedMessageLite<Common$FlexibleComponent, C6424a> implements InterfaceC6943w {
    public static final int ACCORDION_FIELD_NUMBER = 14;
    public static final int ASSET_FIELD_NUMBER = 11;
    public static final int ATTRIBUTED_STRING_FIELD_NUMBER = 8;
    public static final int BOX_FIELD_NUMBER = 21;
    public static final int BUTTON_FIELD_NUMBER = 9;
    public static final int CHECK_LIST_FIELD_NUMBER = 18;
    public static final int COBRANDED_ASSET_FIELD_NUMBER = 29;
    public static final int COMPONENT_ACTION_FIELD_NUMBER = 2;
    private static final Common$FlexibleComponent DEFAULT_INSTANCE;
    public static final int DISCLAIMER_FIELD_NUMBER = 26;
    public static final int DISCLAIMER_TEXT_FIELD_NUMBER = 25;
    public static final int FINE_PRINT_FIELD_NUMBER = 17;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LIST_GROUP_FIELD_NUMBER = 24;
    public static final int LIST_ITEM_FIELD_NUMBER = 12;
    public static final int NOTE_FIELD_NUMBER = 15;
    public static final int OAUTH_GUIDANCE_FIELD_NUMBER = 28;
    public static final int ON_TAP_FIELD_NUMBER = 3;
    public static final int ORDERED_LIST_FIELD_NUMBER = 19;
    private static volatile Parser<Common$FlexibleComponent> PARSER = null;
    public static final int PASSPORT_MODAL_FIELD_NUMBER = 32;
    public static final int PHONE_INPUT_FIELD_NUMBER = 30;
    public static final int PRIMARY_HEADING_FIELD_NUMBER = 7;
    public static final int SPACING_FIELD_NUMBER = 4;
    public static final int STEPPED_TRANSITION_TEXT_FIELD_NUMBER = 27;
    public static final int TABLE_FIELD_NUMBER = 16;
    public static final int TEXT_CONTENT_FIELD_NUMBER = 23;
    public static final int TEXT_INPUT_FIELD_NUMBER = 10;
    public static final int THREADS_LIST_ITEM_FIELD_NUMBER = 20;
    public static final int TOUCHABLE_FIELD_NUMBER = 22;
    public static final int VALUE_PROPOSITION_SHEET_FIELD_NUMBER = 31;
    private int bitField0_;
    private int componentAction_;
    private Common$SDKEvent onTap_;
    private Spacing spacing_;
    private Object type_;
    private int typeCase_ = 0;
    private String id_ = "";

    public static final class Spacing extends GeneratedMessageLite<Spacing, C6423a> implements MessageLiteOrBuilder {
        private static final Spacing DEFAULT_INSTANCE;
        public static final int MARGIN_BOTTOM_FIELD_NUMBER = 1;
        public static final int MARGIN_LEFT_FIELD_NUMBER = 2;
        public static final int MARGIN_RIGHT_FIELD_NUMBER = 3;
        public static final int PADDING_BOTTOM_FIELD_NUMBER = 5;
        public static final int PADDING_LEFT_FIELD_NUMBER = 6;
        public static final int PADDING_RIGHT_FIELD_NUMBER = 7;
        public static final int PADDING_TOP_FIELD_NUMBER = 4;
        private static volatile Parser<Spacing> PARSER;
        private float marginBottom_;
        private float marginLeft_;
        private float marginRight_;
        private float paddingBottom_;
        private float paddingLeft_;
        private float paddingRight_;
        private float paddingTop_;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent$Spacing$a */
        public static final class C6423a extends GeneratedMessageLite.Builder<Spacing, C6423a> implements MessageLiteOrBuilder {
            public C6423a() {
                super(Spacing.DEFAULT_INSTANCE);
            }
        }

        static {
            Spacing spacing = new Spacing();
            DEFAULT_INSTANCE = spacing;
            GeneratedMessageLite.registerDefaultInstance(Spacing.class, spacing);
        }

        private Spacing() {
        }

        private void clearMarginBottom() {
            this.marginBottom_ = 0.0f;
        }

        private void clearMarginLeft() {
            this.marginLeft_ = 0.0f;
        }

        private void clearMarginRight() {
            this.marginRight_ = 0.0f;
        }

        private void clearPaddingBottom() {
            this.paddingBottom_ = 0.0f;
        }

        private void clearPaddingLeft() {
            this.paddingLeft_ = 0.0f;
        }

        private void clearPaddingRight() {
            this.paddingRight_ = 0.0f;
        }

        private void clearPaddingTop() {
            this.paddingTop_ = 0.0f;
        }

        public static Spacing getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6423a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Spacing parseDelimitedFrom(InputStream inputStream) {
            return (Spacing) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Spacing parseFrom(ByteString byteString) {
            return (Spacing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Parser<Spacing> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setMarginBottom(float f) {
            this.marginBottom_ = f;
        }

        private void setMarginLeft(float f) {
            this.marginLeft_ = f;
        }

        private void setMarginRight(float f) {
            this.marginRight_ = f;
        }

        private void setPaddingBottom(float f) {
            this.paddingBottom_ = f;
        }

        private void setPaddingLeft(float f) {
            this.paddingLeft_ = f;
        }

        private void setPaddingRight(float f) {
            this.paddingRight_ = f;
        }

        private void setPaddingTop(float f) {
            this.paddingTop_ = f;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Spacing();
                case 2:
                    return new C6423a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0001\u0004\u0001\u0005\u0001\u0006\u0001\u0007\u0001", new Object[]{"marginBottom_", "marginLeft_", "marginRight_", "paddingTop_", "paddingBottom_", "paddingLeft_", "paddingRight_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Spacing> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Spacing.class) {
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

        public float getMarginBottom() {
            return this.marginBottom_;
        }

        public float getMarginLeft() {
            return this.marginLeft_;
        }

        public float getMarginRight() {
            return this.marginRight_;
        }

        public float getPaddingBottom() {
            return this.paddingBottom_;
        }

        public float getPaddingLeft() {
            return this.paddingLeft_;
        }

        public float getPaddingRight() {
            return this.paddingRight_;
        }

        public float getPaddingTop() {
            return this.paddingTop_;
        }

        public static C6423a newBuilder(Spacing spacing) {
            return DEFAULT_INSTANCE.createBuilder(spacing);
        }

        public static Spacing parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Spacing) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Spacing parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Spacing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Spacing parseFrom(CodedInputStream codedInputStream) {
            return (Spacing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Spacing parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Spacing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Spacing parseFrom(InputStream inputStream) {
            return (Spacing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Spacing parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Spacing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Spacing parseFrom(ByteBuffer byteBuffer) {
            return (Spacing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Spacing parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Spacing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Spacing parseFrom(byte[] bArr) {
            return (Spacing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Spacing parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Spacing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent$a */
    public static final class C6424a extends GeneratedMessageLite.Builder<Common$FlexibleComponent, C6424a> implements InterfaceC6943w {
        public C6424a() {
            super(Common$FlexibleComponent.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent$b */
    public enum EnumC6425b {
        PRIMARY_HEADING(7),
        ATTRIBUTED_STRING(8),
        BUTTON(9),
        TEXT_INPUT(10),
        ASSET(11),
        LIST_ITEM(12),
        ACCORDION(14),
        NOTE(15),
        TABLE(16),
        FINE_PRINT(17),
        CHECK_LIST(18),
        ORDERED_LIST(19),
        THREADS_LIST_ITEM(20),
        BOX(21),
        TOUCHABLE(22),
        TEXT_CONTENT(23),
        LIST_GROUP(24),
        DISCLAIMER_TEXT(25),
        DISCLAIMER(26),
        STEPPED_TRANSITION_TEXT(27),
        OAUTH_GUIDANCE(28),
        COBRANDED_ASSET(29),
        PHONE_INPUT(30),
        VALUE_PROPOSITION_SHEET(31),
        PASSPORT_MODAL(32),
        TYPE_NOT_SET(0);


        /* renamed from: a */
        public final int f2235a;

        EnumC6425b(int i) {
            this.f2235a = i;
        }

        public static EnumC6425b forNumber(int i) {
            if (i == 0) {
                return TYPE_NOT_SET;
            }
            switch (i) {
                case 7:
                    return PRIMARY_HEADING;
                case 8:
                    return ATTRIBUTED_STRING;
                case 9:
                    return BUTTON;
                case 10:
                    return TEXT_INPUT;
                case 11:
                    return ASSET;
                case 12:
                    return LIST_ITEM;
                default:
                    switch (i) {
                        case 14:
                            return ACCORDION;
                        case 15:
                            return NOTE;
                        case 16:
                            return TABLE;
                        case 17:
                            return FINE_PRINT;
                        case 18:
                            return CHECK_LIST;
                        case 19:
                            return ORDERED_LIST;
                        case 20:
                            return THREADS_LIST_ITEM;
                        case 21:
                            return BOX;
                        case 22:
                            return TOUCHABLE;
                        case 23:
                            return TEXT_CONTENT;
                        case 24:
                            return LIST_GROUP;
                        case 25:
                            return DISCLAIMER_TEXT;
                        case 26:
                            return DISCLAIMER;
                        case 27:
                            return STEPPED_TRANSITION_TEXT;
                        case 28:
                            return OAUTH_GUIDANCE;
                        case 29:
                            return COBRANDED_ASSET;
                        case 30:
                            return PHONE_INPUT;
                        case 31:
                            return VALUE_PROPOSITION_SHEET;
                        case 32:
                            return PASSPORT_MODAL;
                        default:
                            return null;
                    }
            }
        }

        @Deprecated
        public static EnumC6425b valueOf(int i) {
            return forNumber(i);
        }

        public int getNumber() {
            return this.f2235a;
        }
    }

    static {
        Common$FlexibleComponent common$FlexibleComponent = new Common$FlexibleComponent();
        DEFAULT_INSTANCE = common$FlexibleComponent;
        GeneratedMessageLite.registerDefaultInstance(Common$FlexibleComponent.class, common$FlexibleComponent);
    }

    private Common$FlexibleComponent() {
    }

    private void clearAccordion() {
        if (this.typeCase_ == 14) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearAsset() {
        if (this.typeCase_ == 11) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearAttributedString() {
        if (this.typeCase_ == 8) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearBox() {
        if (this.typeCase_ == 21) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearButton() {
        if (this.typeCase_ == 9) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearCheckList() {
        if (this.typeCase_ == 18) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearCobrandedAsset() {
        if (this.typeCase_ == 29) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearComponentAction() {
        this.componentAction_ = 0;
    }

    private void clearDisclaimer() {
        if (this.typeCase_ == 26) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearDisclaimerText() {
        if (this.typeCase_ == 25) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearFinePrint() {
        if (this.typeCase_ == 17) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearListGroup() {
        if (this.typeCase_ == 24) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearListItem() {
        if (this.typeCase_ == 12) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearNote() {
        if (this.typeCase_ == 15) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearOauthGuidance() {
        if (this.typeCase_ == 28) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearOnTap() {
        this.onTap_ = null;
        this.bitField0_ &= -2;
    }

    private void clearOrderedList() {
        if (this.typeCase_ == 19) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearPassportModal() {
        if (this.typeCase_ == 32) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearPhoneInput() {
        if (this.typeCase_ == 30) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearPrimaryHeading() {
        if (this.typeCase_ == 7) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearSpacing() {
        this.spacing_ = null;
        this.bitField0_ &= -3;
    }

    private void clearSteppedTransitionText() {
        if (this.typeCase_ == 27) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearTable() {
        if (this.typeCase_ == 16) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearTextContent() {
        if (this.typeCase_ == 23) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearTextInput() {
        if (this.typeCase_ == 10) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearThreadsListItem() {
        if (this.typeCase_ == 20) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearTouchable() {
        if (this.typeCase_ == 22) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearType() {
        this.typeCase_ = 0;
        this.type_ = null;
    }

    private void clearValuePropositionSheet() {
        if (this.typeCase_ == 31) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    public static Common$FlexibleComponent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeAccordion(Common$Accordion common$Accordion) {
        common$Accordion.getClass();
        if (this.typeCase_ == 14 && this.type_ != Common$Accordion.getDefaultInstance()) {
            common$Accordion = Common$Accordion.newBuilder((Common$Accordion) this.type_).mergeFrom((Common$Accordion.C6383a) common$Accordion).buildPartial();
        }
        this.type_ = common$Accordion;
        this.typeCase_ = 14;
    }

    private void mergeAsset(Common$RenderedAsset common$RenderedAsset) {
        common$RenderedAsset.getClass();
        if (this.typeCase_ == 11 && this.type_ != Common$RenderedAsset.getDefaultInstance()) {
            common$RenderedAsset = Common$RenderedAsset.newBuilder((Common$RenderedAsset) this.type_).mergeFrom((Common$RenderedAsset.C6473a) common$RenderedAsset).buildPartial();
        }
        this.type_ = common$RenderedAsset;
        this.typeCase_ = 11;
    }

    private void mergeAttributedString(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        if (this.typeCase_ == 8 && this.type_ != Common$AttributedLocalizedString.getDefaultInstance()) {
            common$AttributedLocalizedString = Common$AttributedLocalizedString.newBuilder((Common$AttributedLocalizedString) this.type_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
        }
        this.type_ = common$AttributedLocalizedString;
        this.typeCase_ = 8;
    }

    private void mergeBox(Common$Box common$Box) {
        common$Box.getClass();
        if (this.typeCase_ == 21 && this.type_ != Common$Box.getDefaultInstance()) {
            common$Box = Common$Box.newBuilder((Common$Box) this.type_).mergeFrom((Common$Box.C6402d) common$Box).buildPartial();
        }
        this.type_ = common$Box;
        this.typeCase_ = 21;
    }

    private void mergeButton(Common$ButtonContent common$ButtonContent) {
        common$ButtonContent.getClass();
        if (this.typeCase_ == 9 && this.type_ != Common$ButtonContent.getDefaultInstance()) {
            common$ButtonContent = Common$ButtonContent.newBuilder((Common$ButtonContent) this.type_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
        }
        this.type_ = common$ButtonContent;
        this.typeCase_ = 9;
    }

    private void mergeCheckList(Common$CheckList common$CheckList) {
        common$CheckList.getClass();
        if (this.typeCase_ == 18 && this.type_ != Common$CheckList.getDefaultInstance()) {
            common$CheckList = Common$CheckList.newBuilder((Common$CheckList) this.type_).mergeFrom((Common$CheckList.C6410a) common$CheckList).buildPartial();
        }
        this.type_ = common$CheckList;
        this.typeCase_ = 18;
    }

    private void mergeCobrandedAsset(Common$CobrandedAsset common$CobrandedAsset) {
        common$CobrandedAsset.getClass();
        if (this.typeCase_ == 29 && this.type_ != Common$CobrandedAsset.getDefaultInstance()) {
            common$CobrandedAsset = Common$CobrandedAsset.newBuilder((Common$CobrandedAsset) this.type_).mergeFrom((Common$CobrandedAsset.C6414a) common$CobrandedAsset).buildPartial();
        }
        this.type_ = common$CobrandedAsset;
        this.typeCase_ = 29;
    }

    private void mergeDisclaimer(Common$Disclaimer common$Disclaimer) {
        common$Disclaimer.getClass();
        if (this.typeCase_ == 26 && this.type_ != Common$Disclaimer.getDefaultInstance()) {
            common$Disclaimer = Common$Disclaimer.newBuilder((Common$Disclaimer) this.type_).mergeFrom((Common$Disclaimer.C6416a) common$Disclaimer).buildPartial();
        }
        this.type_ = common$Disclaimer;
        this.typeCase_ = 26;
    }

    private void mergeDisclaimerText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        if (this.typeCase_ == 25 && this.type_ != Common$AttributedLocalizedString.getDefaultInstance()) {
            common$AttributedLocalizedString = Common$AttributedLocalizedString.newBuilder((Common$AttributedLocalizedString) this.type_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
        }
        this.type_ = common$AttributedLocalizedString;
        this.typeCase_ = 25;
    }

    private void mergeFinePrint(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        if (this.typeCase_ == 17 && this.type_ != Common$AttributedLocalizedString.getDefaultInstance()) {
            common$AttributedLocalizedString = Common$AttributedLocalizedString.newBuilder((Common$AttributedLocalizedString) this.type_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
        }
        this.type_ = common$AttributedLocalizedString;
        this.typeCase_ = 17;
    }

    private void mergeListGroup(Common$ListGroup common$ListGroup) {
        common$ListGroup.getClass();
        if (this.typeCase_ == 24 && this.type_ != Common$ListGroup.getDefaultInstance()) {
            common$ListGroup = Common$ListGroup.newBuilder((Common$ListGroup) this.type_).mergeFrom((Common$ListGroup.C6428a) common$ListGroup).buildPartial();
        }
        this.type_ = common$ListGroup;
        this.typeCase_ = 24;
    }

    private void mergeListItem(Common$ListItem common$ListItem) {
        common$ListItem.getClass();
        if (this.typeCase_ == 12 && this.type_ != Common$ListItem.getDefaultInstance()) {
            common$ListItem = Common$ListItem.newBuilder((Common$ListItem) this.type_).mergeFrom((Common$ListItem.C6429a) common$ListItem).buildPartial();
        }
        this.type_ = common$ListItem;
        this.typeCase_ = 12;
    }

    private void mergeNote(Common$Note common$Note) {
        common$Note.getClass();
        if (this.typeCase_ == 15 && this.type_ != Common$Note.getDefaultInstance()) {
            common$Note = Common$Note.newBuilder((Common$Note) this.type_).mergeFrom((Common$Note.C6447a) common$Note).buildPartial();
        }
        this.type_ = common$Note;
        this.typeCase_ = 15;
    }

    private void mergeOauthGuidance(Common$OAuthGuidance common$OAuthGuidance) {
        common$OAuthGuidance.getClass();
        if (this.typeCase_ == 28 && this.type_ != Common$OAuthGuidance.getDefaultInstance()) {
            common$OAuthGuidance = Common$OAuthGuidance.newBuilder((Common$OAuthGuidance) this.type_).mergeFrom((Common$OAuthGuidance.C6448a) common$OAuthGuidance).buildPartial();
        }
        this.type_ = common$OAuthGuidance;
        this.typeCase_ = 28;
    }

    private void mergeOnTap(Common$SDKEvent common$SDKEvent) {
        common$SDKEvent.getClass();
        Common$SDKEvent common$SDKEvent2 = this.onTap_;
        if (common$SDKEvent2 != null && common$SDKEvent2 != Common$SDKEvent.getDefaultInstance()) {
            common$SDKEvent = Common$SDKEvent.newBuilder(this.onTap_).mergeFrom((Common$SDKEvent.C6479a) common$SDKEvent).buildPartial();
        }
        this.onTap_ = common$SDKEvent;
        this.bitField0_ |= 1;
    }

    private void mergeOrderedList(Common$OrderedList common$OrderedList) {
        common$OrderedList.getClass();
        if (this.typeCase_ == 19 && this.type_ != Common$OrderedList.getDefaultInstance()) {
            common$OrderedList = Common$OrderedList.newBuilder((Common$OrderedList) this.type_).mergeFrom((Common$OrderedList.C6449a) common$OrderedList).buildPartial();
        }
        this.type_ = common$OrderedList;
        this.typeCase_ = 19;
    }

    private void mergePassportModal(Common$PassportModal common$PassportModal) {
        common$PassportModal.getClass();
        if (this.typeCase_ == 32 && this.type_ != Common$PassportModal.getDefaultInstance()) {
            common$PassportModal = Common$PassportModal.newBuilder((Common$PassportModal) this.type_).mergeFrom((Common$PassportModal.C6461a) common$PassportModal).buildPartial();
        }
        this.type_ = common$PassportModal;
        this.typeCase_ = 32;
    }

    private void mergePhoneInput(Common$PhoneInput common$PhoneInput) {
        common$PhoneInput.getClass();
        if (this.typeCase_ == 30 && this.type_ != Common$PhoneInput.getDefaultInstance()) {
            common$PhoneInput = Common$PhoneInput.newBuilder((Common$PhoneInput) this.type_).mergeFrom((Common$PhoneInput.C6463a) common$PhoneInput).buildPartial();
        }
        this.type_ = common$PhoneInput;
        this.typeCase_ = 30;
    }

    private void mergePrimaryHeading(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        if (this.typeCase_ == 7 && this.type_ != Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = Common$LocalizedString.newBuilder((Common$LocalizedString) this.type_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.type_ = common$LocalizedString;
        this.typeCase_ = 7;
    }

    private void mergeSpacing(Spacing spacing) {
        spacing.getClass();
        Spacing spacing2 = this.spacing_;
        if (spacing2 != null && spacing2 != Spacing.getDefaultInstance()) {
            spacing = Spacing.newBuilder(this.spacing_).mergeFrom((Spacing.C6423a) spacing).buildPartial();
        }
        this.spacing_ = spacing;
        this.bitField0_ |= 2;
    }

    private void mergeSteppedTransitionText(Common$SteppedTransitionText common$SteppedTransitionText) {
        common$SteppedTransitionText.getClass();
        if (this.typeCase_ == 27 && this.type_ != Common$SteppedTransitionText.getDefaultInstance()) {
            common$SteppedTransitionText = Common$SteppedTransitionText.newBuilder((Common$SteppedTransitionText) this.type_).mergeFrom((Common$SteppedTransitionText.C6499a) common$SteppedTransitionText).buildPartial();
        }
        this.type_ = common$SteppedTransitionText;
        this.typeCase_ = 27;
    }

    private void mergeTable(Common$Table common$Table) {
        common$Table.getClass();
        if (this.typeCase_ == 16 && this.type_ != Common$Table.getDefaultInstance()) {
            common$Table = Common$Table.newBuilder((Common$Table) this.type_).mergeFrom((Common$Table.C6501a) common$Table).buildPartial();
        }
        this.type_ = common$Table;
        this.typeCase_ = 16;
    }

    private void mergeTextContent(Common$TextContent common$TextContent) {
        common$TextContent.getClass();
        if (this.typeCase_ == 23 && this.type_ != Common$TextContent.getDefaultInstance()) {
            common$TextContent = Common$TextContent.newBuilder((Common$TextContent) this.type_).mergeFrom((Common$TextContent.C6509c) common$TextContent).buildPartial();
        }
        this.type_ = common$TextContent;
        this.typeCase_ = 23;
    }

    private void mergeTextInput(Common$TextInput common$TextInput) {
        common$TextInput.getClass();
        if (this.typeCase_ == 10 && this.type_ != Common$TextInput.getDefaultInstance()) {
            common$TextInput = Common$TextInput.newBuilder((Common$TextInput) this.type_).mergeFrom((Common$TextInput.C6517b) common$TextInput).buildPartial();
        }
        this.type_ = common$TextInput;
        this.typeCase_ = 10;
    }

    private void mergeThreadsListItem(Common$ThreadsListItem common$ThreadsListItem) {
        common$ThreadsListItem.getClass();
        if (this.typeCase_ == 20 && this.type_ != Common$ThreadsListItem.getDefaultInstance()) {
            common$ThreadsListItem = Common$ThreadsListItem.newBuilder((Common$ThreadsListItem) this.type_).mergeFrom((Common$ThreadsListItem.C6531a) common$ThreadsListItem).buildPartial();
        }
        this.type_ = common$ThreadsListItem;
        this.typeCase_ = 20;
    }

    private void mergeTouchable(Common$Touchable common$Touchable) {
        common$Touchable.getClass();
        if (this.typeCase_ == 22 && this.type_ != Common$Touchable.getDefaultInstance()) {
            common$Touchable = Common$Touchable.newBuilder((Common$Touchable) this.type_).mergeFrom((Common$Touchable.C6533a) common$Touchable).buildPartial();
        }
        this.type_ = common$Touchable;
        this.typeCase_ = 22;
    }

    private void mergeValuePropositionSheet(Common$ValuePropositionSheet common$ValuePropositionSheet) {
        common$ValuePropositionSheet.getClass();
        if (this.typeCase_ == 31 && this.type_ != Common$ValuePropositionSheet.getDefaultInstance()) {
            common$ValuePropositionSheet = Common$ValuePropositionSheet.newBuilder((Common$ValuePropositionSheet) this.type_).mergeFrom((Common$ValuePropositionSheet.C6549a) common$ValuePropositionSheet).buildPartial();
        }
        this.type_ = common$ValuePropositionSheet;
        this.typeCase_ = 31;
    }

    public static C6424a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$FlexibleComponent parseDelimitedFrom(InputStream inputStream) {
        return (Common$FlexibleComponent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$FlexibleComponent parseFrom(ByteString byteString) {
        return (Common$FlexibleComponent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$FlexibleComponent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAccordion(Common$Accordion common$Accordion) {
        common$Accordion.getClass();
        this.type_ = common$Accordion;
        this.typeCase_ = 14;
    }

    private void setAsset(Common$RenderedAsset common$RenderedAsset) {
        common$RenderedAsset.getClass();
        this.type_ = common$RenderedAsset;
        this.typeCase_ = 11;
    }

    private void setAttributedString(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        this.type_ = common$AttributedLocalizedString;
        this.typeCase_ = 8;
    }

    private void setBox(Common$Box common$Box) {
        common$Box.getClass();
        this.type_ = common$Box;
        this.typeCase_ = 21;
    }

    private void setButton(Common$ButtonContent common$ButtonContent) {
        common$ButtonContent.getClass();
        this.type_ = common$ButtonContent;
        this.typeCase_ = 9;
    }

    private void setCheckList(Common$CheckList common$CheckList) {
        common$CheckList.getClass();
        this.type_ = common$CheckList;
        this.typeCase_ = 18;
    }

    private void setCobrandedAsset(Common$CobrandedAsset common$CobrandedAsset) {
        common$CobrandedAsset.getClass();
        this.type_ = common$CobrandedAsset;
        this.typeCase_ = 29;
    }

    private void setComponentAction(EnumC6941v enumC6941v) {
        this.componentAction_ = enumC6941v.getNumber();
    }

    private void setComponentActionValue(int i) {
        this.componentAction_ = i;
    }

    private void setDisclaimer(Common$Disclaimer common$Disclaimer) {
        common$Disclaimer.getClass();
        this.type_ = common$Disclaimer;
        this.typeCase_ = 26;
    }

    private void setDisclaimerText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        this.type_ = common$AttributedLocalizedString;
        this.typeCase_ = 25;
    }

    private void setFinePrint(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        this.type_ = common$AttributedLocalizedString;
        this.typeCase_ = 17;
    }

    private void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    private void setIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setListGroup(Common$ListGroup common$ListGroup) {
        common$ListGroup.getClass();
        this.type_ = common$ListGroup;
        this.typeCase_ = 24;
    }

    private void setListItem(Common$ListItem common$ListItem) {
        common$ListItem.getClass();
        this.type_ = common$ListItem;
        this.typeCase_ = 12;
    }

    private void setNote(Common$Note common$Note) {
        common$Note.getClass();
        this.type_ = common$Note;
        this.typeCase_ = 15;
    }

    private void setOauthGuidance(Common$OAuthGuidance common$OAuthGuidance) {
        common$OAuthGuidance.getClass();
        this.type_ = common$OAuthGuidance;
        this.typeCase_ = 28;
    }

    private void setOnTap(Common$SDKEvent common$SDKEvent) {
        common$SDKEvent.getClass();
        this.onTap_ = common$SDKEvent;
        this.bitField0_ |= 1;
    }

    private void setOrderedList(Common$OrderedList common$OrderedList) {
        common$OrderedList.getClass();
        this.type_ = common$OrderedList;
        this.typeCase_ = 19;
    }

    private void setPassportModal(Common$PassportModal common$PassportModal) {
        common$PassportModal.getClass();
        this.type_ = common$PassportModal;
        this.typeCase_ = 32;
    }

    private void setPhoneInput(Common$PhoneInput common$PhoneInput) {
        common$PhoneInput.getClass();
        this.type_ = common$PhoneInput;
        this.typeCase_ = 30;
    }

    private void setPrimaryHeading(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.type_ = common$LocalizedString;
        this.typeCase_ = 7;
    }

    private void setSpacing(Spacing spacing) {
        spacing.getClass();
        this.spacing_ = spacing;
        this.bitField0_ |= 2;
    }

    private void setSteppedTransitionText(Common$SteppedTransitionText common$SteppedTransitionText) {
        common$SteppedTransitionText.getClass();
        this.type_ = common$SteppedTransitionText;
        this.typeCase_ = 27;
    }

    private void setTable(Common$Table common$Table) {
        common$Table.getClass();
        this.type_ = common$Table;
        this.typeCase_ = 16;
    }

    private void setTextContent(Common$TextContent common$TextContent) {
        common$TextContent.getClass();
        this.type_ = common$TextContent;
        this.typeCase_ = 23;
    }

    private void setTextInput(Common$TextInput common$TextInput) {
        common$TextInput.getClass();
        this.type_ = common$TextInput;
        this.typeCase_ = 10;
    }

    private void setThreadsListItem(Common$ThreadsListItem common$ThreadsListItem) {
        common$ThreadsListItem.getClass();
        this.type_ = common$ThreadsListItem;
        this.typeCase_ = 20;
    }

    private void setTouchable(Common$Touchable common$Touchable) {
        common$Touchable.getClass();
        this.type_ = common$Touchable;
        this.typeCase_ = 22;
    }

    private void setValuePropositionSheet(Common$ValuePropositionSheet common$ValuePropositionSheet) {
        common$ValuePropositionSheet.getClass();
        this.type_ = common$ValuePropositionSheet;
        this.typeCase_ = 31;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$FlexibleComponent();
            case 2:
                return new C6424a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001d\u0001\u0001\u0001 \u001d\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000\u0004ဉ\u0001\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0017<\u0000\u0018<\u0000\u0019<\u0000\u001a<\u0000\u001b<\u0000\u001c<\u0000\u001d<\u0000\u001e<\u0000\u001f<\u0000 <\u0000", new Object[]{"type_", "typeCase_", "bitField0_", "id_", "componentAction_", "onTap_", "spacing_", Common$LocalizedString.class, Common$AttributedLocalizedString.class, Common$ButtonContent.class, Common$TextInput.class, Common$RenderedAsset.class, Common$ListItem.class, Common$Accordion.class, Common$Note.class, Common$Table.class, Common$AttributedLocalizedString.class, Common$CheckList.class, Common$OrderedList.class, Common$ThreadsListItem.class, Common$Box.class, Common$Touchable.class, Common$TextContent.class, Common$ListGroup.class, Common$AttributedLocalizedString.class, Common$Disclaimer.class, Common$SteppedTransitionText.class, Common$OAuthGuidance.class, Common$CobrandedAsset.class, Common$PhoneInput.class, Common$ValuePropositionSheet.class, Common$PassportModal.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$FlexibleComponent> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$FlexibleComponent.class) {
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

    public Common$Accordion getAccordion() {
        return this.typeCase_ == 14 ? (Common$Accordion) this.type_ : Common$Accordion.getDefaultInstance();
    }

    public Common$RenderedAsset getAsset() {
        return this.typeCase_ == 11 ? (Common$RenderedAsset) this.type_ : Common$RenderedAsset.getDefaultInstance();
    }

    public Common$AttributedLocalizedString getAttributedString() {
        return this.typeCase_ == 8 ? (Common$AttributedLocalizedString) this.type_ : Common$AttributedLocalizedString.getDefaultInstance();
    }

    public Common$Box getBox() {
        return this.typeCase_ == 21 ? (Common$Box) this.type_ : Common$Box.getDefaultInstance();
    }

    public Common$ButtonContent getButton() {
        return this.typeCase_ == 9 ? (Common$ButtonContent) this.type_ : Common$ButtonContent.getDefaultInstance();
    }

    public Common$CheckList getCheckList() {
        return this.typeCase_ == 18 ? (Common$CheckList) this.type_ : Common$CheckList.getDefaultInstance();
    }

    public Common$CobrandedAsset getCobrandedAsset() {
        return this.typeCase_ == 29 ? (Common$CobrandedAsset) this.type_ : Common$CobrandedAsset.getDefaultInstance();
    }

    public EnumC6941v getComponentAction() {
        EnumC6941v enumC6941vForNumber = EnumC6941v.forNumber(this.componentAction_);
        return enumC6941vForNumber == null ? EnumC6941v.UNRECOGNIZED : enumC6941vForNumber;
    }

    public int getComponentActionValue() {
        return this.componentAction_;
    }

    public Common$Disclaimer getDisclaimer() {
        return this.typeCase_ == 26 ? (Common$Disclaimer) this.type_ : Common$Disclaimer.getDefaultInstance();
    }

    public Common$AttributedLocalizedString getDisclaimerText() {
        return this.typeCase_ == 25 ? (Common$AttributedLocalizedString) this.type_ : Common$AttributedLocalizedString.getDefaultInstance();
    }

    public Common$AttributedLocalizedString getFinePrint() {
        return this.typeCase_ == 17 ? (Common$AttributedLocalizedString) this.type_ : Common$AttributedLocalizedString.getDefaultInstance();
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public Common$ListGroup getListGroup() {
        return this.typeCase_ == 24 ? (Common$ListGroup) this.type_ : Common$ListGroup.getDefaultInstance();
    }

    public Common$ListItem getListItem() {
        return this.typeCase_ == 12 ? (Common$ListItem) this.type_ : Common$ListItem.getDefaultInstance();
    }

    public Common$Note getNote() {
        return this.typeCase_ == 15 ? (Common$Note) this.type_ : Common$Note.getDefaultInstance();
    }

    public Common$OAuthGuidance getOauthGuidance() {
        return this.typeCase_ == 28 ? (Common$OAuthGuidance) this.type_ : Common$OAuthGuidance.getDefaultInstance();
    }

    public Common$SDKEvent getOnTap() {
        Common$SDKEvent common$SDKEvent = this.onTap_;
        return common$SDKEvent == null ? Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
    }

    public Common$OrderedList getOrderedList() {
        return this.typeCase_ == 19 ? (Common$OrderedList) this.type_ : Common$OrderedList.getDefaultInstance();
    }

    public Common$PassportModal getPassportModal() {
        return this.typeCase_ == 32 ? (Common$PassportModal) this.type_ : Common$PassportModal.getDefaultInstance();
    }

    public Common$PhoneInput getPhoneInput() {
        return this.typeCase_ == 30 ? (Common$PhoneInput) this.type_ : Common$PhoneInput.getDefaultInstance();
    }

    public Common$LocalizedString getPrimaryHeading() {
        return this.typeCase_ == 7 ? (Common$LocalizedString) this.type_ : Common$LocalizedString.getDefaultInstance();
    }

    public Spacing getSpacing() {
        Spacing spacing = this.spacing_;
        return spacing == null ? Spacing.getDefaultInstance() : spacing;
    }

    public Common$SteppedTransitionText getSteppedTransitionText() {
        return this.typeCase_ == 27 ? (Common$SteppedTransitionText) this.type_ : Common$SteppedTransitionText.getDefaultInstance();
    }

    public Common$Table getTable() {
        return this.typeCase_ == 16 ? (Common$Table) this.type_ : Common$Table.getDefaultInstance();
    }

    public Common$TextContent getTextContent() {
        return this.typeCase_ == 23 ? (Common$TextContent) this.type_ : Common$TextContent.getDefaultInstance();
    }

    public Common$TextInput getTextInput() {
        return this.typeCase_ == 10 ? (Common$TextInput) this.type_ : Common$TextInput.getDefaultInstance();
    }

    public Common$ThreadsListItem getThreadsListItem() {
        return this.typeCase_ == 20 ? (Common$ThreadsListItem) this.type_ : Common$ThreadsListItem.getDefaultInstance();
    }

    public Common$Touchable getTouchable() {
        return this.typeCase_ == 22 ? (Common$Touchable) this.type_ : Common$Touchable.getDefaultInstance();
    }

    public EnumC6425b getTypeCase() {
        return EnumC6425b.forNumber(this.typeCase_);
    }

    public Common$ValuePropositionSheet getValuePropositionSheet() {
        return this.typeCase_ == 31 ? (Common$ValuePropositionSheet) this.type_ : Common$ValuePropositionSheet.getDefaultInstance();
    }

    public boolean hasAccordion() {
        return this.typeCase_ == 14;
    }

    public boolean hasAsset() {
        return this.typeCase_ == 11;
    }

    public boolean hasAttributedString() {
        return this.typeCase_ == 8;
    }

    public boolean hasBox() {
        return this.typeCase_ == 21;
    }

    public boolean hasButton() {
        return this.typeCase_ == 9;
    }

    public boolean hasCheckList() {
        return this.typeCase_ == 18;
    }

    public boolean hasCobrandedAsset() {
        return this.typeCase_ == 29;
    }

    public boolean hasDisclaimer() {
        return this.typeCase_ == 26;
    }

    public boolean hasDisclaimerText() {
        return this.typeCase_ == 25;
    }

    public boolean hasFinePrint() {
        return this.typeCase_ == 17;
    }

    public boolean hasListGroup() {
        return this.typeCase_ == 24;
    }

    public boolean hasListItem() {
        return this.typeCase_ == 12;
    }

    public boolean hasNote() {
        return this.typeCase_ == 15;
    }

    public boolean hasOauthGuidance() {
        return this.typeCase_ == 28;
    }

    public boolean hasOnTap() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasOrderedList() {
        return this.typeCase_ == 19;
    }

    public boolean hasPassportModal() {
        return this.typeCase_ == 32;
    }

    public boolean hasPhoneInput() {
        return this.typeCase_ == 30;
    }

    public boolean hasPrimaryHeading() {
        return this.typeCase_ == 7;
    }

    public boolean hasSpacing() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSteppedTransitionText() {
        return this.typeCase_ == 27;
    }

    public boolean hasTable() {
        return this.typeCase_ == 16;
    }

    public boolean hasTextContent() {
        return this.typeCase_ == 23;
    }

    public boolean hasTextInput() {
        return this.typeCase_ == 10;
    }

    public boolean hasThreadsListItem() {
        return this.typeCase_ == 20;
    }

    public boolean hasTouchable() {
        return this.typeCase_ == 22;
    }

    public boolean hasValuePropositionSheet() {
        return this.typeCase_ == 31;
    }

    public static C6424a newBuilder(Common$FlexibleComponent common$FlexibleComponent) {
        return DEFAULT_INSTANCE.createBuilder(common$FlexibleComponent);
    }

    public static Common$FlexibleComponent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$FlexibleComponent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$FlexibleComponent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$FlexibleComponent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$FlexibleComponent parseFrom(CodedInputStream codedInputStream) {
        return (Common$FlexibleComponent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$FlexibleComponent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$FlexibleComponent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$FlexibleComponent parseFrom(InputStream inputStream) {
        return (Common$FlexibleComponent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$FlexibleComponent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$FlexibleComponent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$FlexibleComponent parseFrom(ByteBuffer byteBuffer) {
        return (Common$FlexibleComponent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$FlexibleComponent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$FlexibleComponent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$FlexibleComponent parseFrom(byte[] bArr) {
        return (Common$FlexibleComponent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$FlexibleComponent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$FlexibleComponent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
