package com.robinhood.rosetta.eventlogging;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClientTestResult.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientTestResult;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DEFAULT_TEST_RESULT", "TEST_PASSED", "TEST_FAILED", "TEST_SKIPPED", "TEST_NOT_WRITTEN", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ClientTestResult implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ClientTestResult[] $VALUES;

    @JvmField
    public static final ProtoAdapter<ClientTestResult> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ClientTestResult DEFAULT_TEST_RESULT;
    public static final ClientTestResult TEST_FAILED;
    public static final ClientTestResult TEST_NOT_WRITTEN;
    public static final ClientTestResult TEST_PASSED;
    public static final ClientTestResult TEST_SKIPPED;
    private final int value;

    private static final /* synthetic */ ClientTestResult[] $values() {
        return new ClientTestResult[]{DEFAULT_TEST_RESULT, TEST_PASSED, TEST_FAILED, TEST_SKIPPED, TEST_NOT_WRITTEN};
    }

    @JvmStatic
    public static final ClientTestResult fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<ClientTestResult> getEntries() {
        return $ENTRIES;
    }

    private ClientTestResult(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final ClientTestResult clientTestResult = new ClientTestResult("DEFAULT_TEST_RESULT", 0, 0);
        DEFAULT_TEST_RESULT = clientTestResult;
        TEST_PASSED = new ClientTestResult("TEST_PASSED", 1, 1);
        TEST_FAILED = new ClientTestResult("TEST_FAILED", 2, 2);
        TEST_SKIPPED = new ClientTestResult("TEST_SKIPPED", 3, 3);
        TEST_NOT_WRITTEN = new ClientTestResult("TEST_NOT_WRITTEN", 4, 4);
        ClientTestResult[] clientTestResultArr$values = $values();
        $VALUES = clientTestResultArr$values;
        $ENTRIES = EnumEntries2.enumEntries(clientTestResultArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientTestResult.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<ClientTestResult>(orCreateKotlinClass, syntax, clientTestResult) { // from class: com.robinhood.rosetta.eventlogging.ClientTestResult$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public ClientTestResult fromValue(int value) {
                return ClientTestResult.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: ClientTestResult.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientTestResult$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/ClientTestResult;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ClientTestResult fromValue(int value) {
            if (value == 0) {
                return ClientTestResult.DEFAULT_TEST_RESULT;
            }
            if (value == 1) {
                return ClientTestResult.TEST_PASSED;
            }
            if (value == 2) {
                return ClientTestResult.TEST_FAILED;
            }
            if (value == 3) {
                return ClientTestResult.TEST_SKIPPED;
            }
            if (value != 4) {
                return null;
            }
            return ClientTestResult.TEST_NOT_WRITTEN;
        }
    }

    public static ClientTestResult valueOf(String str) {
        return (ClientTestResult) Enum.valueOf(ClientTestResult.class, str);
    }

    public static ClientTestResult[] values() {
        return (ClientTestResult[]) $VALUES.clone();
    }
}
