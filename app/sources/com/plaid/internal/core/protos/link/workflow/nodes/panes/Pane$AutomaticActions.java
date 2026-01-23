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
import java.util.List;

/* loaded from: classes24.dex */
public final class Pane$AutomaticActions extends GeneratedMessageLite<Pane$AutomaticActions, C6721a> implements MessageLiteOrBuilder {
    private static final Pane$AutomaticActions DEFAULT_INSTANCE;
    public static final int ON_APPEAR_FIELD_NUMBER = 1;
    private static volatile Parser<Pane$AutomaticActions> PARSER;
    private Internal.ProtobufList<Common$LocalAction> onAppear_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$AutomaticActions$a */
    public static final class C6721a extends GeneratedMessageLite.Builder<Pane$AutomaticActions, C6721a> implements MessageLiteOrBuilder {
        public C6721a() {
            super(Pane$AutomaticActions.DEFAULT_INSTANCE);
        }
    }

    static {
        Pane$AutomaticActions pane$AutomaticActions = new Pane$AutomaticActions();
        DEFAULT_INSTANCE = pane$AutomaticActions;
        GeneratedMessageLite.registerDefaultInstance(Pane$AutomaticActions.class, pane$AutomaticActions);
    }

    private Pane$AutomaticActions() {
    }

    private void addAllOnAppear(Iterable<? extends Common$LocalAction> iterable) {
        ensureOnAppearIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.onAppear_);
    }

    private void addOnAppear(Common$LocalAction common$LocalAction) {
        common$LocalAction.getClass();
        ensureOnAppearIsMutable();
        this.onAppear_.add(common$LocalAction);
    }

    private void clearOnAppear() {
        this.onAppear_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureOnAppearIsMutable() {
        Internal.ProtobufList<Common$LocalAction> protobufList = this.onAppear_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.onAppear_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Pane$AutomaticActions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6721a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Pane$AutomaticActions parseDelimitedFrom(InputStream inputStream) {
        return (Pane$AutomaticActions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Pane$AutomaticActions parseFrom(ByteBuffer byteBuffer) {
        return (Pane$AutomaticActions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Pane$AutomaticActions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeOnAppear(int i) {
        ensureOnAppearIsMutable();
        this.onAppear_.remove(i);
    }

    private void setOnAppear(int i, Common$LocalAction common$LocalAction) {
        common$LocalAction.getClass();
        ensureOnAppearIsMutable();
        this.onAppear_.set(i, common$LocalAction);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6924m0.f2570a[methodToInvoke.ordinal()]) {
            case 1:
                return new Pane$AutomaticActions();
            case 2:
                return new C6721a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"onAppear_", Common$LocalAction.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Pane$AutomaticActions> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Pane$AutomaticActions.class) {
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

    public Common$LocalAction getOnAppear(int i) {
        return this.onAppear_.get(i);
    }

    public int getOnAppearCount() {
        return this.onAppear_.size();
    }

    public List<Common$LocalAction> getOnAppearList() {
        return this.onAppear_;
    }

    public InterfaceC6297B getOnAppearOrBuilder(int i) {
        return this.onAppear_.get(i);
    }

    public List<? extends InterfaceC6297B> getOnAppearOrBuilderList() {
        return this.onAppear_;
    }

    public static C6721a newBuilder(Pane$AutomaticActions pane$AutomaticActions) {
        return DEFAULT_INSTANCE.createBuilder(pane$AutomaticActions);
    }

    public static Pane$AutomaticActions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$AutomaticActions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Pane$AutomaticActions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$AutomaticActions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Pane$AutomaticActions parseFrom(ByteString byteString) {
        return (Pane$AutomaticActions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addOnAppear(int i, Common$LocalAction common$LocalAction) {
        common$LocalAction.getClass();
        ensureOnAppearIsMutable();
        this.onAppear_.add(i, common$LocalAction);
    }

    public static Pane$AutomaticActions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$AutomaticActions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Pane$AutomaticActions parseFrom(byte[] bArr) {
        return (Pane$AutomaticActions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Pane$AutomaticActions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$AutomaticActions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Pane$AutomaticActions parseFrom(InputStream inputStream) {
        return (Pane$AutomaticActions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Pane$AutomaticActions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$AutomaticActions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Pane$AutomaticActions parseFrom(CodedInputStream codedInputStream) {
        return (Pane$AutomaticActions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Pane$AutomaticActions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$AutomaticActions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
