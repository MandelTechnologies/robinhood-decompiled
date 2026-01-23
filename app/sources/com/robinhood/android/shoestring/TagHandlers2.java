package com.robinhood.android.shoestring;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TagHandlers.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¨\u0006\u0004"}, m3636d2 = {"plus", "Lcom/robinhood/android/shoestring/TagHandlers;", "Lcom/robinhood/android/shoestring/TagHandler;", "other", "lib-shoestring_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.shoestring.TagHandlersKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class TagHandlers2 {
    public static final TagHandlers plus(TagHandler tagHandler, TagHandler other) {
        Intrinsics.checkNotNullParameter(tagHandler, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new TagHandlers(tagHandler, other);
    }
}
