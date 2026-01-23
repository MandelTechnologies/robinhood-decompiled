package com.truelayer.payments.p419ui.utils;

import kotlin.Metadata;

/* compiled from: Navigation.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"Lcom/truelayer/payments/ui/utils/NavigationRoute;", "", "hasPermission", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.utils.NavigationRoute, reason: use source file name */
/* loaded from: classes12.dex */
public interface Navigation4 {

    /* compiled from: Navigation.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.truelayer.payments.ui.utils.NavigationRoute$DefaultImpls */
    public static final class DefaultImpls {
        public static boolean hasPermission(Navigation4 navigation4) {
            return true;
        }
    }

    boolean hasPermission();
}
