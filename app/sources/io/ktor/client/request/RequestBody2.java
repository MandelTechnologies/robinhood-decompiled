package io.ktor.client.request;

import io.ktor.util.Attributes2;
import io.ktor.util.reflect.TypeInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RequestBody.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\" \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lio/ktor/util/AttributeKey;", "Lio/ktor/util/reflect/TypeInfo;", "BodyTypeAttributeKey", "Lio/ktor/util/AttributeKey;", "getBodyTypeAttributeKey", "()Lio/ktor/util/AttributeKey;", "ktor-client-core"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.ktor.client.request.RequestBodyKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class RequestBody2 {
    private static final Attributes2<TypeInfo> BodyTypeAttributeKey = new Attributes2<>("BodyTypeAttributeKey");

    public static final Attributes2<TypeInfo> getBodyTypeAttributeKey() {
        return BodyTypeAttributeKey;
    }
}
