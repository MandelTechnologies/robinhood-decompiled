package com.robinhood.enums;

import com.robinhood.enums.RhIntEnum;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhIntEnum.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"A\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0018\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00058F¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"converter", "Lcom/robinhood/enums/RhIntEnum$Converter;", "E", "", "Lcom/robinhood/enums/RhIntEnum;", "Ljava/lang/Class;", "getConverter$annotations", "(Ljava/lang/Class;)V", "getConverter", "(Ljava/lang/Class;)Lcom/robinhood/enums/RhIntEnum$Converter;", "lib-enums_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.enums.RhIntEnumKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class RhIntEnum2 {
    public static /* synthetic */ void getConverter$annotations(Class cls) {
    }

    public static final <E extends Enum<E> & RhIntEnum<E>> RhIntEnum.Converter<E> getConverter(Class<E> cls) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Object obj = cls.getDeclaredField("Companion").get(null);
        RhIntEnum.Converter<E> converter = obj instanceof RhIntEnum.Converter ? (RhIntEnum.Converter) obj : null;
        if (converter != null) {
            return converter;
        }
        throw new UnsupportedOperationException(cls + " companion must implement Converter");
    }
}
