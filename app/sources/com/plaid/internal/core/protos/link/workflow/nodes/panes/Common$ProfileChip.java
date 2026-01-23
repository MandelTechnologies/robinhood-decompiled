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
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Common$ProfileChip extends GeneratedMessageLite<Common$ProfileChip, C6467a> implements MessageLiteOrBuilder {
    private static final Common$ProfileChip DEFAULT_INSTANCE;
    public static final int HELPER_TEXT_FIELD_NUMBER = 6;
    public static final int HELPER_TEXT_LEADING_ASSET_FIELD_NUMBER = 7;
    public static final int ICON_FIELD_NUMBER = 8;
    public static final int MENU_BUTTON_ICON_NAME_FIELD_NUMBER = 9;
    public static final int OPTIONS_ACTION_FIELD_NUMBER = 3;
    public static final int OPTIONS_TEXT_FIELD_NUMBER = 5;
    private static volatile Parser<Common$ProfileChip> PARSER = null;
    public static final int PRIMARY_PROFILE_IDENTIFIER_FIELD_NUMBER = 1;
    public static final int PROFILE_STATUS_FIELD_NUMBER = 4;
    public static final int SECONDARY_PROFILE_IDENTIFIER_FIELD_NUMBER = 2;
    private int bitField0_;
    private Common$RenderedAssetAppearance helperTextLeadingAsset_;
    private Common$LocalizedString helperText_;
    private Common$RenderedAssetAppearance icon_;
    private String menuButtonIconName_ = "";
    private Common$LocalAction optionsAction_;
    private Common$LocalizedString optionsText_;
    private Common$LocalizedString primaryProfileIdentifier_;
    private int profileStatus_;
    private Common$LocalizedString secondaryProfileIdentifier_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip$a */
    public static final class C6467a extends GeneratedMessageLite.Builder<Common$ProfileChip, C6467a> implements MessageLiteOrBuilder {
        public C6467a() {
            super(Common$ProfileChip.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip$b */
    public enum EnumC6468b implements Internal.EnumLite {
        PROFILE_STATUS_UNKNOWN(0),
        PROFILE_STATUS_LOGGED_OUT(1),
        PROFILE_STATUS_LOGGED_IN(2),
        UNRECOGNIZED(-1);

        public static final int PROFILE_STATUS_LOGGED_IN_VALUE = 2;
        public static final int PROFILE_STATUS_LOGGED_OUT_VALUE = 1;
        public static final int PROFILE_STATUS_UNKNOWN_VALUE = 0;

        /* renamed from: b */
        public static final a f2262b = new a();

        /* renamed from: a */
        public final int f2264a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip$b$a */
        public class a implements Internal.EnumLiteMap<EnumC6468b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6468b.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ProfileChip$b$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f2265a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6468b.forNumber(i) != null;
            }
        }

        EnumC6468b(int i) {
            this.f2264a = i;
        }

        public static EnumC6468b forNumber(int i) {
            if (i == 0) {
                return PROFILE_STATUS_UNKNOWN;
            }
            if (i == 1) {
                return PROFILE_STATUS_LOGGED_OUT;
            }
            if (i != 2) {
                return null;
            }
            return PROFILE_STATUS_LOGGED_IN;
        }

        public static Internal.EnumLiteMap<EnumC6468b> internalGetValueMap() {
            return f2262b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f2265a;
        }

        @Deprecated
        public static EnumC6468b valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f2264a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        Common$ProfileChip common$ProfileChip = new Common$ProfileChip();
        DEFAULT_INSTANCE = common$ProfileChip;
        GeneratedMessageLite.registerDefaultInstance(Common$ProfileChip.class, common$ProfileChip);
    }

    private Common$ProfileChip() {
    }

    private void clearHelperText() {
        this.helperText_ = null;
        this.bitField0_ &= -17;
    }

    private void clearHelperTextLeadingAsset() {
        this.helperTextLeadingAsset_ = null;
        this.bitField0_ &= -33;
    }

    private void clearIcon() {
        this.icon_ = null;
        this.bitField0_ &= -65;
    }

    private void clearMenuButtonIconName() {
        this.menuButtonIconName_ = getDefaultInstance().getMenuButtonIconName();
    }

    private void clearOptionsAction() {
        this.optionsAction_ = null;
        this.bitField0_ &= -5;
    }

    private void clearOptionsText() {
        this.optionsText_ = null;
        this.bitField0_ &= -9;
    }

    private void clearPrimaryProfileIdentifier() {
        this.primaryProfileIdentifier_ = null;
        this.bitField0_ &= -2;
    }

    private void clearProfileStatus() {
        this.profileStatus_ = 0;
    }

    private void clearSecondaryProfileIdentifier() {
        this.secondaryProfileIdentifier_ = null;
        this.bitField0_ &= -3;
    }

    public static Common$ProfileChip getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeHelperText(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.helperText_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = Common$LocalizedString.newBuilder(this.helperText_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.helperText_ = common$LocalizedString;
        this.bitField0_ |= 16;
    }

    private void mergeHelperTextLeadingAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.helperTextLeadingAsset_;
        if (common$RenderedAssetAppearance2 != null && common$RenderedAssetAppearance2 != Common$RenderedAssetAppearance.getDefaultInstance()) {
            common$RenderedAssetAppearance = Common$RenderedAssetAppearance.newBuilder(this.helperTextLeadingAsset_).mergeFrom((Common$RenderedAssetAppearance.C6475a) common$RenderedAssetAppearance).buildPartial();
        }
        this.helperTextLeadingAsset_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 32;
    }

    private void mergeIcon(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.icon_;
        if (common$RenderedAssetAppearance2 != null && common$RenderedAssetAppearance2 != Common$RenderedAssetAppearance.getDefaultInstance()) {
            common$RenderedAssetAppearance = Common$RenderedAssetAppearance.newBuilder(this.icon_).mergeFrom((Common$RenderedAssetAppearance.C6475a) common$RenderedAssetAppearance).buildPartial();
        }
        this.icon_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 64;
    }

    private void mergeOptionsAction(Common$LocalAction common$LocalAction) {
        common$LocalAction.getClass();
        Common$LocalAction common$LocalAction2 = this.optionsAction_;
        if (common$LocalAction2 != null && common$LocalAction2 != Common$LocalAction.getDefaultInstance()) {
            common$LocalAction = Common$LocalAction.newBuilder(this.optionsAction_).mergeFrom((Common$LocalAction.C6441b) common$LocalAction).buildPartial();
        }
        this.optionsAction_ = common$LocalAction;
        this.bitField0_ |= 4;
    }

    private void mergeOptionsText(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.optionsText_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = Common$LocalizedString.newBuilder(this.optionsText_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.optionsText_ = common$LocalizedString;
        this.bitField0_ |= 8;
    }

    private void mergePrimaryProfileIdentifier(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.primaryProfileIdentifier_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = Common$LocalizedString.newBuilder(this.primaryProfileIdentifier_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.primaryProfileIdentifier_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void mergeSecondaryProfileIdentifier(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.secondaryProfileIdentifier_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = Common$LocalizedString.newBuilder(this.secondaryProfileIdentifier_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.secondaryProfileIdentifier_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    public static C6467a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$ProfileChip parseDelimitedFrom(InputStream inputStream) {
        return (Common$ProfileChip) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$ProfileChip parseFrom(ByteString byteString) {
        return (Common$ProfileChip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$ProfileChip> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setHelperText(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.helperText_ = common$LocalizedString;
        this.bitField0_ |= 16;
    }

    private void setHelperTextLeadingAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.helperTextLeadingAsset_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 32;
    }

    private void setIcon(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.icon_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 64;
    }

    private void setMenuButtonIconName(String str) {
        str.getClass();
        this.menuButtonIconName_ = str;
    }

    private void setMenuButtonIconNameBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.menuButtonIconName_ = byteString.toStringUtf8();
    }

    private void setOptionsAction(Common$LocalAction common$LocalAction) {
        common$LocalAction.getClass();
        this.optionsAction_ = common$LocalAction;
        this.bitField0_ |= 4;
    }

    private void setOptionsText(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.optionsText_ = common$LocalizedString;
        this.bitField0_ |= 8;
    }

    private void setPrimaryProfileIdentifier(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.primaryProfileIdentifier_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void setProfileStatus(EnumC6468b enumC6468b) {
        this.profileStatus_ = enumC6468b.getNumber();
    }

    private void setProfileStatusValue(int i) {
        this.profileStatus_ = i;
    }

    private void setSecondaryProfileIdentifier(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.secondaryProfileIdentifier_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$ProfileChip();
            case 2:
                return new C6467a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\f\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဉ\u0006\tȈ", new Object[]{"bitField0_", "primaryProfileIdentifier_", "secondaryProfileIdentifier_", "optionsAction_", "profileStatus_", "optionsText_", "helperText_", "helperTextLeadingAsset_", "icon_", "menuButtonIconName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$ProfileChip> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$ProfileChip.class) {
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

    public Common$LocalizedString getHelperText() {
        Common$LocalizedString common$LocalizedString = this.helperText_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public Common$RenderedAssetAppearance getHelperTextLeadingAsset() {
        Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.helperTextLeadingAsset_;
        return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public Common$RenderedAssetAppearance getIcon() {
        Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.icon_;
        return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public String getMenuButtonIconName() {
        return this.menuButtonIconName_;
    }

    public ByteString getMenuButtonIconNameBytes() {
        return ByteString.copyFromUtf8(this.menuButtonIconName_);
    }

    public Common$LocalAction getOptionsAction() {
        Common$LocalAction common$LocalAction = this.optionsAction_;
        return common$LocalAction == null ? Common$LocalAction.getDefaultInstance() : common$LocalAction;
    }

    public Common$LocalizedString getOptionsText() {
        Common$LocalizedString common$LocalizedString = this.optionsText_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public Common$LocalizedString getPrimaryProfileIdentifier() {
        Common$LocalizedString common$LocalizedString = this.primaryProfileIdentifier_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public EnumC6468b getProfileStatus() {
        EnumC6468b enumC6468bForNumber = EnumC6468b.forNumber(this.profileStatus_);
        return enumC6468bForNumber == null ? EnumC6468b.UNRECOGNIZED : enumC6468bForNumber;
    }

    public int getProfileStatusValue() {
        return this.profileStatus_;
    }

    public Common$LocalizedString getSecondaryProfileIdentifier() {
        Common$LocalizedString common$LocalizedString = this.secondaryProfileIdentifier_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public boolean hasHelperText() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasHelperTextLeadingAsset() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasIcon() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasOptionsAction() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasOptionsText() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasPrimaryProfileIdentifier() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSecondaryProfileIdentifier() {
        return (this.bitField0_ & 2) != 0;
    }

    public static C6467a newBuilder(Common$ProfileChip common$ProfileChip) {
        return DEFAULT_INSTANCE.createBuilder(common$ProfileChip);
    }

    public static Common$ProfileChip parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ProfileChip) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$ProfileChip parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ProfileChip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$ProfileChip parseFrom(CodedInputStream codedInputStream) {
        return (Common$ProfileChip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$ProfileChip parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ProfileChip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$ProfileChip parseFrom(InputStream inputStream) {
        return (Common$ProfileChip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$ProfileChip parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ProfileChip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$ProfileChip parseFrom(ByteBuffer byteBuffer) {
        return (Common$ProfileChip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$ProfileChip parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ProfileChip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$ProfileChip parseFrom(byte[] bArr) {
        return (Common$ProfileChip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$ProfileChip parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ProfileChip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
