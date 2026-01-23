package com.robinhood.scarlet.util;

import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ElementProperties.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.scarlet.util.ElementProperties$obtainStyledResources$1$1$contents$1, reason: use source file name */
/* loaded from: classes21.dex */
/* synthetic */ class ElementProperties2 extends FunctionReferenceImpl implements Function1<Integer, String> {
    ElementProperties2(Object obj) {
        super(1, obj, Resources.class, "getResourceName", "getResourceName(I)Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ String invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final String invoke(int i) {
        return ((Resources) this.receiver).getResourceName(i);
    }
}
