package com.robinhood.utils.extensions;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Types.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0006\b\u0000\u0010\u0006\u0018\u0001H\u0086\bJ\u0011\u0010\u0007\u001a\u00020\b\"\u0006\b\u0000\u0010\u0006\u0018\u0001H\u0086\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/utils/extensions/Types;", "", "<init>", "()V", "typeToken", "Lcom/robinhood/utils/extensions/TypeToken;", "T", "typeLiteral", "Ljava/lang/reflect/Type;", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class Types {
    public static final Types INSTANCE = new Types();

    private Types() {
    }

    public final /* synthetic */ <T> Type typeLiteral() {
        Intrinsics.needClassReification();
        return new TypeToken<T>() { // from class: com.robinhood.utils.extensions.Types$typeLiteral$$inlined$typeToken$1
        }.getType();
    }

    public final /* synthetic */ <T> TypeToken<T> typeToken() {
        Intrinsics.needClassReification();
        return new TypeToken<T>() { // from class: com.robinhood.utils.extensions.Types.typeToken.1
        };
    }
}
