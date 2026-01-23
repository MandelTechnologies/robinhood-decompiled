package com.robinhood.enums;

import com.robinhood.enums.RhEnum;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhEnum.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"A\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0018\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00058F¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"converter", "Lcom/robinhood/enums/RhEnum$Converter;", "E", "", "Lcom/robinhood/enums/RhEnum;", "Ljava/lang/Class;", "getConverter$annotations", "(Ljava/lang/Class;)V", "getConverter", "(Ljava/lang/Class;)Lcom/robinhood/enums/RhEnum$Converter;", "lib-enums_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.enums.RhEnumKt, reason: use source file name */
/* loaded from: classes20.dex */
public final class RhEnum2 {
    public static /* synthetic */ void getConverter$annotations(Class cls) {
    }

    public static final <E extends Enum<E> & RhEnum<E>> RhEnum.Converter<E> getConverter(Class<E> cls) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Object obj = cls.getDeclaredField("Companion").get(null);
        RhEnum.Converter<E> converter = obj instanceof RhEnum.Converter ? (RhEnum.Converter) obj : null;
        if (converter != null) {
            return converter;
        }
        throw new UnsupportedOperationException(cls + " companion must implement Converter");
    }
}
