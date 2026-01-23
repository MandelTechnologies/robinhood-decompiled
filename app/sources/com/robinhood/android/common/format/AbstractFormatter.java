package com.robinhood.android.common.format;

import android.content.res.Resources;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AbstractFormatter.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0004J/\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\r\"\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0004J\u001a\u0010\u0011\u001a\u00020\t2\b\b\u0001\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/common/format/AbstractFormatter;", "", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "getResources", "()Landroid/content/res/Resources;", "getString", "", "resId", "", "formatArgs", "", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getText", "", "getQuantityString", "id", "quantity", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public class AbstractFormatter {
    public static final int $stable = 8;
    private final Resources resources;

    public AbstractFormatter(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    protected final Resources getResources() {
        return this.resources;
    }

    protected final String getString(int resId) throws Resources.NotFoundException {
        String string2 = this.resources.getString(resId);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    protected final String getString(int resId, Object... formatArgs) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        String string2 = this.resources.getString(resId, Arrays.copyOf(formatArgs, formatArgs.length));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    protected final CharSequence getText(int resId) throws Resources.NotFoundException {
        CharSequence text = this.resources.getText(resId);
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return text;
    }

    protected final String getQuantityString(int id, int quantity) throws Resources.NotFoundException {
        String quantityString = this.resources.getQuantityString(id, quantity);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return quantityString;
    }
}
