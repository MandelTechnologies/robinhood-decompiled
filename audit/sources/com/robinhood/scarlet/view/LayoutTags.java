package com.robinhood.scarlet.view;

import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LayoutTags.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/scarlet/view/LayoutTags;", "", "<init>", "()V", "getViewName", "", "tagName", "attrs", "Landroid/util/AttributeSet;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class LayoutTags {
    public static final int $stable = 0;
    public static final LayoutTags INSTANCE = new LayoutTags();

    private LayoutTags() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getViewName(String tagName, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        switch (tagName.hashCode()) {
            case -1650269616:
                if (tagName.equals("fragment")) {
                    return null;
                }
                return tagName;
            case -1109722326:
                if (!tagName.equals("layout")) {
                }
                break;
            case 3619493:
                if (tagName.equals("view")) {
                    if (attrs != null) {
                        return attrs.getClassAttribute();
                    }
                    return null;
                }
                return tagName;
            case 103785528:
                if (tagName.equals("merge")) {
                }
                break;
            case 1942574248:
                if (!tagName.equals("include")) {
                }
                break;
        }
    }
}
