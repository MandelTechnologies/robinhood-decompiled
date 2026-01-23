package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* compiled from: EnumEntriesDeserializationSupport.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.JvmEnumEntriesDeserializationSupport, reason: use source file name */
/* loaded from: classes21.dex */
public final class EnumEntriesDeserializationSupport2 implements EnumEntriesDeserializationSupport {
    public static final EnumEntriesDeserializationSupport2 INSTANCE = new EnumEntriesDeserializationSupport2();

    private EnumEntriesDeserializationSupport2() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.EnumEntriesDeserializationSupport
    public Boolean canSynthesizeEnumEntries() {
        return Boolean.TRUE;
    }
}
