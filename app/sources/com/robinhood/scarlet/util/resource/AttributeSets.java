package com.robinhood.scarlet.util.resource;

import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AttributeSets.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"styleAttributeOrNull", "", "Landroid/util/AttributeSet;", "getStyleAttributeOrNull", "(Landroid/util/AttributeSet;)Ljava/lang/Integer;", "lib-scarlet_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.scarlet.util.resource.AttributeSetsKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class AttributeSets {
    public static final Integer getStyleAttributeOrNull(AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(attributeSet, "<this>");
        Integer numValueOf = Integer.valueOf(attributeSet.getStyleAttribute());
        if (numValueOf.intValue() != 0) {
            return numValueOf;
        }
        return null;
    }
}
