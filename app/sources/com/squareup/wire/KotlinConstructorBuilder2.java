package com.squareup.wire;

import kotlin.Metadata;

/* compiled from: KotlinConstructorBuilder.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"isMap", "", "Lcom/squareup/wire/WireField;", "(Lcom/squareup/wire/WireField;)Z", "wire-runtime"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.squareup.wire.KotlinConstructorBuilderKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class KotlinConstructorBuilder2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isMap(WireField wireField) {
        return wireField.keyAdapter().length() > 0;
    }
}
