package com.robinhood.utils.extensions;

import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Randoms.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"sample", "T", "Ljava/util/Random;", "list", "", "(Ljava/util/Random;Ljava/util/List;)Ljava/lang/Object;", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.RandomsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Randoms2 {
    public static final <T> T sample(Random random, List<? extends T> list) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        Intrinsics.checkNotNullParameter(list, "list");
        return list.get(random.nextInt(list.size()));
    }
}
