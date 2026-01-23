package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Configuration$EmbeddedComponentConfiguration extends GeneratedMessageLite<Configuration$EmbeddedComponentConfiguration, C6966a> implements MessageLiteOrBuilder {
    public static final int BUTTON_COMPONENT_CONFIGURATION_FIELD_NUMBER = 2;
    public static final int CHIP_COMPONENT_CONFIGURATION_FIELD_NUMBER = 3;
    private static final Configuration$EmbeddedComponentConfiguration DEFAULT_INSTANCE;
    public static final int INSTITUTION_SELECT_COMPONENT_CONFIGURATION_FIELD_NUMBER = 1;
    public static final int MINI_CARD_COMPONENT_CONFIGURATION_FIELD_NUMBER = 4;
    private static volatile Parser<Configuration$EmbeddedComponentConfiguration> PARSER;
    private int componentConfigurationCase_ = 0;
    private Object componentConfiguration_;

    public static final class ButtonComponentConfiguration extends GeneratedMessageLite<ButtonComponentConfiguration, C6962a> implements MessageLiteOrBuilder {
        private static final ButtonComponentConfiguration DEFAULT_INSTANCE;
        private static volatile Parser<ButtonComponentConfiguration> PARSER;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration$ButtonComponentConfiguration$a */
        public static final class C6962a extends GeneratedMessageLite.Builder<ButtonComponentConfiguration, C6962a> implements MessageLiteOrBuilder {
            public C6962a() {
                super(ButtonComponentConfiguration.DEFAULT_INSTANCE);
            }
        }

        static {
            ButtonComponentConfiguration buttonComponentConfiguration = new ButtonComponentConfiguration();
            DEFAULT_INSTANCE = buttonComponentConfiguration;
            GeneratedMessageLite.registerDefaultInstance(ButtonComponentConfiguration.class, buttonComponentConfiguration);
        }

        private ButtonComponentConfiguration() {
        }

        public static ButtonComponentConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6962a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ButtonComponentConfiguration parseDelimitedFrom(InputStream inputStream) {
            return (ButtonComponentConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ButtonComponentConfiguration parseFrom(ByteBuffer byteBuffer) {
            return (ButtonComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ButtonComponentConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C7025e.f2658a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ButtonComponentConfiguration();
                case 2:
                    return new C6962a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ButtonComponentConfiguration> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ButtonComponentConfiguration.class) {
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

        public static C6962a newBuilder(ButtonComponentConfiguration buttonComponentConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(buttonComponentConfiguration);
        }

        public static ButtonComponentConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ButtonComponentConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ButtonComponentConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ButtonComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ButtonComponentConfiguration parseFrom(ByteString byteString) {
            return (ButtonComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ButtonComponentConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ButtonComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ButtonComponentConfiguration parseFrom(byte[] bArr) {
            return (ButtonComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ButtonComponentConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ButtonComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ButtonComponentConfiguration parseFrom(InputStream inputStream) {
            return (ButtonComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ButtonComponentConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ButtonComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ButtonComponentConfiguration parseFrom(CodedInputStream codedInputStream) {
            return (ButtonComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ButtonComponentConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ButtonComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ChipComponentConfiguration extends GeneratedMessageLite<ChipComponentConfiguration, C6963a> implements MessageLiteOrBuilder {
        private static final ChipComponentConfiguration DEFAULT_INSTANCE;
        private static volatile Parser<ChipComponentConfiguration> PARSER;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration$ChipComponentConfiguration$a */
        public static final class C6963a extends GeneratedMessageLite.Builder<ChipComponentConfiguration, C6963a> implements MessageLiteOrBuilder {
            public C6963a() {
                super(ChipComponentConfiguration.DEFAULT_INSTANCE);
            }
        }

        static {
            ChipComponentConfiguration chipComponentConfiguration = new ChipComponentConfiguration();
            DEFAULT_INSTANCE = chipComponentConfiguration;
            GeneratedMessageLite.registerDefaultInstance(ChipComponentConfiguration.class, chipComponentConfiguration);
        }

        private ChipComponentConfiguration() {
        }

        public static ChipComponentConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6963a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ChipComponentConfiguration parseDelimitedFrom(InputStream inputStream) {
            return (ChipComponentConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChipComponentConfiguration parseFrom(ByteBuffer byteBuffer) {
            return (ChipComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ChipComponentConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C7025e.f2658a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ChipComponentConfiguration();
                case 2:
                    return new C6963a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ChipComponentConfiguration> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ChipComponentConfiguration.class) {
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

        public static C6963a newBuilder(ChipComponentConfiguration chipComponentConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(chipComponentConfiguration);
        }

        public static ChipComponentConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChipComponentConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ChipComponentConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ChipComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ChipComponentConfiguration parseFrom(ByteString byteString) {
            return (ChipComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ChipComponentConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ChipComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ChipComponentConfiguration parseFrom(byte[] bArr) {
            return (ChipComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ChipComponentConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ChipComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ChipComponentConfiguration parseFrom(InputStream inputStream) {
            return (ChipComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChipComponentConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChipComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ChipComponentConfiguration parseFrom(CodedInputStream codedInputStream) {
            return (ChipComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ChipComponentConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChipComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class InstitutionSelectComponentConfiguration extends GeneratedMessageLite<InstitutionSelectComponentConfiguration, C6964a> implements MessageLiteOrBuilder {
        private static final InstitutionSelectComponentConfiguration DEFAULT_INSTANCE;
        private static volatile Parser<InstitutionSelectComponentConfiguration> PARSER;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration$InstitutionSelectComponentConfiguration$a */
        public static final class C6964a extends GeneratedMessageLite.Builder<InstitutionSelectComponentConfiguration, C6964a> implements MessageLiteOrBuilder {
            public C6964a() {
                super(InstitutionSelectComponentConfiguration.DEFAULT_INSTANCE);
            }
        }

        static {
            InstitutionSelectComponentConfiguration institutionSelectComponentConfiguration = new InstitutionSelectComponentConfiguration();
            DEFAULT_INSTANCE = institutionSelectComponentConfiguration;
            GeneratedMessageLite.registerDefaultInstance(InstitutionSelectComponentConfiguration.class, institutionSelectComponentConfiguration);
        }

        private InstitutionSelectComponentConfiguration() {
        }

        public static InstitutionSelectComponentConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6964a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static InstitutionSelectComponentConfiguration parseDelimitedFrom(InputStream inputStream) {
            return (InstitutionSelectComponentConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InstitutionSelectComponentConfiguration parseFrom(ByteBuffer byteBuffer) {
            return (InstitutionSelectComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<InstitutionSelectComponentConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C7025e.f2658a[methodToInvoke.ordinal()]) {
                case 1:
                    return new InstitutionSelectComponentConfiguration();
                case 2:
                    return new C6964a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<InstitutionSelectComponentConfiguration> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (InstitutionSelectComponentConfiguration.class) {
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

        public static C6964a newBuilder(InstitutionSelectComponentConfiguration institutionSelectComponentConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(institutionSelectComponentConfiguration);
        }

        public static InstitutionSelectComponentConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstitutionSelectComponentConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InstitutionSelectComponentConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (InstitutionSelectComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static InstitutionSelectComponentConfiguration parseFrom(ByteString byteString) {
            return (InstitutionSelectComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static InstitutionSelectComponentConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (InstitutionSelectComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static InstitutionSelectComponentConfiguration parseFrom(byte[] bArr) {
            return (InstitutionSelectComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static InstitutionSelectComponentConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (InstitutionSelectComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static InstitutionSelectComponentConfiguration parseFrom(InputStream inputStream) {
            return (InstitutionSelectComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InstitutionSelectComponentConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstitutionSelectComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InstitutionSelectComponentConfiguration parseFrom(CodedInputStream codedInputStream) {
            return (InstitutionSelectComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static InstitutionSelectComponentConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstitutionSelectComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class MiniCardComponentConfiguration extends GeneratedMessageLite<MiniCardComponentConfiguration, C6965a> implements MessageLiteOrBuilder {
        private static final MiniCardComponentConfiguration DEFAULT_INSTANCE;
        private static volatile Parser<MiniCardComponentConfiguration> PARSER;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration$MiniCardComponentConfiguration$a */
        public static final class C6965a extends GeneratedMessageLite.Builder<MiniCardComponentConfiguration, C6965a> implements MessageLiteOrBuilder {
            public C6965a() {
                super(MiniCardComponentConfiguration.DEFAULT_INSTANCE);
            }
        }

        static {
            MiniCardComponentConfiguration miniCardComponentConfiguration = new MiniCardComponentConfiguration();
            DEFAULT_INSTANCE = miniCardComponentConfiguration;
            GeneratedMessageLite.registerDefaultInstance(MiniCardComponentConfiguration.class, miniCardComponentConfiguration);
        }

        private MiniCardComponentConfiguration() {
        }

        public static MiniCardComponentConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6965a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static MiniCardComponentConfiguration parseDelimitedFrom(InputStream inputStream) {
            return (MiniCardComponentConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MiniCardComponentConfiguration parseFrom(ByteBuffer byteBuffer) {
            return (MiniCardComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<MiniCardComponentConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C7025e.f2658a[methodToInvoke.ordinal()]) {
                case 1:
                    return new MiniCardComponentConfiguration();
                case 2:
                    return new C6965a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<MiniCardComponentConfiguration> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (MiniCardComponentConfiguration.class) {
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

        public static C6965a newBuilder(MiniCardComponentConfiguration miniCardComponentConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(miniCardComponentConfiguration);
        }

        public static MiniCardComponentConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MiniCardComponentConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MiniCardComponentConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MiniCardComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MiniCardComponentConfiguration parseFrom(ByteString byteString) {
            return (MiniCardComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MiniCardComponentConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MiniCardComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MiniCardComponentConfiguration parseFrom(byte[] bArr) {
            return (MiniCardComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MiniCardComponentConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MiniCardComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MiniCardComponentConfiguration parseFrom(InputStream inputStream) {
            return (MiniCardComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MiniCardComponentConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MiniCardComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MiniCardComponentConfiguration parseFrom(CodedInputStream codedInputStream) {
            return (MiniCardComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MiniCardComponentConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MiniCardComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration$a */
    public static final class C6966a extends GeneratedMessageLite.Builder<Configuration$EmbeddedComponentConfiguration, C6966a> implements MessageLiteOrBuilder {
        public C6966a() {
            super(Configuration$EmbeddedComponentConfiguration.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration$b */
    public enum EnumC6967b {
        INSTITUTION_SELECT_COMPONENT_CONFIGURATION(1),
        BUTTON_COMPONENT_CONFIGURATION(2),
        CHIP_COMPONENT_CONFIGURATION(3),
        MINI_CARD_COMPONENT_CONFIGURATION(4),
        COMPONENTCONFIGURATION_NOT_SET(0);


        /* renamed from: a */
        public final int f2626a;

        EnumC6967b(int i) {
            this.f2626a = i;
        }

        public static EnumC6967b forNumber(int i) {
            if (i == 0) {
                return COMPONENTCONFIGURATION_NOT_SET;
            }
            if (i == 1) {
                return INSTITUTION_SELECT_COMPONENT_CONFIGURATION;
            }
            if (i == 2) {
                return BUTTON_COMPONENT_CONFIGURATION;
            }
            if (i == 3) {
                return CHIP_COMPONENT_CONFIGURATION;
            }
            if (i != 4) {
                return null;
            }
            return MINI_CARD_COMPONENT_CONFIGURATION;
        }

        public int getNumber() {
            return this.f2626a;
        }

        @Deprecated
        public static EnumC6967b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        Configuration$EmbeddedComponentConfiguration configuration$EmbeddedComponentConfiguration = new Configuration$EmbeddedComponentConfiguration();
        DEFAULT_INSTANCE = configuration$EmbeddedComponentConfiguration;
        GeneratedMessageLite.registerDefaultInstance(Configuration$EmbeddedComponentConfiguration.class, configuration$EmbeddedComponentConfiguration);
    }

    private Configuration$EmbeddedComponentConfiguration() {
    }

    private void clearButtonComponentConfiguration() {
        if (this.componentConfigurationCase_ == 2) {
            this.componentConfigurationCase_ = 0;
            this.componentConfiguration_ = null;
        }
    }

    private void clearChipComponentConfiguration() {
        if (this.componentConfigurationCase_ == 3) {
            this.componentConfigurationCase_ = 0;
            this.componentConfiguration_ = null;
        }
    }

    private void clearComponentConfiguration() {
        this.componentConfigurationCase_ = 0;
        this.componentConfiguration_ = null;
    }

    private void clearInstitutionSelectComponentConfiguration() {
        if (this.componentConfigurationCase_ == 1) {
            this.componentConfigurationCase_ = 0;
            this.componentConfiguration_ = null;
        }
    }

    private void clearMiniCardComponentConfiguration() {
        if (this.componentConfigurationCase_ == 4) {
            this.componentConfigurationCase_ = 0;
            this.componentConfiguration_ = null;
        }
    }

    public static Configuration$EmbeddedComponentConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeButtonComponentConfiguration(ButtonComponentConfiguration buttonComponentConfiguration) {
        buttonComponentConfiguration.getClass();
        if (this.componentConfigurationCase_ != 2 || this.componentConfiguration_ == ButtonComponentConfiguration.getDefaultInstance()) {
            this.componentConfiguration_ = buttonComponentConfiguration;
        } else {
            this.componentConfiguration_ = ButtonComponentConfiguration.newBuilder((ButtonComponentConfiguration) this.componentConfiguration_).mergeFrom((ButtonComponentConfiguration.C6962a) buttonComponentConfiguration).buildPartial();
        }
        this.componentConfigurationCase_ = 2;
    }

    private void mergeChipComponentConfiguration(ChipComponentConfiguration chipComponentConfiguration) {
        chipComponentConfiguration.getClass();
        if (this.componentConfigurationCase_ != 3 || this.componentConfiguration_ == ChipComponentConfiguration.getDefaultInstance()) {
            this.componentConfiguration_ = chipComponentConfiguration;
        } else {
            this.componentConfiguration_ = ChipComponentConfiguration.newBuilder((ChipComponentConfiguration) this.componentConfiguration_).mergeFrom((ChipComponentConfiguration.C6963a) chipComponentConfiguration).buildPartial();
        }
        this.componentConfigurationCase_ = 3;
    }

    private void mergeInstitutionSelectComponentConfiguration(InstitutionSelectComponentConfiguration institutionSelectComponentConfiguration) {
        institutionSelectComponentConfiguration.getClass();
        if (this.componentConfigurationCase_ != 1 || this.componentConfiguration_ == InstitutionSelectComponentConfiguration.getDefaultInstance()) {
            this.componentConfiguration_ = institutionSelectComponentConfiguration;
        } else {
            this.componentConfiguration_ = InstitutionSelectComponentConfiguration.newBuilder((InstitutionSelectComponentConfiguration) this.componentConfiguration_).mergeFrom((InstitutionSelectComponentConfiguration.C6964a) institutionSelectComponentConfiguration).buildPartial();
        }
        this.componentConfigurationCase_ = 1;
    }

    private void mergeMiniCardComponentConfiguration(MiniCardComponentConfiguration miniCardComponentConfiguration) {
        miniCardComponentConfiguration.getClass();
        if (this.componentConfigurationCase_ != 4 || this.componentConfiguration_ == MiniCardComponentConfiguration.getDefaultInstance()) {
            this.componentConfiguration_ = miniCardComponentConfiguration;
        } else {
            this.componentConfiguration_ = MiniCardComponentConfiguration.newBuilder((MiniCardComponentConfiguration) this.componentConfiguration_).mergeFrom((MiniCardComponentConfiguration.C6965a) miniCardComponentConfiguration).buildPartial();
        }
        this.componentConfigurationCase_ = 4;
    }

    public static C6966a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Configuration$EmbeddedComponentConfiguration parseDelimitedFrom(InputStream inputStream) {
        return (Configuration$EmbeddedComponentConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$EmbeddedComponentConfiguration parseFrom(ByteBuffer byteBuffer) {
        return (Configuration$EmbeddedComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Configuration$EmbeddedComponentConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setButtonComponentConfiguration(ButtonComponentConfiguration buttonComponentConfiguration) {
        buttonComponentConfiguration.getClass();
        this.componentConfiguration_ = buttonComponentConfiguration;
        this.componentConfigurationCase_ = 2;
    }

    private void setChipComponentConfiguration(ChipComponentConfiguration chipComponentConfiguration) {
        chipComponentConfiguration.getClass();
        this.componentConfiguration_ = chipComponentConfiguration;
        this.componentConfigurationCase_ = 3;
    }

    private void setInstitutionSelectComponentConfiguration(InstitutionSelectComponentConfiguration institutionSelectComponentConfiguration) {
        institutionSelectComponentConfiguration.getClass();
        this.componentConfiguration_ = institutionSelectComponentConfiguration;
        this.componentConfigurationCase_ = 1;
    }

    private void setMiniCardComponentConfiguration(MiniCardComponentConfiguration miniCardComponentConfiguration) {
        miniCardComponentConfiguration.getClass();
        this.componentConfiguration_ = miniCardComponentConfiguration;
        this.componentConfigurationCase_ = 4;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C7025e.f2658a[methodToInvoke.ordinal()]) {
            case 1:
                return new Configuration$EmbeddedComponentConfiguration();
            case 2:
                return new C6966a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"componentConfiguration_", "componentConfigurationCase_", InstitutionSelectComponentConfiguration.class, ButtonComponentConfiguration.class, ChipComponentConfiguration.class, MiniCardComponentConfiguration.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Configuration$EmbeddedComponentConfiguration> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Configuration$EmbeddedComponentConfiguration.class) {
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

    public ButtonComponentConfiguration getButtonComponentConfiguration() {
        return this.componentConfigurationCase_ == 2 ? (ButtonComponentConfiguration) this.componentConfiguration_ : ButtonComponentConfiguration.getDefaultInstance();
    }

    public ChipComponentConfiguration getChipComponentConfiguration() {
        return this.componentConfigurationCase_ == 3 ? (ChipComponentConfiguration) this.componentConfiguration_ : ChipComponentConfiguration.getDefaultInstance();
    }

    public EnumC6967b getComponentConfigurationCase() {
        return EnumC6967b.forNumber(this.componentConfigurationCase_);
    }

    public InstitutionSelectComponentConfiguration getInstitutionSelectComponentConfiguration() {
        return this.componentConfigurationCase_ == 1 ? (InstitutionSelectComponentConfiguration) this.componentConfiguration_ : InstitutionSelectComponentConfiguration.getDefaultInstance();
    }

    public MiniCardComponentConfiguration getMiniCardComponentConfiguration() {
        return this.componentConfigurationCase_ == 4 ? (MiniCardComponentConfiguration) this.componentConfiguration_ : MiniCardComponentConfiguration.getDefaultInstance();
    }

    public boolean hasButtonComponentConfiguration() {
        return this.componentConfigurationCase_ == 2;
    }

    public boolean hasChipComponentConfiguration() {
        return this.componentConfigurationCase_ == 3;
    }

    public boolean hasInstitutionSelectComponentConfiguration() {
        return this.componentConfigurationCase_ == 1;
    }

    public boolean hasMiniCardComponentConfiguration() {
        return this.componentConfigurationCase_ == 4;
    }

    public static C6966a newBuilder(Configuration$EmbeddedComponentConfiguration configuration$EmbeddedComponentConfiguration) {
        return DEFAULT_INSTANCE.createBuilder(configuration$EmbeddedComponentConfiguration);
    }

    public static Configuration$EmbeddedComponentConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$EmbeddedComponentConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$EmbeddedComponentConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$EmbeddedComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Configuration$EmbeddedComponentConfiguration parseFrom(ByteString byteString) {
        return (Configuration$EmbeddedComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Configuration$EmbeddedComponentConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$EmbeddedComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Configuration$EmbeddedComponentConfiguration parseFrom(byte[] bArr) {
        return (Configuration$EmbeddedComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Configuration$EmbeddedComponentConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$EmbeddedComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Configuration$EmbeddedComponentConfiguration parseFrom(InputStream inputStream) {
        return (Configuration$EmbeddedComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$EmbeddedComponentConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$EmbeddedComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$EmbeddedComponentConfiguration parseFrom(CodedInputStream codedInputStream) {
        return (Configuration$EmbeddedComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Configuration$EmbeddedComponentConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$EmbeddedComponentConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
