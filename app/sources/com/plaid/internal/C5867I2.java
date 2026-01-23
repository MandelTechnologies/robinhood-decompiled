package com.plaid.internal;

import android.net.Uri;
import androidx.lifecycle.ViewModel;
import com.plaid.internal.AbstractC7207s6;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.I2 */
/* loaded from: classes16.dex */
public final class C5867I2 extends ViewModel {
    /* renamed from: a */
    public static AbstractC7207s6 m1215a(Uri uri) {
        if (uri == null) {
            return new AbstractC7207s6.d(new IllegalStateException("Redirect with no oauth state provided"));
        }
        if (Intrinsics.areEqual(uri.getHost(), "complete")) {
            String string2 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return new AbstractC7207s6.b(string2);
        }
        if (Intrinsics.areEqual(uri.getHost(), "redirect")) {
            String string3 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            return new AbstractC7207s6.a(string3);
        }
        if (Intrinsics.areEqual(uri.getHost(), "resume")) {
            return new AbstractC7207s6.e();
        }
        return new AbstractC7207s6.d(new IllegalStateException("Invalid redirect uri: " + uri));
    }
}
