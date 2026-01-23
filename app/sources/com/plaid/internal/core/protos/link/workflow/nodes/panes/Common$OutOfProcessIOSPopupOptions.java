package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Common$OutOfProcessIOSPopupOptions extends GeneratedMessageLite<Common$OutOfProcessIOSPopupOptions, C6452a> implements MessageLiteOrBuilder {
    private static final Common$OutOfProcessIOSPopupOptions DEFAULT_INSTANCE;
    public static final int OUT_OF_PROCESS_IOS_POPUP_FIELD_NUMBER = 1;
    private static volatile Parser<Common$OutOfProcessIOSPopupOptions> PARSER;
    private int bitField0_;
    private OutOfProcessIOSPopup outOfProcessIosPopup_;

    public static final class OutOfProcessIOSPopup extends GeneratedMessageLite<OutOfProcessIOSPopup, C6451a> implements MessageLiteOrBuilder {
        private static final OutOfProcessIOSPopup DEFAULT_INSTANCE;
        public static final int LEGACY_POPUP_BEHAVIOR_FIELD_NUMBER = 1;
        public static final int LOGIN_URI_FIELD_NUMBER = 2;
        private static volatile Parser<OutOfProcessIOSPopup> PARSER = null;
        public static final int POPUP_BEHAVIOR_FIELD_NUMBER = 3;
        private int legacyPopupBehavior_;
        private String loginUri_ = "";
        private int popupBehavior_;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions$OutOfProcessIOSPopup$a */
        public static final class C6451a extends GeneratedMessageLite.Builder<OutOfProcessIOSPopup, C6451a> implements MessageLiteOrBuilder {
            public C6451a() {
                super(OutOfProcessIOSPopup.DEFAULT_INSTANCE);
            }
        }

        static {
            OutOfProcessIOSPopup outOfProcessIOSPopup = new OutOfProcessIOSPopup();
            DEFAULT_INSTANCE = outOfProcessIOSPopup;
            GeneratedMessageLite.registerDefaultInstance(OutOfProcessIOSPopup.class, outOfProcessIOSPopup);
        }

        private OutOfProcessIOSPopup() {
        }

        private void clearLegacyPopupBehavior() {
            this.legacyPopupBehavior_ = 0;
        }

        private void clearLoginUri() {
            this.loginUri_ = getDefaultInstance().getLoginUri();
        }

        private void clearPopupBehavior() {
            this.popupBehavior_ = 0;
        }

        public static OutOfProcessIOSPopup getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6451a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static OutOfProcessIOSPopup parseDelimitedFrom(InputStream inputStream) {
            return (OutOfProcessIOSPopup) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OutOfProcessIOSPopup parseFrom(ByteString byteString) {
            return (OutOfProcessIOSPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Parser<OutOfProcessIOSPopup> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setLegacyPopupBehavior(EnumC6453b enumC6453b) {
            this.legacyPopupBehavior_ = enumC6453b.getNumber();
        }

        private void setLegacyPopupBehaviorValue(int i) {
            this.legacyPopupBehavior_ = i;
        }

        private void setLoginUri(String str) {
            str.getClass();
            this.loginUri_ = str;
        }

        private void setLoginUriBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.loginUri_ = byteString.toStringUtf8();
        }

        private void setPopupBehavior(EnumC6900a0 enumC6900a0) {
            this.popupBehavior_ = enumC6900a0.getNumber();
        }

        private void setPopupBehaviorValue(int i) {
            this.popupBehavior_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                case 1:
                    return new OutOfProcessIOSPopup();
                case 2:
                    return new C6451a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\f", new Object[]{"legacyPopupBehavior_", "loginUri_", "popupBehavior_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<OutOfProcessIOSPopup> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (OutOfProcessIOSPopup.class) {
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

        public EnumC6453b getLegacyPopupBehavior() {
            EnumC6453b enumC6453bForNumber = EnumC6453b.forNumber(this.legacyPopupBehavior_);
            return enumC6453bForNumber == null ? EnumC6453b.UNRECOGNIZED : enumC6453bForNumber;
        }

        public int getLegacyPopupBehaviorValue() {
            return this.legacyPopupBehavior_;
        }

        public String getLoginUri() {
            return this.loginUri_;
        }

        public ByteString getLoginUriBytes() {
            return ByteString.copyFromUtf8(this.loginUri_);
        }

        public EnumC6900a0 getPopupBehavior() {
            EnumC6900a0 enumC6900a0ForNumber = EnumC6900a0.forNumber(this.popupBehavior_);
            return enumC6900a0ForNumber == null ? EnumC6900a0.UNRECOGNIZED : enumC6900a0ForNumber;
        }

        public int getPopupBehaviorValue() {
            return this.popupBehavior_;
        }

        public static C6451a newBuilder(OutOfProcessIOSPopup outOfProcessIOSPopup) {
            return DEFAULT_INSTANCE.createBuilder(outOfProcessIOSPopup);
        }

        public static OutOfProcessIOSPopup parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OutOfProcessIOSPopup) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OutOfProcessIOSPopup parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (OutOfProcessIOSPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static OutOfProcessIOSPopup parseFrom(CodedInputStream codedInputStream) {
            return (OutOfProcessIOSPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static OutOfProcessIOSPopup parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OutOfProcessIOSPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static OutOfProcessIOSPopup parseFrom(InputStream inputStream) {
            return (OutOfProcessIOSPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OutOfProcessIOSPopup parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OutOfProcessIOSPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OutOfProcessIOSPopup parseFrom(ByteBuffer byteBuffer) {
            return (OutOfProcessIOSPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static OutOfProcessIOSPopup parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (OutOfProcessIOSPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static OutOfProcessIOSPopup parseFrom(byte[] bArr) {
            return (OutOfProcessIOSPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OutOfProcessIOSPopup parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (OutOfProcessIOSPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions$a */
    public static final class C6452a extends GeneratedMessageLite.Builder<Common$OutOfProcessIOSPopupOptions, C6452a> implements MessageLiteOrBuilder {
        public C6452a() {
            super(Common$OutOfProcessIOSPopupOptions.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions$b */
    public enum EnumC6453b implements Internal.EnumLite {
        OUT_OF_PROCESS_IOS_POPUP_BEHAVIOR_UNKNOWN(0),
        OUT_OF_PROCESS_IOS_POPUP_BEHAVIOR_DEFAULT_BROWSER(1),
        OUT_OF_PROCESS_IOS_POPUP_BEHAVIOR_AUTH_SESSION(2),
        UNRECOGNIZED(-1);

        public static final int OUT_OF_PROCESS_IOS_POPUP_BEHAVIOR_AUTH_SESSION_VALUE = 2;
        public static final int OUT_OF_PROCESS_IOS_POPUP_BEHAVIOR_DEFAULT_BROWSER_VALUE = 1;
        public static final int OUT_OF_PROCESS_IOS_POPUP_BEHAVIOR_UNKNOWN_VALUE = 0;

        /* renamed from: b */
        public static final a f2248b = new a();

        /* renamed from: a */
        public final int f2250a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions$b$a */
        public class a implements Internal.EnumLiteMap<EnumC6453b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6453b.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions$b$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f2251a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6453b.forNumber(i) != null;
            }
        }

        EnumC6453b(int i) {
            this.f2250a = i;
        }

        public static EnumC6453b forNumber(int i) {
            if (i == 0) {
                return OUT_OF_PROCESS_IOS_POPUP_BEHAVIOR_UNKNOWN;
            }
            if (i == 1) {
                return OUT_OF_PROCESS_IOS_POPUP_BEHAVIOR_DEFAULT_BROWSER;
            }
            if (i != 2) {
                return null;
            }
            return OUT_OF_PROCESS_IOS_POPUP_BEHAVIOR_AUTH_SESSION;
        }

        public static Internal.EnumLiteMap<EnumC6453b> internalGetValueMap() {
            return f2248b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f2251a;
        }

        @Deprecated
        public static EnumC6453b valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f2250a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        Common$OutOfProcessIOSPopupOptions common$OutOfProcessIOSPopupOptions = new Common$OutOfProcessIOSPopupOptions();
        DEFAULT_INSTANCE = common$OutOfProcessIOSPopupOptions;
        GeneratedMessageLite.registerDefaultInstance(Common$OutOfProcessIOSPopupOptions.class, common$OutOfProcessIOSPopupOptions);
    }

    private Common$OutOfProcessIOSPopupOptions() {
    }

    private void clearOutOfProcessIosPopup() {
        this.outOfProcessIosPopup_ = null;
        this.bitField0_ &= -2;
    }

    public static Common$OutOfProcessIOSPopupOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeOutOfProcessIosPopup(OutOfProcessIOSPopup outOfProcessIOSPopup) {
        outOfProcessIOSPopup.getClass();
        OutOfProcessIOSPopup outOfProcessIOSPopup2 = this.outOfProcessIosPopup_;
        if (outOfProcessIOSPopup2 != null && outOfProcessIOSPopup2 != OutOfProcessIOSPopup.getDefaultInstance()) {
            outOfProcessIOSPopup = OutOfProcessIOSPopup.newBuilder(this.outOfProcessIosPopup_).mergeFrom((OutOfProcessIOSPopup.C6451a) outOfProcessIOSPopup).buildPartial();
        }
        this.outOfProcessIosPopup_ = outOfProcessIOSPopup;
        this.bitField0_ |= 1;
    }

    public static C6452a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$OutOfProcessIOSPopupOptions parseDelimitedFrom(InputStream inputStream) {
        return (Common$OutOfProcessIOSPopupOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$OutOfProcessIOSPopupOptions parseFrom(ByteString byteString) {
        return (Common$OutOfProcessIOSPopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$OutOfProcessIOSPopupOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setOutOfProcessIosPopup(OutOfProcessIOSPopup outOfProcessIOSPopup) {
        outOfProcessIOSPopup.getClass();
        this.outOfProcessIosPopup_ = outOfProcessIOSPopup;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$OutOfProcessIOSPopupOptions();
            case 2:
                return new C6452a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "outOfProcessIosPopup_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$OutOfProcessIOSPopupOptions> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$OutOfProcessIOSPopupOptions.class) {
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

    public OutOfProcessIOSPopup getOutOfProcessIosPopup() {
        OutOfProcessIOSPopup outOfProcessIOSPopup = this.outOfProcessIosPopup_;
        return outOfProcessIOSPopup == null ? OutOfProcessIOSPopup.getDefaultInstance() : outOfProcessIOSPopup;
    }

    public boolean hasOutOfProcessIosPopup() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C6452a newBuilder(Common$OutOfProcessIOSPopupOptions common$OutOfProcessIOSPopupOptions) {
        return DEFAULT_INSTANCE.createBuilder(common$OutOfProcessIOSPopupOptions);
    }

    public static Common$OutOfProcessIOSPopupOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$OutOfProcessIOSPopupOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$OutOfProcessIOSPopupOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$OutOfProcessIOSPopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$OutOfProcessIOSPopupOptions parseFrom(CodedInputStream codedInputStream) {
        return (Common$OutOfProcessIOSPopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$OutOfProcessIOSPopupOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$OutOfProcessIOSPopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$OutOfProcessIOSPopupOptions parseFrom(InputStream inputStream) {
        return (Common$OutOfProcessIOSPopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$OutOfProcessIOSPopupOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$OutOfProcessIOSPopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$OutOfProcessIOSPopupOptions parseFrom(ByteBuffer byteBuffer) {
        return (Common$OutOfProcessIOSPopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$OutOfProcessIOSPopupOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$OutOfProcessIOSPopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$OutOfProcessIOSPopupOptions parseFrom(byte[] bArr) {
        return (Common$OutOfProcessIOSPopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$OutOfProcessIOSPopupOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$OutOfProcessIOSPopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
